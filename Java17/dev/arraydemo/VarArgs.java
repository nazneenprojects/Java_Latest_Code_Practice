package dev.arraydemo;

public class VarArgs {
    //Array will be called args and be of type String
    public static void main(String... args) {

        System.out.println("Not everything that can be counted counts and not everything that counts can be counted (...Albert Einstein)");

       String[] quote = "it is only with the heart that one can see rightly, what is essential is invisible to the eye.".split(" ");
       printMsg(quote);
       printMsg("LittlePrince");

       String[] anonymousArray ={"Happines", "Is", "Cheaper"};
       System.out.println(String.join(",",anonymousArray ));
    }

    private static void printMsg(String... textList){
        for(String t : textList){
            System.out.println(t);
        }

    }

}
