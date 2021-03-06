package com.mohit.student;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.sun.org.apache.regexp.internal.recompile;

@Controller
public class StudentAdmisionController {

	@InitBinder
	public void initBinder(WebDataBinder binder){
		/*binder.setDisallowedFields(new String[] {"studentmobile"});*/
		/*SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy**MM**dd");
		binder.registerCustomEditor(Date.class,"studentdob",new CustomDateEditor(dateFormat, false));*/
		binder.registerCustomEditor(String.class, "studentname",new StudentNameEditor());
	}
	
	@RequestMapping(value="/getadm",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws NullPointerException,IOException{
		
		String exceptionOccured = "IOE_EXCEPTIONs";
		
		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")){
			throw new NullPointerException("NULL_POINTER_EXCEPTION");
		}else if(exceptionOccured.equalsIgnoreCase("IOE_EXCEPTION")){
			throw new IOException("IOE_EXCEPTION");
		}
		
		
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
	public ModelAndView postAdmissionForm(@Valid @ModelAttribute("student") Student student,BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView modelAndView = new ModelAndView("AdmissionForm");
			return modelAndView;
		}
		
		ModelAndView modelAndView = new ModelAndView("AdmissionSucces");
		return modelAndView;
	}
	
	
}
