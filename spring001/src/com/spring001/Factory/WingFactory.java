package com.spring001.Factory;

import com.spring001.service.KfcWing;
import com.spring001.service.McDonlWing;
import com.spring001.service.Wing;

public class WingFactory {

	public static Wing getWing(String type){
		if("kfc".equals(type)){
			return new KfcWing();
		}else if("mcdonld".equals(type)){
			return new McDonlWing();
		}else{
			return null;
		}
	}
}
