# 作业：部分SSA转换

### MF1933050 李贵银

### 1.实验步骤

- 下载[soot](https://soot-build.cs.uni-paderborn.de/public/origin/develop/soot/soot-develop/build/)
- 编写 `Test.java`
- 命令行输入 `Javac Test.java`将`Test.java`编译生成`Test.class`文件
- 命令行输入 `java -cp sootclasses-trunk-jar-with-dependencies.jar soot.Main -cp . -pp -f S Test`将`Test.class`转化成**shimple**文件，此时会生成一个文件夹 **sootOutput/Test.shimple**，包含结果文件**Test.shimple**。

### 2.实验分析

![result](https://github.com/lgyhhh/SoftwareAnalysisTest/blob/master/HW-SSA/result.png)

如上图所示，左边为`Test.java`，右边为生成的`Test.shimple`。

其中变量**a**是堆上的变量，变量**b**和**c**均是栈上的变量。

关于变量**a**，`Test.java`中的第2行的`a=1;`对应于`Test.shimple`中的第13行`r0.<Test: int a> = 1`，第9行的`a=4`;对应于右边的第31行的`r0.<Test: int a> = 4;`，第14行的`a=6;`对应于右边的38行的`r0.<Test: int a> = 6;`，第17行的`a=8;`对应于右边的第43行`r0.<Test: int a> = 8;`。

关于变量**b**，`Test.java`的第5行`int b=2;`对应于右边的第25行的`b0 = 2;`第10行的`b=5;`对应于右边的第33行的`b2 = 5;`，第15行的`b=7`;对应于右边的第40行的`b3 = 7;`，而第18行的`b=9`对应于右边的第45行的`b4 = 9;`。

关于变量**c**，`Test.java`的第6行`int c=3;`对应于右边的第27行的`b1 = 3;`第19行的`c=10;`对应于右边的第47行的`b5 = 10;`。

可以看到，在赋值语句中变量**a**一直是由`r0.<Test: int a>`表示，而变量**b**分别由`b0`、`b2`、`b3`、`b4`表示，变量**c**分别由`b1`、`b5`表示，并且这些变量都只被赋值一次。即变量**a**没有进行转换，变量**b**和**c**都进行了转换。因此在通过**soot**中的**Shimple**进行的SSA转换是部分SSA转换，只是将栈上的变量进行转换和优化，不对堆上的变量进行转换和优化。



### 参考资料
* [Soot](https://github.com/Sable/soot)
* [Soot command-line options](https://soot-build.cs.uni-paderborn.de/public/origin/develop/soot/soot-develop/options/soot_options.htm#description)
* [A brief overview of Shimple](https://github.com/Sable/soot/wiki/A-brief-overview-of-Shimple)
