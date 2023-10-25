public class SumofMaxMin {
    public static void main(String[] args) {
        
        //works for this array
        int[] numm = { 1231, 3, 4, -56, 90, 12, 4, -9, 678 };
        //fails for this long array
        int [] num= { 704, -964, -290, 297, -573, -347, 614, -396, 208, -613, -826, 759, 837, 224, -668, 717, -985, 778, -339, -253, 574, -378, -680, 949, -842, -547, -311, 846, 467, 435, 511, -596, -482, -757, 623, -1000, -225, -61, -251, -16, -851, 533, -784, 795, -796, -955, -762, -873, 575, -485, -538, -534, -367, -712, 941, 247, -265, 407, -126, 107, 605, -685, -522, -29, -246, 901, 661, 535, -69, 478, -169, 803, 857, -97, -187, -241, -286 };
        solve(num);
    }



    public static int solve(int[] A) {

        int max = Integer.MIN_VALUE;

        for(int i =0; i< A.length ; i++)
        {
            if(A[i] > max)
            {
                max = A[i];
            }
        }

        System.out.println("Max is :" + max);

         int min = Integer.MAX_VALUE;

        for(int i =0; i< A.length ; i++)
        {
            if(A[i] < min)
            {
                min = A[i];
            }
        }

        System.out.println("Min is :"+ min);
        int sum = max+ min;
        System.out.println("Sum of Min and MAx :" + sum);

        return sum;


   
    }
    }




