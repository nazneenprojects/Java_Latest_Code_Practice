public class ArrayDemo {

    public static void main(String args[]) {

        int[] num = { 1, 3, 4, 6, 90, 12, 4, 456, 678 };

        int[] arr = new int[10];

        System.out.println(num[6]);

        num[4] = 30;

        System.out.println(num[4]);

        System.out.println(num.length);

        for (int i : num) {
            System.out.println(i);
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "->");
        }

    }

}
