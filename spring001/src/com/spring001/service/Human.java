package com.spring001.service;

public class Human {

	private Axe axe;
	
	public void init(){
		System.out.println("ĥ��");
	}
	public void destroy(){
		System.out.println("�ղ�");
	}
	
	 public void cutTree(){
		 axe.cut();
	 }
	 
	 public void setAxe(Axe axe){
		 this.axe=axe;
	 }
}
