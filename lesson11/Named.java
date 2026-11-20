package lesson11;

/**
 * 能力清单：能报出自己的名字。
 *
 * 接口不描述「是什么」，只描述「能干什么」。
 * 任何类 implements 本接口，就必须交出 name()，也就能被当作 Named 使用。
 *
 * 方法与变量都不写修饰符时，编译器自动补：
 *   方法 → public abstract
 *   变量 → public static final（即常量）
 */
public interface Named {

    String name();

    /** 常量：不用 new，直接写 Named.MAX_NAME_LENGTH 取。 */
    int MAX_NAME_LENGTH = 20;
}
