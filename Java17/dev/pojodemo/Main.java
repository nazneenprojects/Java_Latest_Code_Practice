package dev.pojodemo;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            Student s = new Student("A123"+i ,
                    switch(i){
                    case 1 -> "Marry";
                    case 2 -> "Daniel";
                    case 3 -> "Harry";
                    case 4 -> "Massu";
                    case 5 -> "Ron";
                    default ->  "Anonymous";
                    },
                    "12/09/1234", "Java 17 features");
            System.out.println(s);
        }

    }
}
