package org.mohit.spring;

import java.util.List;

public class Triangle {

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
}
