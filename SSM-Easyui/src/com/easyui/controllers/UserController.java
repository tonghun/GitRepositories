package com.easyui.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.easyui.beans.Page;
import com.easyui.beans.User;
import com.easyui.service.IUserService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping()
public class UserController {

	@Autowired
	IUserService service;

	@RequestMapping("/add.do")
	public void addUser(HttpServletResponse response, HttpServletRequest request, User user) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		JSONObject json = new JSONObject();
		int addCount = service.addUser(user);
		if (addCount == 1) {
			json.put("success", true);
		} else {
			json.put("success", false);
			json.put("errorMsg", "保存失败");
		}
		out.write(json.toString());
	}

	@RequestMapping("/delete.do")
	public void deleteUser(HttpServletResponse response, HttpServletRequest request, int id) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		JSONObject json = new JSONObject();
		int count = service.removeUser(id);
		if (count == 1) {
			json.put("success", true);
		} else {
			json.put("success", false);
			json.put("errorMsg", "删除失败");
		}
		out.write(json.toString());
	}

	@RequestMapping("/edit.do")
	public void editUser(HttpServletResponse response, HttpServletRequest request, User user) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		JSONObject json = new JSONObject();
		int count = service.modifyUser(user);
		if (count == 1) {
			json.put("success", true);
		} else {
			json.put("success", false);
			json.put("errorMsg", "修改失败");
		}
		out.write(json.toString());
	}

	@RequestMapping("/find.do")
	public void findUser(HttpServletResponse response, HttpServletRequest request, Page page) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		List<User> users = service.limitUsers(page);
		int total = service.findCount();
		JSONObject json = new JSONObject();
		json.put("rows", users);
		json.put("total", total);
		out.write(json.toString());
	}

}
