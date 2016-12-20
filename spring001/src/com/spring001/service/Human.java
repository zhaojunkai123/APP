package com.spring001.service;

public class Human {

	private Axe axe;
	
	public void init(){
		System.out.println("Ä¥¸«");
	}
	public void destroy(){
		System.out.println("ÊÕ²Ø");
	}
	
	 public void cutTree(){
		 axe.cut();
	 }
	 
	 public void setAxe(Axe axe){
		 this.axe=axe;
	 }
}
