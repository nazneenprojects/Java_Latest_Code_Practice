import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
        System.out.println("Please enter lenght of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Now enter the array elements one by one in new line...");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.println("Your given Array ....");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Sub Arrays ....");
        for (int si = 0; si < n; si++) {
            for (int ei = si; ei < n; ei++) {

                for (int k = si; k <=ei; k++) {
                    System.out.print(arr[k] + "  ");
                }
                System.out.println();
            }
        }


    }
}
