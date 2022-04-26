package com.app.predecate;

import java.util.function.BiPredicate;

public class PredicateHandsOn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };

        boolean result = filter.test("mkyong", 6);
        System.out.println(result);  // true

        boolean result2 = filter.test("java", 10);
        System.out.println(result2); // false

	}

}
