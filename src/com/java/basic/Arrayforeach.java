package com.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrayforeach {

	public static void main(String[] args) {
		
		List<String> mainclass = new ArrayList<>(Arrays.asList("A","B","C","D"));
		System.out.println(mainclass);
		
		mainclass.forEach(mainclas ->System.out.println(mainclas.toLowerCase()));
		
	}

}
