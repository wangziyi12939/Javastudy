# Javastudy

[![Java CI](https://github.com/wangziyi12939/Javastudy/actions/workflows/java-ci.yml/badge.svg)](https://github.com/wangziyi12939/Javastudy/actions/workflows/java-ci.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

Java 学习代码库，零基础起步，目标为 2027 年下半年软考高级「系统架构设计师」。

## 项目简介

仓库按课次划分目录，每个目录存放该课次的练习源码。所有源文件均为可独立编译运行的完整程序，不依赖第三方库。当前进度处于第一阶段语法与面向对象入门，涵盖分支、循环、数组、方法、递归、类与对象、封装、继承与多态。

`lesson` 目录号与课程大纲课号并非一一对应。前几课为环境搭建与概念课，未沉淀独立源码；从「分支」起，练习按入库先后顺序分配目录号，故自 `lesson02` 起整体错位。对应关系如下：

| 课程课号 | 主题 | lesson 目录 |
| --- | --- | --- |
| 1 | 认识程序与 Java + 环境搭建 | `lesson01` |
| 2 | 变量与基本数据类型 | 无（概念课，无独立源码） |
| 3 | 运算符与类型转换 | 无（练习课，未入库） |
| 4 | 流程控制 if / switch | `lesson02` |
| 5 | 循环 for / while | `lesson03` |
| 6 | 数组 | `lesson04`、`lesson06` |
| 7 | 方法、重载与递归 | `lesson07` |
| 8 | 类与对象 | `lesson08` |
| 9 | 封装、构造方法、this | `lesson09` |
| 10 | 继承与多态 | `lesson10` |

`lesson05` 从未使用，属历史编号空缺，保留以维持既有目录号稳定。

## 环境准备

| 组件 | 版本 | 用途 |
| --- | --- | --- |
| JDK | Temurin 25.0.4.1 LTS | 编译与运行 |
| 编辑器 | VS Code + Java 扩展包 | 开发与调试 |

安装完成后执行 `java -version`，输出中应包含 `openjdk version "25.0.4.1"`。源文件统一采用 UTF-8 编码，不含 BOM。

## 用法

`lesson01` 至 `lesson04` 的源文件声明了 `package`，编译时须以 `-d` 指定输出目录，运行时以「包名.类名」指定主类：

```bash
javac -encoding UTF-8 -d out/lesson02 lesson02/ScoreLevel.java
java -cp out/lesson02 lesson02.ScoreLevel
```

`lesson06` 至 `lesson10` 的源文件未声明 `package`，按练习分组编译即可。例如：

```bash
# lesson06：数组练习
javac -encoding UTF-8 -d out/lesson06 lesson06/SeatFill.java
java -cp out/lesson06 SeatFill

# lesson07：方法调用与重载
javac -encoding UTF-8 -d out/lesson07-main lesson07/Main.java lesson07/Calculator.java
java -cp out/lesson07-main Main

# lesson08：类与对象
javac -encoding UTF-8 -d out/lesson08-main lesson08/Main.java lesson08/Student.java lesson08/Test.java
java -cp out/lesson08-main Main

# lesson09：封装
javac -encoding UTF-8 -d out/lesson09-main lesson09/Main.java lesson09/Account.java
java -cp out/lesson09-main Main

# lesson10：继承与多态
javac -encoding UTF-8 -d out/lesson10-main lesson10/Main.java lesson10/Animal.java lesson10/Dog.java lesson10/Cat.java
java -cp out/lesson10-main Main
```

不同练习中存在同名类（如 `Main`、`Student`），因此**不能把所有源文件一次性编译到同一目录**。CI 将每个练习组编译到独立输出目录，完整分组见 [`.github/workflows/java-ci.yml`](.github/workflows/java-ci.yml)。

`SeatFill` 输出 5 行 4 列的座位号：

```text
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
```

Windows 控制台输出中文出现乱码时，先执行 `chcp 65001` 将代码页切换为 UTF-8。VS Code 内置终端通常无需此操作。

`out/` 已列入 `.gitignore`，编译产物不入库。

## 目录结构

```text
Javastudy/
├── lesson01/   第一个程序
├── lesson02/   分支（if、switch）
├── lesson03/   循环（for、嵌套、若干小应用）
├── lesson04/   数组（一维、二维）
├── lesson06/   数组收尾（动态二维、成绩统计）
├── lesson07/   方法、重载与递归
├── lesson08/   类与对象
├── lesson09/   封装、构造方法、this
└── lesson10/   继承与多态
```

| 目录 | 源文件 | 说明 |
| --- | --- | --- |
| `lesson01` | HelloWorld | 验证 JDK 安装 |
| `lesson02` | IfDemo | 单分支与代码块 |
| `lesson02` | Warmup | 类骨架默写热身 |
| `lesson02` | ScoreLevel | 按分数划分五个等级 |
| `lesson02` | DayCheck | 以 switch 判断星期 |
| `lesson02` | ScoreLevelSwitch | 以 switch 实现成绩分流 |
| `lesson03` | ForDemo | 数值求和 |
| `lesson03` | CountTo7 | 以 while 循环计数至 7 |
| `lesson03` | DeepLoop | 嵌套循环 |
| `lesson03` | NineNine | 输出九九乘法表 |
| `lesson03` | PrimeTable | 输出 100 以内的素数 |
| `lesson04` | ArrayTraverse | 遍历一维数组 |
| `lesson04` | ArrayMaxMin | 求最大值与最小值 |
| `lesson04` | ArraySeat | 输出二维座位表 |
| `lesson06` | SeatFill | 以 `new` 构造 5 行 4 列数组，按公式填入 1 至 20 |
| `lesson06` | ScoreStats | 统计五个成绩的总分、平均值、最高值、最低值及不及格人数 |
| `lesson07` | Main | 调用 `Calculator`，验证方法重载 |
| `lesson07` | Calculator | 提供加减乘除与三数最大值等静态方法 |
| `lesson07` | Factorial | 以递归计算阶乘 |
| `lesson07` | SumCompare | 对照正确递归与「递归内再套循环」的错误写法 |
| `lesson08` | Student | 学生类，含属性、两个构造器与自我介绍方法 |
| `lesson08` | Main | 创建两个学生对象并调用方法 |
| `lesson08` | Test | 使用无参构造器创建学生并赋值 |
| `lesson08` | AllInOne | 单文件展示类、成员变量、构造器、方法与入口 |
| `lesson08` | CounterDemo | 以两个对象演示实例状态的独立性 |
| `lesson08` | Report | 以对象保存总分与次数并计算平均分 |
| `lesson08` | Shop | 以购物车对象演示状态累计与浮点平均值 |
| `lesson08` | ThreeStudents | 创建三个学生对象并修改其中一个的属性 |
| `lesson09` | Account | 账户类，以 `private` + getter/setter 封装，`deposit`/`withdraw` 各带两道校验 |
| `lesson09` | Main | 创建两个账户对象，验证多对象互不影响与两道取款校验 |
| `lesson10` | Animal | 动物父类，持有 `name` 与共性行为 `eat()` |
| `lesson10` | Dog | 继承 `Animal`，重写 `eat()` 并新增 `bark()` |
| `lesson10` | Cat | 继承 `Animal`，重写 `eat()` 并新增 `meow()` |
| `lesson10` | Main | 演示继承复用与「父类引用指向子类对象」的多态输出 |

## 编码约定

- 源文件名与 `public` 类名保持一致，每个源文件只包含一个 `public class`。
- 编译产物（`*.class`、`out/`）不入库。
- 提交说明采用「目录 + 动作 + 内容」格式，例如：
  - `lesson04 新增 ArraySeat.java（二维数组座位表）`
  - `lesson03 修正 NineNine 内层循环边界`
- 修改通过专题分支提交 Pull Request，`main` 不接收直接推送。
- 合并前必须通过 `Java CI / compile` 检查。

## 协作与反馈

- 提交代码或文档修改前，请阅读 [CONTRIBUTING.md](CONTRIBUTING.md)。
- 参与讨论即表示同意遵守 [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md)。
- 缺陷与学习问题分别使用对应的 Issue 模板提交。
- 仓库所有者由 [`.github/CODEOWNERS`](.github/CODEOWNERS) 指定。

## 更新日志

变更记录见 [CHANGELOG.md](CHANGELOG.md)，版本说明见 [Releases](https://github.com/wangziyi12939/Javastudy/releases)。

## 许可证

本项目采用 [MIT License](LICENSE)。
