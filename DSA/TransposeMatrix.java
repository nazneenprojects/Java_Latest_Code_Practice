import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int[n][m];

        System.out.println("Enter you 2D array elements now");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

               arr[i][j]  = sc.nextInt();
                
            }
        }

        System.out.println("Your 2D array :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

               System.out.print(arr[i][j]+ " ");
                
            }
            System.out.println("");
        }

        //Transpose of given Array
            
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < i; j++) {

                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i]= temp;
                    
                }
            }
        

         System.out.println("Your 2 D Array after Transpose...");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

               System.out.print(arr[i][j] + " ");
                
            }
            System.out.println();
        }

        

    }
    
}
