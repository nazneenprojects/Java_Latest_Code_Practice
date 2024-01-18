import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args ) {

        /*
        * Reading data from console in java:
        *  System.in
        * System.console
        * CMD args
        * Scanner
        * */

        int currentYear = 2024;

        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }



       /* int currentYear = 2024;
        String userDOB = "1991";

        int dateOfBirth = Integer.parseInt(userDOB);

        System.out.println("Age ="+ (currentYear - dateOfBirth));

        String partialYear = "23.12";
        double partialYearParsing = Double.parseDouble(partialYear);
        System.out.println("partialYearParsing > "+ partialYearParsing);*/

    }

    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, whats your name??");
        System.out.println("Hi" + name + "Nice to meet you!!");

        String bornYear = System.console().readLine("what year you were born??");
        int age = currentYear - Integer.parseInt(bornYear);

        return "So you are "+ age+" years old";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner sc = new Scanner(System.in);

       // String name = System.console().readLine("Hi, whats your name??");
        System.out.println("Hi, whats your name??");
        String name = sc.nextLine();
        System.out.println("Hi " + name + " Nice to meet you!!");

        System.out.println("What year were you born?");
        boolean validDOB = false;
        int age =0;

    do {
        System.out.println("Enter a year of birth >=" + (currentYear - 125) + "and <= " + (currentYear));
       /* String bornYear = sc.nextLine();
        age = currentYear - Integer.parseInt(bornYear);*/
        try {
            age = checkData(currentYear, sc.nextLine());
            validDOB = age < 0 ? false : true;
        } catch (NumberFormatException e) {
           System.out.println("Characters not allowed!!! Try Again...");
        }

    }while (!validDOB);
        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String bornYear)
    {
        int dob = Integer.parseInt(bornYear);
        int minYear = currentYear - 125;

        if((dob < minYear)||(dob > currentYear)){
            return -1;
        }
        return (currentYear -dob);
    }

}
