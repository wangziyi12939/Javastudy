# Javastudy

学 Java 时写的练习代码。零基础起步，为 2027 年软考高级「系统架构设计师」做准备，现在在第一阶段的语法部分。

环境是 Temurin JDK 25.0.4.1，编辑器用 VS Code。源文件都是 UTF-8，编译时带上 `-encoding UTF-8`，不然中文会乱码。

## 目录

按提交先后分，目录号不是课号。

```text
Javastudy/
├── lesson01/   第一个程序
├── lesson02/   分支控制（if、switch）
├── lesson03/   循环（for、嵌套、几个小应用）
├── lesson04/   数组（一维、二维）
└── lesson06/   数组收尾（动态二维、成绩统计）
```

lesson05 这个号没用上，直接跳到 06 了。

## 怎么跑

lesson01 到 lesson04 的文件都声明了 package，编译时要指定输出目录，运行时写「包名.类名」而不是文件名：

```bash
javac -encoding UTF-8 -d out lesson02/ScoreLevel.java
java -cp out lesson02.ScoreLevel
```

一次编译全部（PowerShell）：

```powershell
javac -encoding UTF-8 -d out (Get-ChildItem lesson0*\*.java).FullName
```

cmd 下换成逐个目录列举：

```bat
javac -encoding UTF-8 -d out lesson01\*.java lesson02\*.java lesson03\*.java lesson04\*.java
```

lesson06 的两个文件还没写 package 声明，在 VS Code 里点 Run 就能跑，`javac SeatFill.java` 也行。下次补上，跟前几课统一。

Windows 控制台如果运行结果里的中文是乱码，先 `chcp 65001` 切到 UTF-8。VS Code 内置终端一般不用改。

`out/` 已经在 .gitignore 里。

## 里面有什么

lesson01 只有 HelloWorld，用来确认 JDK 装好了。

lesson02 是 if 和 switch。IfDemo 讲单分支和代码块，Warmup 是默写类骨架的热身，ScoreLevel 把分数分成五档，DayCheck 和 ScoreLevelSwitch 分别用 switch 做星期判断和成绩分流。

lesson03 是循环。ForDemo 求和，CountTo7 用 while 数到 7，DeepLoop 是嵌套，NineNine 打九九乘法表，PrimeTable 筛出 100 以内的素数。

lesson04 是数组。ArrayTraverse 遍历一维数组，ArrayMaxMin 求最大最小值，ArraySeat 打一张二维座位表。

lesson06 接着数组收尾。SeatFill 用 new 建一张 5 行 4 列的空表，再用公式把 1 到 20 填进去；ScoreStats 统计五个成绩的总分、平均、最高分、最低分和不及格人数。

## 写代码的习惯

文件名和类名一致，一个文件一个 public class。`.class` 和 `out/` 不入库。

提交说明写成「目录 + 动作 + 内容」，比如：

- `lesson04 新增 ArraySeat.java（二维数组座位表）`
- `lesson03 修正 NineNine 内层循环边界`

只推 main，不开分支。
