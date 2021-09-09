# 用JAVA实现三位数中的水仙花数统计

```java
/*
需求：三位数中的水仙花数，统计个数并输出谁是

分析：[100-999]  个 十 百分别的立方之和等于本身
		个位：i%100%10
		十位：(i%100-i%100%10)/10
		百位：(i-i%100)/100
过程：
		1.定义统计水仙花数的数量的变量
		2.for循环100-999
		3.for循环内部用if判断水仙花，如果是，水仙花+1，并输出当前的数
		4.跳出循环并输出有多少水仙花数
*/
class Flower{
	
	public static void main(String args[]){
		
		//1.定义统计水仙花数数量的变量
		int flowers = 0;
		
		//2.for循环100-999
		for(int i=100;i<=999;i++){
			//3.for循环内部判断水仙花，如果是，水仙花+1（定义水仙花数的变量），并输出当前的数
			//个位
			int a = i%100%10;
			//十位
			int b =(i%100-i%100%10)/10;
			//百位
			int c =(i-i%100)/100;
			
			//判断是否为水仙花数
			if(i==a*a*a+b*b*b+c*c*c){
				flowers++;
				System.out.println(i+"是水仙花数");
			}		
		}
		//4.跳出循环并输出有多少水仙花数
		System.out.println("共有"+flowers+"个水仙花数");
	}
}
```

运行结果：

![](https://ldsoy.coding.net/p/PC/d/Img/git/raw/master/MDimg/202109092156355.png)

