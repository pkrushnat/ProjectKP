package com.Demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("krushnat","Shekhar","gayatri","rushi","rohit");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}
}