# 最终提交索引

小组仓库地址：https://github.com/Estella051123/iot-repair-group07

选定语言：Java（OpenJDK 17.0.20.1 / javac 17.0.20.1）

组号：07

|成员|GitHub用户名|任务Issue链接|主要PR链接|评审记录链接|
|-|-|-|-|-|
|A（组长）|Estella051123|[#1](https://github.com/Estella051123/iot-repair-group07/issues/1) \[A] 需求说明与用例图|[#2](https://github.com/Estella051123/iot-repair-group07/pull/2) A 需求说明与用例图|由 C（aaaslya）在 PR #2 上评审并批准|
|B|zq123641|[#5](https://github.com/Estella051123/iot-repair-group07/issues/5) \[B] 完成状态图与简单类图|[#6](https://github.com/Estella051123/iot-repair-group07/pull/6) 任务B 完成状态图与简单类图|由 A（Estella051123）在 PR #6 上评审并批准|
|C|aaaslya|[#3](https://github.com/Estella051123/iot-repair-group07/issues/3) \[C] 完成状态规则与测试|[#4](https://github.com/Estella051123/iot-repair-group07/pull/4) 状态判断函数与测试记录|由 B（zq123641）在 PR #4 上评审并批准|

评审方向符合分工：A 审 B、B 审 C、C 审 A。

## 成果位置

|内容|文件|
|-|-|
|3 条功能需求（FR-01 查看设备、FR-02 提交报修、FR-03 更新工单状态）|`docs/requirements.md`|
|用例图与用例说明|`docs/usecase.md`、`docs/assets/usecase.png`、`docs/assets/usecase.drawio`|
|状态图与简单类图|`docs/models.md`（Mermaid 源码即源材料）|
|状态判断函数|`src/java/StatusRule.java`（`canTransition`）|
|测试记录|`docs/test-results.md`|

## 最终复核

复核方式：合并后在 main 分支点 `Code → Download ZIP`，解压到新目录，进入 `src/java` 执行：

```
javac StatusRule.java StatusRuleTest.java
java StatusRuleTest
```

main 下载 ZIP 后运行的实际结果：4/4 passed，退出码 0。复核目录 C:\\Users\\lenovo\\Desktop\\iot-repair-group07-main\\src\\java，输出如下：



T01 PASS: PENDING -> PROCESSING, expected=true, actual=true

T02 PASS: PROCESSING -> COMPLETED, expected=true, actual=true

T03 PASS: PENDING -> COMPLETED, expected=false, actual=false

T04 PASS: COMPLETED -> PROCESSING, expected=false, actual=false

Summary: 4/4 passed



## 个人简短总结

A：负责 `docs/requirements.md` 的三条功能需求与 `docs/usecase.md` 的用例图，完成仓库初始化、Issue 建立与提交索引整理；评审了 B 的模型 PR（#6），确认状态图只保留两条允许转换、类图多重性方向正确，并修正该 PR 的任务关联写法使其能在合并后自动关闭 Issue #5。

B：负责 `docs/models.md` 的状态图与简单类图，采用 Mermaid 作为源材料；评审了 C 的代码 PR（#4），核对其拒绝跳级与回退、测试记录包含真实运行命令与输出。

C：负责 `src/java/StatusRule.java` 的 `canTransition` 与 `docs/test-results.md`；评审了 A 的需求 PR（#2），核对三条需求字段齐全、报修单初始状态为 PENDING、用例图两个参与者与三个用例对应正确。

## 验收清单

* \[x] 3 条功能需求完整
* \[x] 3 种图齐全且源材料可编辑（用例图为 PNG 加 drawio 源文件；状态图与类图为 Mermaid 源码）
* \[x] 一种语言的状态函数与 4 项测试（Java，4 项全部 PASS）
* \[x] 三人均有实际提交和同伴评审
* \[x] 三个主要 PR 均已合并
* \[x] 教师能够访问仓库（仓库为 Public）

