# 更新日志

本文件记录仓库内容的增删改，格式参照 [Keep a Changelog](https://keepachangelog.com/zh-CN/1.1.0/)。版本号按学习阶段递增，不代表发布包；逐次提交的原始记录以 `git log` 为准。

## [Unreleased]

## [0.5.0] - 2026-11-06

### 变更

- 全部课次统一声明与目录同名的 `package`，`lesson06` 至 `lesson10` 补上包声明。编译与运行命令统一为 `javac -encoding UTF-8 -d out 课次/*.java` 与 `java -cp out 包名.类名`
- `lesson08/AllInOne.java` 的演示类改名为 `DemoStudent`，`lesson08/ThreeStudents.java` 改名为 `StudentInfo`，消除同包内 `Student` 三重定义
- Java CI 由 14 个分组编译简化为逐课整课编译，不再依赖分组输出目录隔离同名类
- 运行命令统一追加 `-Dstdout.encoding=UTF-8`，修正 Git Bash 与 VS Code 集成终端的中文输出乱码

### 修复

- README 环境准备中的 JDK 版本由 25.0.4.1 更正为 25.0.5
- 旧版 README 称「`lesson06` 起使用默认包、不能一次性编译」，随包结构统一失效，已删去

## [0.4.0] - 2026-11-01

### 新增

- `lesson07`：补充方法调用、重载与递归练习
- `lesson08`：补充类、对象、构造器、实例状态与对象交互练习
- Java CI：按练习分组隔离编译，规避默认包中的同名类冲突
- 社区规范：MIT 许可证、贡献指南、行为准则、CODEOWNERS 与 Issue/PR 模板

### 变更

- README 对齐至 `lesson08`，补全目录、文件说明与分组编译方式
- `lesson08/Shop.java` 的平均值改为 `double`，避免整数除法丢失小数
- README 许可说明由「保留所有权利」改为 MIT License

## [0.3.0] - 2026-10-22

### 新增

- `lesson06/SeatFill.java`：用 `new` 建 5 行 4 列的空表，按公式填入 1 到 20
- `lesson06/ScoreStats.java`：统计五个成绩的总分、平均分、最高分、最低分与不及格人数

### 变更

- README 对齐实际目录与运行方式
- `lesson06` 源码补行注释

## [0.2.0] - 2026-10-21

### 新增

- `.gitignore`：排除 `*.class`、`out/`、`build/`、`target/`、`web-frontend/` 与编辑器配置
- `lesson02`、`lesson03`、`lesson04` 共 13 个练习文件

### 变更

- 目录按课次分层，`lesson01` 到 `lesson04` 各自成目录，源码加 `package` 声明
- README 扩写为完整说明

### 移除

- `HelloWorld.class` 移出版本库

## [0.1.0] - 2026-10-11

### 新增

- `HelloWorld.java`：验证 JDK 安装
- `.gitattributes`：统一换行符
