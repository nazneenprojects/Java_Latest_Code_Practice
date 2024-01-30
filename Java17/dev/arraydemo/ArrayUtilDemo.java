package dev.arraydemo;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] myArray = getRandomArray(4);
        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));

        Arrays.fill(myArray, 1000);
        System.out.println(Arrays.toString(myArray));

        int[] myArrayCopy = Arrays.copyOf(myArray, myArray.length);
        System.out.println(Arrays.toString(myArrayCopy));

        doDataStructureOperation();

    }

    public static int[] getRandomArray(int l) {
        Random ran = new Random();
        int[] num = new int[l];

        for (int i =0; i<l; i++) {
            num[i] = ran.nextInt(10);
        }
        return num;
    }

    public static void doDataStructureOperation(){
        String[] quote = {"Persistence", "and", "determination" , "alone" , "are",  "omnipotent"};
        Arrays.sort(quote);
        if(Arrays.binarySearch(quote, "alone") >= 0){
            System.out.println("Found 'alone' in the Quote");
        }

        char[] a1 = {'a', 'e', 'i'};
        char[] a2 = {'o', 'u', 'i'};
        if(a1.equals(a2)){
            System.out.println("Array are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }
}
