package com.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.po.Stu;
import com.test.service.StuService;

@Controller
public class StuController {
	private StuService stuService;
	public StuService getStuService() {
		return stuService;
	}
	@Autowired
	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}
	@RequestMapping(value="/stu/getAllStu.do")
	public String getAllStu(HttpServletRequest req) {
		List<Stu> list = this.stuService.getAllStu();//得到所有的学生
		req.setAttribute("stues", list);
		return "stu";//转发stu.jsp
	}
}















