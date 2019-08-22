package com.java.factory;

public class factoryclass {
	public OS getInstance(String str) {
		
		if(str.equals("open"))
			return new Android();
		else if(str.equals("Closed"))
			return new IOS();
		else 
		return new Windows();
		
	}

}
