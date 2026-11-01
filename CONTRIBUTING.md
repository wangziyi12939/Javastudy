# 贡献指南

本仓库用于记录 Java 学习过程，同时作为完整的小型协作范例维护。修改代码或文档前，请先阅读本指南。

## 开始之前

- 环境为 JDK 25，源码不依赖第三方库。
- 大型重构、目录调整或课程范围变化，请先建立 Issue 讨论，避免无效劳动。
- 提交内容应与学习进度或仓库维护直接相关。

## 分支与 Pull Request

`main` 是受保护分支，不接收直接推送。所有修改通过专题分支和 Pull Request 合入。

1. 从最新 `main` 创建分支，名称使用英文小写与连字符：

   ```bash
   git switch main
   git pull --ff-only
   git switch -c feat/lesson09-inheritance
   ```

   建议前缀：`feat/` 新练习或功能、`fix/` 缺陷修复、`docs/` 文档、`chore/` 仓库维护。

2. 完成修改并在本地编译受影响的分组，命令示例见 README 与 `.github/workflows/java-ci.yml`。
3. 提交并推送专题分支：

   ```bash
   git add <修改的文件>
   git commit -m "lesson09 新增继承练习"
   git push -u origin feat/lesson09-inheritance
   ```

4. 在 GitHub 创建面向 `main` 的 Pull Request，填写模板中的改动与验证说明。
5. 等待 `Java CI / compile` 通过后再合并。单人仓库不要求他人批准，但不得绕过失败的检查。

## 提交说明

- 使用中文，首行写清「目录或范围 + 动作 + 内容」，不超过 50 个字符。
- 正文说明改了什么、为什么改；禁止 `update`、`修改`、`111` 等无信息说明。
- 一个提交只处理一件事，避免把无关改动混在一起。

示例：

```text
lesson08 修正 Shop 平均值的整数除法

avg() 原返回 int，30 加 51 的平均值会被截断。
改为 double 并显式转换被除数，输出保留小数。
```

## 代码约定

- 源文件名与 `public` 类名一致，每个文件只包含一个 `public class`。
- 保持 JDK 25 可编译，不引入第三方依赖。
- 新增练习若使用默认包，必须在 CI 中分配独立的编译输出目录，避免同名类冲突。
- 不提交 `*.class`、`out/`、IDE 配置或任何凭据。

## Pull Request 检查

- [ ] 改动范围与标题一致
- [ ] 已在本地编译受影响的分组
- [ ] `Java CI / compile` 通过
- [ ] README 或 CHANGELOG 已按需更新
- [ ] 未包含密码、密钥、个人信息或编译产物

## 反馈渠道

- 缺陷使用「缺陷报告」模板。
- 学习问题使用「学习问题」模板。
- 开放式讨论进入仓库 Discussions。
- 行为问题按照 [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) 处理。

## 许可

向本仓库提交贡献，即表示同意该贡献按 [MIT License](LICENSE) 授权。
