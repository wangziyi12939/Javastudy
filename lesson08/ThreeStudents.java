class Student {
        String name;
        int age;
        String school;
        Student(String name, int age, String school) {
            this.name=name;
            this.age=age;
            this.school=school;
        }
        public void introduce() {
            System.out.println(name + " " + age + " " + school);
        }
    }
public class ThreeStudents {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 20, "清华");
        Student s2 = new Student("李四", 21, "北大");
        Student s3 = new Student("王五", 19, "复旦");
        s1.introduce();
        s2.introduce();
        s3.introduce();
        s2.age = 22;
        s1.introduce();
        s2.introduce();
        s3.introduce();
    }
}