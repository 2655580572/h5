package com.test.dao;

import java.util.List;

import com.test.po.Stu;

public interface StuMapper {
     
    int deleteByPrimaryKey(Integer id);
 
    int insert(Stu record);
 
    int insertSelective(Stu record);
 
    Stu selectByPrimaryKey(Integer id);
 
    int updateByPrimaryKeySelective(Stu record);
 
    int updateByPrimaryKey(Stu record);
    /**查出所有的学生*/
    List<Stu> selectAllStu();
}