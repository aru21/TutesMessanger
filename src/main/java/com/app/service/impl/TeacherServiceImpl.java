package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.DAO.TeacherDAO;
import com.app.pojo.Institute;
import com.app.pojo.Login;
import com.app.pojo.Teacher;
import com.app.service.TeacherService;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	TeacherDAO TeacherDAO;

	@Override
	public void create(Teacher teacher) {
		TeacherDAO.create(teacher);

	}

	@Override
	public void update(Teacher teacher) {
		TeacherDAO.update(teacher);

	}

	@Override
	public Teacher edit(int id) {
		return TeacherDAO.edit(id);
	}

	@Override
	public void delet(int id) {
		TeacherDAO.delet(id);

	}

	@Override
	public Teacher find(int id) {
		
		return TeacherDAO.find(id);
	}

	@Override
	public List<Teacher> getall() {
		return TeacherDAO.getall();
	}

	@Override
	public Teacher findByLoginId(int id) {
		
		return TeacherDAO.findByLoginId(id);
	}

	@Override
	public Institute GetInstitute(int id) {
		
		return TeacherDAO.GetInstitute(id);
	}

	@Override
	public Login getLoginIdByEmail(String email) {
		return TeacherDAO.getLoginIdByEmail(email);
		
	}

	@Override
	public void changePassword(String newPassword , Login login) {
		TeacherDAO.changePassword(newPassword , login);
		
	}

	@Override
	public Boolean checkPassword(String oldPassword, Integer id) {
		return  TeacherDAO.checkPassword( oldPassword,  id);
		
	}

}
