package com.adminlte.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.adminlte.commons.utils.ResponseVo;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.adminlte.commons.utils.StringEscapeEditor;
import com.adminlte.shiro.ShiroUser;


public abstract class BaseController {

	protected static final  String SESSION_USER = "pay_user";
	protected final  int successCode = 1;
	protected final  int errorCode = 0;
	protected final  String FAIL = "fail";
	protected final  String SUCCESS = "success";

	protected ResponseVo getResponseData(Boolean result,String resultMsg,  Object resultObj) {
		ResponseVo response = new ResponseVo();
		response.setSuccess(result);
		response.setMsg(resultMsg);
		response.setData(resultObj);
		return response;
	}




	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		
		/**
		 * 自动转换日期类型的字段格式
		 */
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
		/**
         * 防止XSS攻击
         */
        binder.registerCustomEditor(String.class, new StringEscapeEditor());
	}

	/**
	 * 获取当前登录用户对象
	 * 
	 * @return {ShiroUser}
	 */
	public ShiroUser getShiroUser() {
		return (ShiroUser) SecurityUtils.getSubject().getPrincipal();
	}

	/**
	 * 获取当前登录用户id
	 * 
	 * @return {Long}
	 */
	public Long getUserId() {
		return this.getShiroUser().getId();
	}

	/**
	 * 获取当前登录用户名
	 * 
	 * @return {String}
	 */
	public String getStaffName() {
		return this.getShiroUser().getName();
	}

}
