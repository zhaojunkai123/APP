package com.spring001.text;

import com.spring001.Factory.WingFactory;
import com.spring001.service.Wing;

public class FactoryTest {

	public static void main(String[] args) {
             Wing wing=WingFactory.getWing("mcdonld");
             wing.eat();
	}

}
