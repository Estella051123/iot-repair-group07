# 实际测试记录

语言与版本：Java（OpenJDK 17.0.20.1 LTS / javac 17.0.20.1，Windows 11）

测试人员GitHub用户名：aaaslya

运行命令：javac StatusRule.java StatusRuleTest.java
          java StatusRuleTest

| 编号 | 当前状态 | 目标状态 | 预期 | 实际 | 结论 |
| --- | --- | --- | --- | --- | --- |
| T01 | PENDING | PROCESSING | true | true | PASS（允许：开始维修）|
| T02 | PROCESSING | COMPLETED | true | true | PASS（允许：开始维修） |
| T03 | PENDING | COMPLETED | false | false | PASS（拒绝：跳级） |
| T04 | COMPLETED | PROCESSING | false | false | PASS（拒绝：回退） |

## 原始输出
待粘贴真实运行结果，不复制教程中的预期结果冒充证据。
T01 PASS: PENDING -> PROCESSING, expected=true, actual=true                                                             
T02 PASS: PROCESSING -> COMPLETED, expected=true, actual=true                                                           
T03 PASS: PENDING -> COMPLETED, expected=false, actual=false                                                            
T04 PASS: COMPLETED -> PROCESSING, expected=false, actual=false                                                         
Summary: 4/4 passed  

## 测试范围
本次规定4项测试，其他状态组合是否额外执行：未额外执行命令行测试。
从个人分支下载ZIP复测情况：C 从 feat/status-c分支 Code → Download ZIP，解压到新目录后重跑上面两条命令，记录结果。
从main下载ZIP最终复测情况：docs/submission.md记录。
