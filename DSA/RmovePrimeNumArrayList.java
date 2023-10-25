import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RmovePrimeNumArrayList {
     public static void main(String[] args) throws IOException {
        Integer[] nums = { 2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79 };
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(nums));

        System.out.println("Original List => " + list);
        keepOnlyCompositeNumbers(list);
        System.out.println("FInal List => " + list);
    }

    public static void keepOnlyCompositeNumbers(List<Integer> nums) {

        for (int i = 0 ; i < nums.size() ; i++) {
            if (isPrime(nums.get(i))) {
                nums.remove(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2 ; i < number ; i++) {
            if (number % i == 0) {
                return false; // number is divisible so its not prime
            }
        }
        return true; // number is prime now
    
    }
    
}
