package dev.boxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class BoxingDemo {
    public static void main(String[] args) {
        //LinkedList<int> l = new LinkedList<int>();

        LinkedList<Integer> link = new LinkedList<Integer>();

        // valueOF() --> static overloaded factory method takes prmitives and returns instance of wrapper class.
        Integer boxedInt = Integer.valueOf(12);
        //Integer deprecatedInt = new Integer(15); after jdk 9f
        System.out.println(boxedInt);

        //Autoboxing
        Integer boxedIntValue = 100;
        System.out.println(boxedIntValue);

        //UnBoxing
        int unboxedIntValue = boxedIntValue.intValue();
        System.out.println(unboxedIntValue);

        System.out.println(boxedInt.getClass().getName());
        //System.out.println(unboxedIntValue.getClass().getName());  methods not allowed on primitives

        Integer[] wrapperArray = new Integer[10];
        wrapperArray[0] = 100;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());

        var ourList = getList(1,3,5,6,6,2);
        System.out.println(ourList);


    }

    private static ArrayList<Integer> getList(Integer... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }
}
