package lesson10;

public class Cat extends Animal {
    // Cat 也是 Animal 的一种，同样继承 name 和 eat()。

    // 构造器：把名字交给父类存。
    public Cat(String name) {
        super(name);
    }

    // 重写 eat：猫的吃法和动物不同。
    @Override
    public void eat() {
        System.out.println(name + " 在吃小鱼干");
    }

    // 猫特有的行为。
    public void meow() {
        System.out.println(name + " 在喵喵叫");
    }
}
