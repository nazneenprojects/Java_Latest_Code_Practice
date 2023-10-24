import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter lenght of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Now eneter the array elements one by one in new line...");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max is " + max);

    }
}
