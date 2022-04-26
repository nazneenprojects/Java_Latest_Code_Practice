package com.app.newfeatures;

import java.util.Arrays;
import java.util.List;

public class ReplaceAllDemo {
	
	
	public static void main(String[] args) {
		
	//void replaceAll(UnaryOperator<E> o)
	
	

	List<Integer> list = Arrays.asList(1, 2, 3);
	list.replaceAll(x -> x*2);
	System.out.println(list); // [2, 4, 6]
	}
}
