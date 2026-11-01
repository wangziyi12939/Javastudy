// ==========================================================
// 结构范例：一个 Java 程序由哪些零件组成
// 文件名 AllInOne.java —— public 类名必须与文件名一字不差
// ==========================================================

class Student {                    // ① 类声明
    String name;                   // ② 成员变量（每个对象各有一份）
    int age;                       //    格式：类型 名字 ;

    Student(String name, int age) {// ③ 构造器（名字=类名，不写返回类型）
        this.name = name;          // ④ this = 当前这个对象
        this.age = age;            //    = 把右边的值存进左边
    }

    void introduce() {             // ⑤ 方法声明（返回类型 名字 (参数表)）
        System.out.println(name + " " + age);  // ⑥ 方法调用：打印
    }
}

public class AllInOne {            // ⑦ public 类（全文件只能一个，名字=文件名）
    public static void main(String[] args) {   // ⑧ 主方法：程序入口
        Student s = new Student("张三", 20);   // ⑨ 声明变量 + new 造对象 + 赋值
        Student s2 = new Student("李四", 21);  //    再 new 一次，造第二个对象

        s.introduce();             // ⑩ 对象.方法() —— 用 s 指向的对象去跑
        s2.introduce();            //    同一份方法，当前对象换成 s2
    }
}
