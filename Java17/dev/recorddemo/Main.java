package dev.recorddemo;

public class Main {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            LPAStudent s = new LPAStudent("A123"+i ,
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

            Student pojoStudent = new Student("123", "ANN", "18/07/1991", "Java 17");
            LPAStudent recordStudent = new LPAStudent("123", "ANN", "18/07/1991", "Java 17");


            System.out.println(pojoStudent);
            System.out.println(recordStudent);


            System.out.println("Calling getter and setter:"+ pojoStudent.getName());
           pojoStudent.setName("NAZ");


            //Not allowed for Records
           // System.out.println("Calling getter and setter:"+ recordStudent.getName());
           //recordStudent.setName("NAZ");




        }

    }
}
