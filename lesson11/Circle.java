package lesson11;

/**
 * 同时吃下三种身份：
 *   extends Shape          —— 是一种形状
 *   implements Named       —— 能做到报名字
 *   implements Printable   —— 能做到打印自己
 *
 * 类头顺序固定：先 extends，后 implements。
 * 实现接口的方法必须写 public，因为接口给的是 public，实现不许变窄。
 */
public class Circle extends Shape implements NamedShape, Printable {

    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }

    public String name() {
        return "圆形-" + color;
    }

    public void print() {
        System.out.println(name() + "，面积 " + area());
    }
}
