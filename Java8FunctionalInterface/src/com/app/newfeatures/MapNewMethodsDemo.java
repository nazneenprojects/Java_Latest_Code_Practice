package com.app.newfeatures;

import java.util.HashMap;
import java.util.Map;

public class MapNewMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> mp = new HashMap<String, String>();
		mp.put("A", "Abacus");
		mp.put("A", "Auction");
		mp.put("B", "Ballon");
		mp.put("F", "Fantum");
		
		mp.putIfAbsent("Au", "Audi");
		
		mp.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
	}

}
