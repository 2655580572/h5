package com.test.dao;
import java.util.List;
import java.util.Map;

import com.test.po.Param;
import com.test.po.ParamMinMax;
import com.test.po.ParamUpdate1;
import com.test.po.Teacher;
public interface TeacherMapper {
	public Teacher selectTeacherByPrimaryKeyId(int id);
	public List<Teacher> selectAllTeacher();
	public List<Teacher> selectTeachersByName(String name);
	public List<Teacher> selectTeachersByNameAgeSex(Teacher teacher);
	public List<Teacher> selectTeachersByNameAgeSex2(Param param);
	public List<Teacher> selectTeacherByminmaxAge(ParamMinMax paramMinMax);
	public int count();
	public void insert(Teacher teacher);
	public void deleteById(int id);
	public void update1(ParamUpdate1 paramUpdate1);
}
