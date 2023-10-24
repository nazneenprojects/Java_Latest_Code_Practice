public class TwoDimArray {

    public static void main(String[] args) {

        int[][] arr = new int[5][6];

        arr[1][3] = 100;

        System.out.println(arr[1][3]);
        System.out.println(arr[2][4]);

        System.out.println(arr.length);

        System.out.println(arr[0].length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
