package dev.arraydemo;

import java.util.Arrays;

public class RefArrayDemo {

    public static void main(String[] args) {

        int[] myIntArray = new int[]{1,2,3,4,5};
        int[] anotherArray = myIntArray;

        System.out.println("IntArray -->"+ Arrays.toString(myIntArray));
        System.out.println("AnotherArray -->"+ Arrays.toString(anotherArray));

        anotherArray[0]=12;
        modifyArray(myIntArray);

        System.out.println("IntArray -->"+ Arrays.toString(myIntArray));
        System.out.println("AnotherArray -->"+ Arrays.toString(anotherArray));


    }

    private static void modifyArray(int[] array){
        array[1] = 6;

    }
}
