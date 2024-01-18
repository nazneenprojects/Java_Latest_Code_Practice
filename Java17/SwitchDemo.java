public class SwitchDemo {

    //Notes : https://medium.com/@javatechie/the-evolution-of-switch-statement-from-java-7-to-java-17-4b5eee8d29b7

    public static void main(String[] args) {
        int switchValue =0;

        switch (switchValue) {
            case 1:
                System.out.println("Val 1");
                break;
            case 2: case 3: case 4:
                System.out.println("Val 2");
                break;
            default:
                System.out.println("Bye");
                break;
        }

        System.out.println("..Java 8 Switch Case..");
        int switchNum = 1;

        switch (switchNum) {
            case 1 -> System.out.println("Val 1");
            case 2 -> System.out.println("Val 2");
            case 3 , 4, 5 ->
                System.out.println("Val 3, 4, 5");
            default -> System.out.println("end of switch now , its default value");

        }


        String month = "APR";
        System.out.println("Quarter"+ getQuarter(month));
        System.out.println(month + " is in the Quarter: "+ getQuarterByMonth(month));


    }

    public static String getQuarter(String month){

        //Before Java 8
        switch (month){
            case "JAN":
            case "FEB":
            case "MAR":
                return "1st";
            case "APR":
            case "MAY":
            case "JUN":
                return "2nd";
            case "JUL":
            case "AUG":
            case "SEP":
                return "3rd";
            case "OCT":
            case "NOV":
            case "DEC":
                return "4th";
        }
        return "bad";
    }

    // After Java 12 , 13, 14  Enhanced Switch Expression with return statement at the start
    public static String getQuarterByMonth(String month) {
        return switch (month) {
            case "JAN", "FEB", "MAR" -> "1st";
            case "APR", "MAY", "JUN" -> "2nd";
            case "JUL", "AUG", "SEP" -> "3rd";
            case "OCT", "NOV", "DEC" -> "4th";
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
    }


    /*
        A yield statement transfers control by causing an enclosing switch expression to produce a specified value.

        YieldStatement:
          yield Expression;
        A yield statement attempts to transfer control to the innermost enclosing switch expression; this expression, which is called the yield target, then immediately completes normally and the value of the Expression becomes the value of the switch expression.

        It is a compile-time error if a yield statement has no yield target.

        It is a compile-time error if the yield target contains any method, constructor, initializer, or lambda expression that encloses the yield statement.

        It is a compile-time error if the Expression of a yield statement is void (15.1).

        Execution of a yield statement first evaluates the Expression. If the evaluation of the Expression completes abruptly for some reason, then the yield statement completes abruptly for that reason. If evaluation of the Expression completes normally, producing a value V, then the yield statement completes abruptly, the reason being a yield with value V.
    */

    public static String getQuarterByMonthNewStyle(String month) {
        return switch (month) {
            case "JAN", "FEB", "MAR" -> "1st";
            case "APR", "MAY", "JUN" -> "2nd";
            case "JUL", "AUG", "SEP" -> "3rd";
            case "OCT", "NOV", "DEC" -> "4th";
            default -> {
                String badResponse = "Invalid month: " + month;
                yield badResponse;
            }
        };
    }

}
