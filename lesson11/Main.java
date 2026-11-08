package lesson11;

/**
 * 运行入口。三段演示，覆盖本节课全部结论。
 *
 * 终端编译（在 D:\Javastudy 根目录执行）：
 *   javac -encoding UTF-8 -d out lesson11/*.java
 *   java -Dstdout.encoding=UTF-8 -cp out lesson11.Main
 */
public class Main {

    /**
     * 参数类型写成接口：只认「能报名字」，不管进来的是什么东西。
     *
     * 下面那行 for 是第 6 课 D2 的 for-each，等价写法：
     *   for (int i = 0; i < arr.length; i++) { Named n = arr[i]; ... }
     */
    static void printNames(Named[] arr) {
        for (Named n : arr) {
            System.out.println(n.name());
        }
    }

    public static void main(String[] args) {

        // ---- 1. 接口统一两个毫无血缘关系的类 ----
        Named[] list = new Named[2];
        list[0] = new Circle("红", 1.0);
        list[1] = new Student("2026001");
        printNames(list);

        // ---- 2. 接口常量：变量被编译器补成 public static final，不用建对象直接取 ----
        System.out.println("名字长度上限：" + Named.MAX_NAME_LENGTH);

        // ---- 3. 同一个对象，三副面孔 ----
        Circle c = new Circle("蓝", 2.0);

        Shape s = c;          // 左边 Shape，右边那个 Circle 对象
        s.describe();         // 走的是 Circle 重写后的 area()

        Printable p = c;      // 左边 Printable，右边还是同一个 Circle 对象
        p.print();

        Named n = c;
        System.out.println(n.name());
    }
}
