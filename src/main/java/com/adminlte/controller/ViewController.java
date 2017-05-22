package com.adminlte.controller;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 视图
 * @author zhangliang
 *
 */
@Controller
public class ViewController {

	/**
	 * 登录页面
	 * 
	 * @return
	 */
	@RequestMapping("/login")
	public String login() {
		if (SecurityUtils.getSubject().isAuthenticated()) {
			return "index";
		}
		return "login";
	}
	
	/**
	 * 主页面
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	/**
	 * 右边页
	 * 
	 * @return
	 */
	@RequestMapping("/welcome_iframe")
	public String welcome() {
		return "welcome_iframe";
	}

	/**
	 * 个人信息页
	 *  
	 * @return
	 */
	
	@RequestMapping("/profile")
	public String profile() {
		return "profile";
	}
	
}
