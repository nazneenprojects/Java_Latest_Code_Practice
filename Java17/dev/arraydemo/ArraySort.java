package dev.arraydemo;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        int[] data = createArray(10);
        ascSort(data);
        descSort(data);
        ascSortWhile(data);
    }

    public static int[] createArray(int bound) {
        Random random = new Random();
        int[] data = new int[bound];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(bound);
        }
        System.out.println("OriginalArray: " + Arrays.toString(data));
        return data;
    }

    public static void ascSort(int[] array) {
        //using in built function
        Arrays.sort(array);
        System.out.println("Sorting Array using in built fun method : " + Arrays.toString(array));

        //manual sorting logic
      //  int[] sorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < (array.length - 1); j++) {
                if (array[i] < array[j]) {
                    //do nothing
                } else {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorting Array in ascending order using manual method : " + Arrays.toString(array));
    }
    public static void ascSortWhile(int[] array){
        //using while loop
        boolean flag =true;
        int temp;
        while(flag){
            flag = false;
            for(int i =0 ; i<array.length-1; i++){
                if(array[i] < array[i+1]){
                    temp = array[i+1];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    flag = true;
                }
            }
        }
        System.out.println("\n Sorting Array in ascending order using while : " + Arrays.toString(array));
    }
    public static void descSort(int[] array) {
        //First Sorting using in built function and then print in reverse loop
        Arrays.sort(array);
        //  System.out.println("Sorting Array using manual method : "+Arrays.toString(array));
        System.out.print("Sorting Array in descending order using manual method : ");
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
