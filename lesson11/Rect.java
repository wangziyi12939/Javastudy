package lesson11;
public class Rect extends Shape implements NamedShape {
    private double r;
    private double h;
    public Rect(String color, double r, double h) {
        super(color);
        this.r=r;
        this.h=h;
    }
    public double area() {
        return r * h;
    }
    public String name() {
        return "矩形-" + color;
    }
}