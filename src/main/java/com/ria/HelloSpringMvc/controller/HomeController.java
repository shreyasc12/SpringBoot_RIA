package com.ria.HelloSpringMvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ria.HelloSpringMvc.services.Address;
import com.ria.HelloSpringMvc.services.Calculator;
import com.ria.HelloSpringMvc.services.Employee;
import com.ria.HelloSpringMvc.services.EmployeeDAO;
import com.ria.HelloSpringMvc.services.UserDAO;

@Controller
public class HomeController {

	@RequestMapping(value="/hi")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/add")
	public String add(HttpServletRequest request, HttpServletResponse response)
	{
		Calculator c = new Calculator();
		String first = request.getParameter("one");
		String two = request.getParameter("two");
		int add = c.add(Integer.parseInt(first),Integer.parseInt(two));
		int add2 = c.add(10, 12);
		System.out.println(c.add(Integer.parseInt(first),Integer.parseInt(two)));
		HttpSession session = request.getSession();
		session.setAttribute("user_id", add2);
		request.setAttribute("add",add);
		return "display";
	}
	@RequestMapping(value="/registedsdr")
	public ModelAndView Register(HttpServletRequest request, HttpServletResponse response)
	{
		String name = request.getParameter("name");
		String userid = request.getParameter("user_id");
		String pass = request.getParameter("pass");
		int id = Integer.parseInt(request.getParameter("id"));
		int salary = Integer.parseInt(request.getParameter("salary"));
		ModelAndView model = new ModelAndView();
		model.addObject("name",name);
		model.addObject("userid",userid);
		model.addObject("password",pass);
		model.addObject("salary",salary);
		model.addObject("id",id);
		model.setViewName("registrationDetail");
		return model;
	}
	
	@RequestMapping(value="/register")
	public ModelAndView profilePage(HttpServletRequest request, HttpServletResponse response)
	{
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String userid = request.getParameter("user_id");
		String pass = request.getParameter("pass");
		int salary = Integer.parseInt(request.getParameter("salary"));
		int pincode = Integer.parseInt(request.getParameter("salary"));
		String city = request.getParameter("city");
		Address a = new Address(pincode,city);
		//Employee e = new Employee(id,name,salary);
		EmployeeDAO emp = new EmployeeDAO();
		UserDAO user = new UserDAO();
		user.insert(id,name, pass);
		//emp.insert(1, "shreyas", 3235);
		//emp.insert(id, name, salary);
		emp.insert(id,name,a,salary);
		ModelAndView model = new ModelAndView();
		
		model.addObject("name",name);
		model.addObject("userid",userid);
		model.addObject("password",pass);
		model.addObject("salary",salary);
		model.addObject("id",id);
		model.setViewName("Login");
		return model;
	}
	@RequestMapping(value="/auth")
	public ModelAndView Authentication(HttpServletRequest request,String user_id,String pass)
	{
		
		ModelAndView model = new ModelAndView();
		ModelAndView model_failure = new ModelAndView();
		//model.addObject("userid",user_id);
		HttpSession session = request.getSession();
		session.setAttribute("userid", user_id);
		model.setViewName("Success");
		model_failure.setViewName("Failure");
		UserDAO user = new UserDAO();
		List l = user.find(user_id,pass);
		System.out.println(l);
		if(l.size()!=0)
		{
			return model;
		}
		else
		{
			return model_failure;
		}
		
		
	}
	
}
