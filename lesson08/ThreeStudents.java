package lesson08;

class StudentInfo {   // 比 Student 多一个 school 字段，故另起类名
        String name;
        int age;
        String school;
        StudentInfo(String name, int age, String school) {
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
        StudentInfo s1 = new StudentInfo("张三", 20, "清华");
        StudentInfo s2 = new StudentInfo("李四", 21, "北大");
        StudentInfo s3 = new StudentInfo("王五", 19, "复旦");
        s1.introduce();
        s2.introduce();
        s3.introduce();
        s2.age = 22;
        s1.introduce();
        s2.introduce();
        s3.introduce();
    }
}