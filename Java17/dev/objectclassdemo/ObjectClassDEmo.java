package dev.objectclassdemo;

public class ObjectClassDEmo extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max", 90);
        //output: Classname@ followed by hashcode. - integer that is unique to instance
        //states multiple references accoinding to single instances
        System.out.println(max.toString());

        PrimarySchool jimmy = new PrimarySchool("jimmy", 8, "carole");
        System.out.println(jimmy);
    }
}

class Student{
    private String name ;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PrimarySchool extends Student {
    private String parentName ;

    PrimarySchool(String name, int age, String parantName){
        super(name, age);
        this.parentName=parantName;
    }

    @Override
    public String toString() {
        return "PrimarySchool{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
