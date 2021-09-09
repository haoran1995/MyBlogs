# Scanner使用出错

1.没有导入包会提示符号错误

![](https://ldsoy.coding.net/p/PC/d/Img/git/raw/master/MDimg/202109091648922.png)

所以要导入包

```java
import java.util.Scanner;
```

2.还有个疑问就是：代码是这样的

```java
		//输入语句
		System.out.println("请键第一个值：");
		Scanner a = new Scanner(System.in);
		System.out.println("请键第二个值：");
		Scanner b = new Scanner(System.in);
```

但是在cmd命令里面还没有输入第一个值呢，就出来了“请键入第二个值”

![](https://ldsoy.coding.net/p/PC/d/Img/git/raw/master/MDimg/202109091651783.png)

