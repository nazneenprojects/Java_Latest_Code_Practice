package dev.listdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class listdemo {

    public static void main(String[] args) {
        String[] numbers = {"garden" , "tools", "flower", "trees"};

        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html#of()
        //Factory Method - static method on class retunrs new instance

        List<String> items = List.of(numbers);
        System.out.println(items);

        System.out.println(items.getClass().getName());
        //output : java.util.ImmutableCollections$ListN
        // Its nested class


        ArrayList<String> nextList = new ArrayList<>(items);
        nextList.add("Messy");
        System.out.println(nextList);

        ArrayList<String> prevList = new ArrayList<>(List.of("Pickle", "Tomato", "Grains"));
        prevList.addAll(nextList);
        System.out.println(prevList);

        System.out.println(prevList.get(4));
        System.out.println(prevList.contains("Tomato"));
        prevList.remove(4);
        System.out.println(prevList.contains("Tomato"));

        prevList.retainAll(List.of("Tomato"));
        System.out.println(prevList);

        System.out.println( prevList.isEmpty());

        System.out.println(nextList);
        nextList.sort(Comparator.naturalOrder());
        nextList.sort(Comparator.reverseOrder());
        System.out.println(nextList);


        // ArrayList to Array
        var tempList = nextList.toArray(new String[nextList.size()]);
        System.out.println("Array "+Arrays.toString(tempList));


        System.out.println("-".repeat(10));
        //Array to List , This will fail to do operations on this newly created List

        var backList = Arrays.asList(tempList);
        backList.add("MANGO");
        System.out.println(backList.toString());
        System.out.println(Arrays.toString(tempList));

        //2d array

        String[][] new2darray = {{"garden" , "tools", "flower", "trees"},{"Trees", "becnh"}};
        System.out.println(  Arrays.deepToString(new2darray));;






    }






}
