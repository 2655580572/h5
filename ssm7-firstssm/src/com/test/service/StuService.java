package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.StuMapper;
import com.test.po.Stu;

@Service
public class StuService {
	private StuMapper stuMapper;
	
	public StuMapper getStuMapper() {
		return stuMapper;
	}
	@Autowired
	public void setStuMapper(StuMapper stuMapper) {
		this.stuMapper = stuMapper;
	}
	/**得到所有的学生*/
	public List<Stu> getAllStu() {
		List<Stu> list = this.stuMapper.selectAllStu();
		return list;
	}
}
