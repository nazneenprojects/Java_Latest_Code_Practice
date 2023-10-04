import java.util.Scanner;

public class CalciTest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 

        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
 

        System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
        String operation = sc.next();
	
	Calci c = new Calci();

        int result = c.performOperation(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
    }
}
