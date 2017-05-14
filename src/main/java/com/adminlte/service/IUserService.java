package com.adminlte.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.adminlte.pojo.User;
import com.adminlte.pojo.vo.UserVo;
import com.adminlte.result.DatatablesResult;
import com.baomidou.mybatisplus.service.IService;

public interface IUserService extends IService <User>{
	List<User> selectByLoginName(UserVo uservo);
	
	DatatablesResult<UserVo> selectUserVo(UserVo userVo, Integer page, Integer rows, Integer draw);

	Boolean deleteUserById(String id);
}
