package com.ietree.eshop.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ietree.eshop.core.bean.TestTb;
import com.ietree.eshop.core.service.TestTbService;

/**
 * 后台管理
 *
 * @author Root
 */
@Controller
public class CenterController {

	@Autowired
	private TestTbService testTbService;

	/**
	 * 返回值类型： 1、 ModelAndView ：跳转视图 + 数据 一般不用 2、void ：异步时ajax请求 3、String ：跳转视图 +
	 * Model
	 */
	@RequestMapping(value = "/test/index.do")
	public String index(Model model) {
		List<TestTb> list = testTbService.getAllBrands();
		for (TestTb testTb : list) {
			System.out.println(testTb.toString());
		}
		return "index";
	}

}
