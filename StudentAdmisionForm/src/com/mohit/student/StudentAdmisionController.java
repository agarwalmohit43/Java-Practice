package com.mohit.student;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmisionController {

	@RequestMapping(value="/getadm",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
	}
	
	/*@RequestMapping(value="/postadm",method=RequestMethod.POST)
	public ModelAndView postAdmissionForm(@RequestParam Map<String,String> paramVar){
		@RequestParam(value="studentname",defaultValue="Mr.XYz") String name,@RequestParam(value="studenthobby",defaultValue="...") String hobby
		String name = paramVar.get("studentname");
		String hobby =paramVar.get("studenthobby");
		
		Student student1=new Student();
		student1.setName(name);
		student1.setHobby(hobby);
		
		ModelAndView modelAndView = new ModelAndView("AdmissionSucces");
		modelAndView.addObject("msg","<i>Welcome</i>");
		modelAndView.addObject("student",student1);
		return modelAndView;
	}*/
	
	@ModelAttribute
	public void addingCommonObject(Model model){
		model.addAttribute("msg","<i>Welcome!</i>");
	}
	
	@RequestMapping(value="/postadm",method=RequestMethod.POST)
	public ModelAndView postAdmissionForm(@ModelAttribute("student") Student student){
		
		ModelAndView modelAndView = new ModelAndView("AdmissionSucces");
		return modelAndView;
	}
	
}