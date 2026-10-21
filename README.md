# Javastudy

Java 零基础学习代码库 —— 软考高级「系统架构设计师」备考的**阶段一（Java 基础）**配套练习。

- 环境：Temurin JDK 25.0.4.1 LTS
- 编辑器：VS Code
- 编码：所有源文件 **UTF-8**，编译时必须带 `-encoding UTF-8`

## 目录结构

按学习阶段分目录。

```
Javastudy/
├── lesson01/   环境与第一个程序
├── lesson02/   分支控制（if / switch）
├── lesson03/   循环控制（for / 嵌套 / 循环应用）
├── lesson04/   数组（一维 / 二维）
├── README.md
└── .gitignore
```

## 编译与运行

因为用了 package，**`-d out` 是必需的**。

```bash
# 编译单个文件
javac -encoding UTF-8 -d out lesson02/ScoreLevel.java

# 运行：写「包名.类名」，不是文件名
java -cp out lesson02.ScoreLevel
```

一次编译全部 ：

```powershell
javac -encoding UTF-8 -d out (Get-ChildItem lesson0*\*.java).FullName
```

cmd 用户把 `lesson0*/` 换成逐目录列举：

```bat
javac -encoding UTF-8 -d out lesson01\*.java lesson02\*.java lesson03\*.java lesson04\*.java
```

`out/` 已被 `.gitignore` 排除。

## 文件清单

### lesson01 —— 环境

| 文件 | 内容 |
| --- | --- |
| `HelloWorld.java` | 第一个程序，验证 JDK 环境 |

### lesson02 —— 分支控制

| 文件 | 内容 |
| --- | --- |
| `IfDemo.java` | 单 `if` 与代码块，类骨架重教 |
| `Warmup.java` | 类骨架与 main 方法默写热身 |
| `ScoreLevel.java` | 五档 `if-else if-else` 成绩分流 |
| `DayCheck.java` | `switch` 星期判断 |
| `ScoreLevelSwitch.java` | 用 `switch` 改写成绩分流 |

### lesson03 —— 循环控制

| 文件 | 内容 |
| --- | --- |
| `ForDemo.java` | `for` 循环求和 |
| `CountTo7.java` | `while` 计数 |
| `DeepLoop.java` | 循环嵌套 |
| `NineNine.java` | 九九乘法表 |
| `PrimeTable.java` | 100 以内素数表（循环 + 取模判断） |

### lesson04 —— 数组

| 文件 | 内容 |
| --- | --- |
| `ArrayTraverse.java` | 一维数组遍历 |
| `ArrayMaxMin.java` | 一维数组求最大值、最小值 |
| `ArraySeat.java` | 二维数组座位表 |

## 提交规范

- 一个 `.java` 文件一个 `public class`，**文件名 = 类名**
- 每个目录对应一个 package，新文件放进对应目录并在首行写 `package lesson0X;`
- `.class` 与 `out/` 编译产物不入库
- 提交说明格式：`<目录> <动作> <内容>`，例：
  - `lesson04 新增 ArraySeat.java（二维数组座位表）`
  - `lesson03 修正 NineNine 内层循环边界`
- 只往 `main` 提交，个人学习库不开分支
