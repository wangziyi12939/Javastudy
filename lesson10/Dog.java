public class Dog extends Animal {
    // extends = 继承：Dog 是 Animal 的一种，自动拥有 name 和 eat()。

    // 构造器：Dog 自己没有 name 字段，所以先把名字交给父类存（super 就是「调用父类构造器」）。
    public Dog(String name) {
        super(name);
    }

    // @Override = 方法重写：父类已经有 eat()，这里写一个同名同参的，用狗的版本盖掉父类的版本。
    @Override
    public void eat() {
        System.out.println(name + " 在啃骨头");   // 狗的吃法和动物不同，所以重写
    }

    // 狗特有的行为：父类没有，是 Dog 自己新增的。
    public void bark() {
        System.out.println(name + " 在汪汪叫");
    }
}
