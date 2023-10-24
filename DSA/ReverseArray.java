import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter lenght of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Now eneter the array elements one by one in new line...");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = n - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }
        System.out.println("Revers of given Array ....");
        for (int k = 0; k < n; k/*  */++) {
            System.out.println(arr[k]);
        }

    }

}
