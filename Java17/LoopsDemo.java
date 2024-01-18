public class LoopsDemo {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//        int j = 1;
//        boolean isReady = false;
//        do {
//            if (j > 5) {
//                break;
//            }
//            System.out.println(j);
//            j++;
//            isReady = (j > 0);
//        } while (isReady);

            int number = 0;
            while (number < 50) {
                number += 5;
                if (number % 25 == 0) {
                    continue;
                }
                System.out.print(number + "_");
            }
        }

        //Java 5 Enhanced for
        int[] numbers = {1, 2, 3, 4, 5};

// Using enhanced for loop to iterate over an array
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
