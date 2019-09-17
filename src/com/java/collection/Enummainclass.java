package com.java.collection;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class Enummainclass {

	public static void main(String[] args) {
	
				
				Set<days> set = EnumSet.of(days.MONDAY,days.SATURDAY);
				System.out.println(set);
				
				Iterator<days> iter = set.iterator();
				while(iter.hasNext()) {
					System.out.println(iter.next());
				}
				
			
		
	}

}
