package com.mohit.helloController;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
public class HelloController extends AbstractController{
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView=new ModelAndView("HelloPage");
		modelAndView.addObject("WelcomeMessage","Hi welcome");
		return modelAndView;
	}}
*/

@Controller
/*@RequestMapping("/check") then url will be/check/welcome*/
public class HelloController{
	
		@RequestMapping("/welcome")
		public ModelAndView helloWorld(){
			
			ModelAndView modelAndView=new ModelAndView("HelloPage");
			modelAndView.addObject("WelcomeMessage","Hi welcome");
			
			return modelAndView;
		}
		
		@RequestMapping("/uname/{username}")
		public ModelAndView username(@PathVariable("username") String uname){
			
			ModelAndView modelAndView=new ModelAndView("HelloPage");
			modelAndView.addObject("WelcomeMessage","Hi welcome "+uname);
			
			return modelAndView;
		}
		
		/*@RequestMapping("/enter/{country}/{username}")
		public ModelAndView unameCountry(@PathVariable("username") String uname,@PathVariable("country") String country){
			
			ModelAndView modelAndView=new ModelAndView("HelloPage");
			modelAndView.addObject("WelcomeMessage","Hi welcome "+uname+" you are from "+country);
			
			return modelAndView;
		}*/
		
		@RequestMapping("/enter/{country}/{username}")
		public ModelAndView unameCountry(@PathVariable Map<String,String> pathVar){
			
			String uname = pathVar.get("username");
			String country = pathVar.get("country");
			
			ModelAndView modelAndView=new ModelAndView("HelloPage");
			modelAndView.addObject("WelcomeMessage","Hi welcome "+uname+" you are from "+country);
			
			return modelAndView;
		}
		
}