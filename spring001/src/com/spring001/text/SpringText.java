package com.spring001.text;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring001.pojo.Car;
import com.spring001.service.Human;
import com.spring001.service.Wing;
@SuppressWarnings("resource")
public class SpringText {

	@Test
	public void testWing() {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Wing wing=(Wing) ctx.getBean("kfc");
		wing.eat();
		wing=ctx.getBean("mcdonld", Wing.class);
		wing.eat();
	}
	@Test
	public void textaxe(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Human human=ctx.getBean("human",Human.class);
		human.cutTree();
	}
	@Test
	public void textAbstract(){
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Human human=ctx.getBean("human",Human.class);
		human.cutTree();
		ctx.close();
	}
	@Test
	public void textScope(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Human human=ctx.getBean("human",Human.class);
		human.cutTree();
		System.out.println("1."+human);
		human=ctx.getBean("human",Human.class);
		human.cutTree();
		System.out.println("2."+human);
	}
	@Test
	public void textProt(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Human human=ctx.getBean("human",Human.class);
		human.cutTree();
		System.out.println("1."+human);
		human=ctx.getBean("human",Human.class);
		human.cutTree();
		System.out.println("2."+human);
	}
	@Test
	public void textCar(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car=ctx.getBean("car",Car.class);
		System.out.println(car.getName()+"        "+car.getPrice());
	}

}
