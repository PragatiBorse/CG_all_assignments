package com.springCore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextAware implements ApplicationContextAware, BeanNameAware {
	private static final Point PointA = null;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private ApplicationContext contxt=null;
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("PointA is("+pointA.getX()+", "+pointA.getY()+")");
		System.out.println("PointB is("+pointB.getX()+", "+pointB.getY()+")");
		System.out.println("PointC is("+pointC.getX()+", "+pointC.getY()+")");
				
	}

	public void setApplicationContext(ApplicationContext contxt) throws BeansException
	{
		this.contxt = contxt;
	}
	public void setBeanName(String beanName) {
		System.out.println("Bean name is: "+beanName);
	}
	 
	public void setApplicationContext1(ApplicationContext applicationContext) throws BeansException
	{
		
	}
}
