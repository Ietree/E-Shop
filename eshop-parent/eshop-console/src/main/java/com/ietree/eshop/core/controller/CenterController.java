package com.ietree.eshop.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理
 *
 * @author Root
 */
@Controller
@RequestMapping(value = "/control")
public class CenterController {
	/**
	 * 返回值类型： 1、 ModelAndView ：跳转视图 + 数据 一般不用 2、void ：异步时ajax请求 3、String ：跳转视图 +
	 * Model
	 */
	@RequestMapping(value = "/index")
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(value = "/top")
	public String top(Model model) {
		return "top";
	}

	@RequestMapping(value = "/main")
	public String main(Model model) {
		return "main";
	}

	@RequestMapping(value = "/left")
	public String left(Model model) {
		return "left";
	}

	@RequestMapping(value = "/right")
	public String right(Model model) {
		return "right";
	}

	@RequestMapping(value = "/frame/product_main")
	public String productMain(Model model) {
		return "frame/product_main";
	}

	@RequestMapping(value = "/frame/order_main")
	public String orderMain(Model model) {
		return "frame/order_main";
	}

	@RequestMapping(value = "/frame/product_left")
	public String productLeft(Model model) {
		return "frame/product_left";
	}

}
