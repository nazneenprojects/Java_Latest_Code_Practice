package com.app.predecate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateHandsOn2 {

	public static void main(String args[])
	{
		List<Integer> list = Arrays.asList(12,34,1,5,67,32,94,45,21,45);

		//1
		List<Integer> collect1 =  list.stream().filter(x-> x > 30).collect(Collectors.toList());
		System.out.println(collect1);
		
		//2
		List<Integer> collect2 =  list.stream().filter(x-> x > 30 && x < 90).collect(Collectors.toList());
		System.out.println(collect2);

		//3
		Predicate<Integer> noGreaterThan5 = x -> x > 5;
		Predicate<Integer> noLessThan8 = x -> x < 8;

		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> collect3 = list2.stream()
				.filter(noGreaterThan5.and(noLessThan8))
				.collect(Collectors.toList());

		System.out.println(collect3);
		
		
		
		
		

	}

}
