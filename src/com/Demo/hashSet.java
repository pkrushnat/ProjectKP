package com.Demo;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		HashSet<Integer> hash=new HashSet<Integer>();
		hash.add(11);
		hash.add(14);
		hash.add(13);
		hash.add(12);
		for(Integer i : hash) {
			System.out.println(i);
			
		}
		
		

	}
}

