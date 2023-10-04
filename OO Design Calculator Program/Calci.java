 public class Calci {
   
 
    public int performOperation(int firstNumber, int secondNumber, String operation)
    {
        int result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "%":
                result = firstNumber % secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;
    }
}