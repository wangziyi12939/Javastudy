package lesson08;

public class Student {
    String name;  
    int age;
    String school;
    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
    public Student() {
    }
    public void introduce() {
        System.out.println(name + " " + age + " " + school);
    }
}
