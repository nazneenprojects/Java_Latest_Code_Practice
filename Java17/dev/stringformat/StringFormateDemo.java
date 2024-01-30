package dev.stringformat;

public class StringFormateDemo {
    public static void main(String[] args) {

        String bullterIt = "Print a Bullted List of today's Menu Item : \n" + "\t \u2022 PASTA \n" + "\" \u2022 FALAFAL \n" + "\\ \u2022 CICKEN SOUP \n";

        String startTree = """
                Print a bullet List
                \u2022 First point
                        \u2022 Second Point""";


        System.out.println(startTree);
        System.out.println(bullterIt);

        //Format specifier %d , %f,
        int temp = 12;
        System.out.printf("Your Roll number is %d%n", temp);


        //exception
        //System.out.printf(" Hey date is %f%n", temp);


        System.out.printf(" Hey date is %.4f%n", (float) temp);


        String hn = String.format("My House number is  %6d %n", temp);
        System.out.println(hn);

        float m = 100.900F;
         hn = String.format("My book number is  %.2f%n".formatted(m));
        System.out.println(hn);


    }

}
