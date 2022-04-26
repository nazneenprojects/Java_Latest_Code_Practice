package com.app.predecate;

import java.util.function.Predicate;

public class PredicateHandsOn5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> startWithA = x -> x.startsWith("a");

        // start with "a" or "m"
        boolean result = startWithA.or(x -> x.startsWith("m")).test("mkyong");
        System.out.println(result);     // true

        // !(start with "a" and length is 3)
        boolean result2 = startWithA.and(x -> x.length() == 3).negate().test("abc");
        System.out.println(result2);    

	}

}
