# 第 11 课 · 抽象类与接口

## 文件

| 文件 | 作用 |
|---|---|
| `Named.java` | 接口：能报名字。方法默认 `public abstract`，变量默认 `public static final` |
| `Printable.java` | 接口：能打印自己。用来演示一个类实现多份能力清单 |
| `Shape.java` | 抽象类：`abstract` 修饰类与方法各自限制什么，抽象类为何仍有构造器 |
| `Circle.java` | 同时 `extends Shape` 与 `implements Named, Printable` |
| `Student.java` | 只实现 `Named`，与 `Circle` 无血缘，用于验证接口的统合力 |
| `Main.java` | 三段演示：接口数组、接口常量、同对象多面孔 |

## 编译与运行

在 `D:\Javastudy` 根目录执行，不可在 `lesson11` 目录内执行（会造成重复类）：

```
javac -encoding UTF-8 -d out lesson11/*.java
java -Dstdout.encoding=UTF-8 -cp out lesson11.Main
```

预期输出：

```
圆形-红
学生-2026001
名字长度上限：20
蓝的形状，面积 12.56
圆形-蓝，面积 12.56
圆形-蓝
```

## 判据速查

**`abstract` 只管紧挨着它的那一个东西**

| 写法 | 限制 | 不管什么 |
|---|---|---|
| `abstract class Shape` | 该类不能 `new` | 类内方法是否抽象，与它无关 |
| `abstract double area();` | 该方法不能有方法体 | 类能不能 `new`，与它无关 |

数 `abstract` 出现几次、每次紧挨谁，各管各的。

**`extends` 与 `implements`**

| 关键字 | 管什么 | 类别 |
|---|---|---|
| `extends` | 是什么 | 类继承类、接口继承接口 |
| `implements` | 能干什么 | 类实现接口 |

接口是它的实现类的父类型。`Circle implements Named` 之后，`Circle` 对象可以赋给 `Named` 变量，与 `Circle extends Shape` 后赋给 `Shape` 变量同一条规矩。

**访问权限只能放宽，不能收紧**

接口方法默认 `public`，实现时省略修饰符会掉成包私有，编译器拒绝：

```
错误: Circle中的compareSize(Shape)无法实现Sized中的compareSize(Shape)
  正在尝试分配更低的访问权限; 以前为public
```

## 编译不过的三个反例

### 1. 子类构造器不调父类构造器

```java
class Circle extends Shape {
    Circle(double r) { this.r = r; }
}
```
```
错误: 无法将类 Shape中的构造器 Shape应用到给定类型;
  需要: String
  找到:    没有参数
```

子类构造器第一句必须是 `super(...)` 或 `this(...)`。未写则编译器补 `super();`，而 `Shape` 只有带参构造器（写了带参就不送无参），故撞空。`this.r = r` 只负责子类那一半，救不了父类那一半。

### 2. 抽象方法写方法体

```java
abstract class Bad {
    abstract void x() { System.out.println("hi"); }
}
```
```
错误: 抽象方法不能有主体
```

### 3. 两个接口同名同参但返回类型不同

```java
interface A { void hello(); }
interface B { String hello(); }
class C implements A, B { public void hello() { } }
```
```
错误: C中的hello()无法实现B中的hello()
  返回类型void与String不兼容
```

返回类型不参与方法签名，两个 `hello()` 签名相同，同一方法无法同时满足两种返回类型，故此类不能同时实现 A 与 B。若两个接口同名同参且返回类型也相同，则一个实现即可同时满足双份清单。
