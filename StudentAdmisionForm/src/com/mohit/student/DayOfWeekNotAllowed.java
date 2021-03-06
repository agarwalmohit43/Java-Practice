package com.mohit.student;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekNotAllowed extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		//if true application will further handle the request else vice versa

		Calendar cal=Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		if(dayOfWeek == 1){
			response.getWriter().write("<h1>Website is closed on Sunday!!!!!!!!!!!!!!!!!</h1>");
			return false;
		}
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		//loads after the url has been hitten
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//loads after the view has been displayed
	
	}

	
	
}
