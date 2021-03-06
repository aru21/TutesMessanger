package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.app.pojo.Login;
import com.app.pojo.Role;
import com.app.pojo.Teacher;
import com.app.service.InstituteService;
import com.app.service.LoginService;
import com.app.service.TeacherService;

@Controller
@SessionAttributes({ "teacher", "appAdmin", "student","institute" })
public class LoginController {

	@Autowired
	LoginService loginService;

	@Autowired
	TeacherService teacherService;

	@Autowired
	InstituteService instituteService;

	@RequestMapping(value = "/gologin", method = RequestMethod.GET)
	public String goToLogin(Model mod, Login l) {
		mod.addAttribute("Login", l);
		System.out.println("inside gologin controller");

		return "login";

	}

	@RequestMapping(value = "/Checklogin", method = RequestMethod.POST)
	public String login(Model model, @ModelAttribute("login") Login login, Login l) {

		System.out.println("this is from Checklogin controller");
		System.out.println("login credentials are " + login.toString());
		String output = "";
		if (loginService.exist(login)) {
			System.out.println("**********such a user exists ");
			Login userLogin = loginService.find_By_Uname_pwd(login);
			Role userRole = userLogin.getRole();
			int roleId = userRole.getId();
			switch (roleId) {
			case 1:
				output = "hello";// student
				System.out.println("student logged in");
				break;

			case 2:
				output = "Teacher/home";// teacher
				model.addAttribute("teacher", teacherService.findByLoginId(userLogin.getId()));
				System.out.println("teacher logged in");
				break;

			case 3:
				output = "Teacher/home";// ** institute admin
				Teacher t=teacherService.findByLoginId(userLogin.getId());
				System.out.println(t);
				model.addAttribute("teacher",t );
				model.addAttribute("institute",teacherService.GetInstitute(t.getId()) );
				model.addAttribute("appAdmin", teacherService.findByLoginId(userLogin.getId()));
				System.out.println("institute admin logged in");
				break;

			case 4:
				output = "appAdmin/dashboard";// app Admin
				System.out.println("admin logged in");
				break;

			case 5:
				output = "template/index";// app Admin
				System.out.println("template logged in");
				break;

			default:
				model.addAttribute("message", login.toString());
				System.out.println("error in login incorect role logged in");
				output = "hello";
				break;
			}
		} else {
			System.out.println("**************no such a user");

			model.addAttribute("ErrorMessage", "Username or Password incorrect");
			model.addAttribute("Login", l);
			output = "login";
		}
		return output;
	}

}

// comment by rahul pr