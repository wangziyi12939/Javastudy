public class Main {
    public static void main(String[] args) {
        // 一、继承：子类直接用父类的东西。
        Dog dog = new Dog("旺财");
        dog.eat();                 // 旺财 在啃骨头（重写后的狗的版本）
        dog.bark();                // 旺财 在汪汪叫（狗自己的方法）
        System.out.println(dog.name);   // 旺财（name 来自父类，protected 子类能直接用）

        Cat cat = new Cat("咪咪");
        cat.eat();                 // 咪咪 在吃小鱼干
        cat.meow();                // 咪咪 在喵喵叫

        // 二、多态：父类引用指向子类对象。
        // 声明类型是 Animal，实际 new 出来的是 Dog —— 这叫「向上转型」。
        Animal a1 = new Dog("大黑");
        Animal a2 = new Cat("小白");

        // 三、多态三条件：① 继承 ② 方法重写 ③ 父类引用指向子类对象。
        // 三个都满足，所以 a1.eat() 调的是 Dog 的重写版本，不是父类的「吃东西」。
        a1.eat();                  // 大黑 在啃骨头（运行时才决定用谁的 eat，叫动态绑定）
        a2.eat();                  // 小白 在吃小鱼干

        // 反例：父类引用调不到子类特有的方法，因为声明类型 Animal 里没有 bark()。
        // a1.bark();              // 解开这行会编译报错：Animal 里找不到 bark()
    }
}
