package com.hexudong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hexudong.entity.User;
import com.hexudong.service.UserService;
@Controller
public class UserController {

	@Autowired
	private UserService service;
	/**
	 * 
	    * @Title: list
	    * @Description: 列表
	    * @param @param m
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@RequestMapping("list")
	private String getList(Model m) {
		List<User> list = service.getList();
		m.addAttribute("list", list);
		return "list";
	}
	
}
