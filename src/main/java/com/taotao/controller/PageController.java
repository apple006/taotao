/**
 * 
 */
package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HuangQinJian 下午12:43:55 2017年4月2日
 */
@Controller
public class PageController {
	/*
	 * 页面跳转，打开首页
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

	/*
	 * 展示其他页面
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
}
