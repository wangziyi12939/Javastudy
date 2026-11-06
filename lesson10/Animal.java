package lesson10;

public class Animal {
    // 父类「动物」：狗和猫都是动物，把共性的东西写在这里，子类就不用重复写。
    // name 是动物的名字，所有动物都有，所以放在父类。
    protected String name;

    // 构造器：new Animal(名字) 时把名字记下来。
    public Animal(String name) {
        this.name = name;
    }

    // 吃：所有动物都会吃，这是共性行为。
    public void eat() {
        System.out.println(name + " 在吃东西");
    }
}
