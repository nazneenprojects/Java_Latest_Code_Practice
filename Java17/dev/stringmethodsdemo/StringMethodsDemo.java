package dev.stringmethodsdemo;

public class StringMethodsDemo {
    public static void main(String[] args) {
        /*
        * String Methods : 60
        * 3 Categories :
        * 1) Inspection : length , chatAt, IndexOf, lastIndexOf , isEmpty, isBlank (JDK11)
        * 2) Comparing : contentEquals , equals , equalsIgnoreCase, contains, endsWith,startsWith, regionMatches
        * 3) Manipulations :
        *       Comparison : indent(jdk 15) , {strip, stripLEading, stripTrailing , trim} --> (jdk 11), toLowerCase, toUpperCase,
        *          transform :  concat, join, repeat , replace, replaceAll, replaceFirst, subString, Subsequence
        *
        * StringBuilder - delete, deleteCharAt, insert, reverse , setLength
        *
        * */
        printMsg("DOBBY and SERIOUS BLACK");
        String helloworld = "Hello" + " World";
        helloworld.concat("and Goodbye");

        StringBuilder helloworldBuilder = new StringBuilder("Hello" + "World");
        helloworldBuilder.append(" and GoodBye");

        printStringBuildDemo(helloworldBuilder);
        printStringDemo(helloworld);

    }

    public static void  printMsg(String msg){
        int length = msg.length();
        System.out.println( "For given Message : Length-->"+length +
                "\n Char at 3rd position -->" + msg.charAt(2) +
                "\n isBlank -->" +  msg.isBlank());

        System.out.printf("isEmpty "  + msg.isEmpty() +"\n");

            String msg1 = "  ";

        System.out.printf("isBlank  " + msg1.isBlank()+"\n");

        System.out.printf("isEmpty  " + msg1.isEmpty()+"\n");

        String msg2 ="Bilbo ";
        String msg3 = "Bilbo ";

        if(msg2.equals(msg3)) {
            System.out.println("Both are equal strings..");
        }
        if(msg2.contentEquals(msg3)){
                System.out.println("Both are equal contents..");
        }
        if(msg2.equalsIgnoreCase(msg3)){
            System.out.println("Both are equal by ignoring its case..");
        }

        String msg4 = "  Hagrid ";
        String msg5 = "HEdwig and Harry   ";
                String msg6 = "   Dumbledooor";

        System.out.println("after trim ->"+ msg4.trim());
        System.out.println("after strip ->"+ msg4.strip());
        System.out.println("after StripLEading ->"+ msg6.stripLeading());
        System.out.println("after stripTrailing ->"+ msg5.stripTrailing());

       System.out.println("###\n".repeat(3));
       System.out.println("--".repeat(20));

        System.out.println("*".repeat(1).indent(5));
        System.out.println("**".repeat(2).indent(4));
        System.out.println("**".repeat(3).indent(3));
        System.out.println("***".repeat(4).indent(2));
        System.out.println("***".repeat(5).indent(1));

        System.out.println("--".repeat(20));


    }


    public static void printStringBuildDemo(StringBuilder string){
        System.out.println("StringBuilder : "+ string);
        System.out.println("length "+ string.length());
    }
    public static void printStringDemo(String string){
        System.out.println("String : "+ string);
        System.out.println("length "+ string.length());

    }

}
