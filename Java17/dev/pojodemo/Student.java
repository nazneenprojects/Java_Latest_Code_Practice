package dev.pojodemo;

public class Student {
    private String id ;
    private String name ;
    private String dateOfBirth;
    private String grade;

    public Student(String id, String name, String dateOfBirth, String grade) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGrade() {
        return grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
