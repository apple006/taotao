/**
 * 
 */
package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HuangQinJian ����12:43:55 2017��4��2��
 */
@Controller
public class PageController {
	/*
	 * ҳ����ת������ҳ
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

	/*
	 * չʾ����ҳ��
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
}
