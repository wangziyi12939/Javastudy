package lesson11;

/**
 * 抽象类：规定「是形状」就必须能算面积。
 *
 * abstract 修饰类   → 该类不能 new
 * abstract 修饰方法 → 该方法不能有方法体
 * 两者互不牵连：类抽象，不代表里面的方法都得抽象。
 * 抽象类可以有构造器，但只能由子类的 super(...) 调用。
 */
public abstract class Shape {

    protected String color;

    protected Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    /** 带方法体的普通方法：abstract 没写在它前面，它就必须有方法体。 */
    public void describe() {
        System.out.println(color + "的形状，面积 " + area());
    }
}
