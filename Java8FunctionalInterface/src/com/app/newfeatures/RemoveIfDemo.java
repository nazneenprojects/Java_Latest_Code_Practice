package com.app.newfeatures;

import java.util.ArrayList;

public class RemoveIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean removeIf(Predicate<? super E> filter)
		
		ArrayList<String> students = new ArrayList<String>();
		  
        // Add Strings to list
        // each string represents student name
        students.add("Ram");
        students.add("Mohan");
        students.add("Sohan");
        students.add("Rabi");
        students.add("Shabbir");
  
        // apply removeIf() method
        // we are going to remove names
        // start with S
        students.removeIf(n -> (n.charAt(0) == 'S'));
  
        System.out.println("Students name Does not start with S");
        // print list
        for (String str : students) {
            System.out.println(str);
        }

	}

}
