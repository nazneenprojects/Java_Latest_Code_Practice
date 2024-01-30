package dev.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class MinArrayElement {
    public static void main(String[] args) {
        int[] returnedArray = readIntegrers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegrers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    // arrray : 1, 0, 5, 7, 9
    // min = ..1... and temp = ......
    //
    private static int findMin(int[] record) {
        int min = Integer.MAX_VALUE;
        for (int el : record) {
            if (el < min) {
                min = el;
            }
        }

        return min;
    }


}
