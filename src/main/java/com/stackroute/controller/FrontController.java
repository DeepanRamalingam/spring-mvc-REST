package com.stackroute.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.model.Student;
import com.stackroute.repository.StudentDAOImpl;

@RestController
@RequestMapping(value = "/rest")
public class FrontController {

//	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
//	   public String printHello1(ModelMap model, HttpServletRequest req) {
//	      model.addAttribute("message", "Hello Deepan!");
//	      model.addAttribute("url",req.getServletPath());
//	      return "hello";
//	   }
//	
//	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
//	   public String printHello2(ModelMap model) {
//	      model.addAttribute("message", "Hello Chakkaravarthy!");
//	      return "hello";
//	   }
//	
//	@RequestMapping(value = "/student1", method = RequestMethod.GET)
//	   public String printHello3(ModelMap model) {
//		
//		StudentDAOImpl dao = new StudentDAOImpl();
//	      model.addAttribute("student", dao.FindStudent());
//	      return "student";
//	   }
//	
//	@RequestMapping(value = "/student2", method = RequestMethod.GET)
//	   public ModelAndView printHello4() {
//		
//		StudentDAOImpl dao = new StudentDAOImpl();
//	    return new ModelAndView("student","student",dao.FindStudent());
//	   }
//	
//	@RequestMapping(value = "/students", method = RequestMethod.GET)
//	   public ModelAndView printHello5() {
//		
//		StudentDAOImpl dao = new StudentDAOImpl();
//	    return new ModelAndView("students","students",dao.findAll());
//	   }
//	
	
	
//	REST CODING
	
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	   public @ResponseBody List<Student> printHello6() {
		
		StudentDAOImpl dao = new StudentDAOImpl();
	    return dao.findAll();
	   }
}
