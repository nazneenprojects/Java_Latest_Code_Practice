package com.app.predecate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateHandsOn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//4
				Predicate<String> s1 = x -> x.startsWith("N");
				Predicate<String> s2 = x -> x.endsWith("n");

				List<String> list3 = Arrays.asList("Nazneen", "Mulani", "George");

				List<String> collect4 = list3.stream().filter(s1.or(s2)).collect(Collectors.toList());

				System.out.println(collect4);
				
				//5
			    List<String> collect5 = list3.stream()
		                .filter(s1.negate())
		                .collect(Collectors.toList());
				System.out.println(collect5);

	}

}
