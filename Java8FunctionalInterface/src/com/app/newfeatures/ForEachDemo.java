package com.app.newfeatures;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> cats = Arrays.asList("Annie", "Ripley");
		//for(String cat: cats)
		//System.out.println(cat);
		
		cats.forEach(c -> System.out.println(c));
		
		List<Integer> nums = Arrays.asList(1,2,45,67,3,45,32,21,56,9);
		
		nums.forEach(System.out :: println);

	}

}
