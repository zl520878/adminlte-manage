package com.adminlte.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adminlte.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adminlte.commons.utils.StringUtils;
import com.adminlte.pojo.vo.UserVo;
import com.adminlte.result.DatatablesResult;
import com.adminlte.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

/**
 * 用户管理
 * @author wuyudong
 *
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	@Autowired
	private IUserService userService;
	
	/**
	 * 用户管理页
	 * @return
	 */
	@RequestMapping("/manager")
	public String manager() {
		return "user/manager";
	}
	
	@RequestMapping(value = "/dataGrid", method = RequestMethod.POST)
	public ResponseEntity<DatatablesResult> queryListByCategoryId(
			UserVo userVo,
			@RequestParam(value = "draw") String draw,
			@RequestParam(value = "start") String start,
			@RequestParam(value = "length") String length) {
		int rows = Integer.parseInt(length);
		int page = (Integer.parseInt(start) / rows) + 1;
		try {
			DatatablesResult datatablesResult = this.userService.selectUserVo(userVo, page, rows, Integer.parseInt(draw) );
			return ResponseEntity.ok(datatablesResult);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(null);
	}
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ResponseEntity<Map<String,Object>> deleteUserById(@RequestParam(value = "id") String id) {
		try {
			Boolean bool = userService.deleteUserById(id);
			Map<String,Object> rsMap = new HashMap<>();
			rsMap.put("status",1);
			if (bool) {
				return ResponseEntity.ok(rsMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(null);
	}

}
