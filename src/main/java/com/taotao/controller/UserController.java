/**
 * 
 */
package com.taotao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taotao.model.User;
import com.taotao.service.UserServiceI;

/**
 * @author HuangQinJian 下午12:01:54 2017年3月30日
 */
@Controller
@RequestMapping("/userController")
public class UserController {
	@Autowired
	private UserServiceI userServiceI;

	@RequestMapping("/showUser")
	public String showUser(Long id, HttpServletRequest request) {
		User u = userServiceI.getUserById(id);
		request.setAttribute("user", u);
		return "showUser";
	}
}
