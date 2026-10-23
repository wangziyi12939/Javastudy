# 更新日志

本文件记录仓库内容的增删改，格式参照 [Keep a Changelog](https://keepachangelog.com/zh-CN/1.1.0/)。版本号按学习阶段递增，不代表发布包；逐次提交的原始记录以 `git log` 为准。

## [Unreleased]

### 变更

- README 按通用结构重排，补简介、安装与环境、预期输出、许可四节，删去与目录实际不符的描述
- 新增本文件

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
