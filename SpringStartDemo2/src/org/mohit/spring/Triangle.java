package org.mohit.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements BeanNameAware {

	private List<Point> point;

	
	public List<Point> getPoint() {
		return point;
	}


	public void setPoint(List<Point> point) {
		this.point = point;
	}


	public void draw(){
		for(Point p: point){
			System.out.println("Point -> Width: "+p.getWidth()+" Height: "+p.getHeight());
		}
		
	}


	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name: "+beanName);
	}


	
}
