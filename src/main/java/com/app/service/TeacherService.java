package com.app.service;

import java.util.List;

import com.app.pojo.Teacher;

public interface TeacherService {
	
	public void create(Teacher teacher);
	public void update(Teacher teacher);
	public Teacher edit(int id);
	public void delet(int id );
	public Teacher find(int id);
	public Teacher findByLoginId(int id);
	public List<Teacher> getall();

}
