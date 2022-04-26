package com.app.newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class MethodReferencesDemo {
	
	
	//Static Method Reference.  Class::staticMethod  
	
	//Instance Method Reference of a particular object.  obj::instanceMethod 
	
	// Instance Method Reference of an arbitrary object of a particular type. ObjectType::instanceMethod 
	
	// Constructor Reference.  ClassName::new 
	
	
	// Method 1
    // Static method to compare with name
	public static int compareByName(Person a, Person b)
    {
        return a.getName().compareTo(b.getName());
    }
 
    // Method 2
    // Static method to compare with age
    public static int compareByAge(Person a, Person b)
    {
        return a.getAge().compareTo(b.getAge());
    }
 
	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<>();
		 
        // Adding elements to above List
        // using add() method
        personList.add(new Person("vicky", 24));
        personList.add(new Person("poonam", 25));
        personList.add(new Person("sachin", 19));
 
        // Using static method reference to
        // sort array by name
        Collections.sort(personList, MethodReferencesDemo::compareByName);
 
        // Display message only
        System.out.println("Sort by name :");
 
        // Using streams over above object of Person type
        personList.stream()
            .map(x -> x.getName())
            .forEach(System.out::println);
 
        // Now using static method reference
        // to sort array by age
        Collections.sort(personList, MethodReferencesDemo::compareByAge);
 
        // Display message only
        System.out.println("Sort by age :");
 
        // Using streams over above object of Person type
        personList.stream()
            .map(x -> x.getName())
            .forEach(System.out::println);
        
        	

	
}
}

class Person {
	 
    private String name;
    private Integer age;
 
    // Constructor
    public Person(String name, int age)
    {
        // This keyword refers to current instance itself
        this.name = name;
        this.age = age;
    }
 
    // Getter-setters
    public Integer getAge() { return age; }
    public String getName() { return name; }
}

 
	
	

