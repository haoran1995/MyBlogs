/*
需求：比较输入两个数的大小

分析：用Scanner输入两个对象用textInt()方法强制转换成整型进行比较

步骤：
	1.Scanner 变量名A = new Scanner(System.in);输入两个Scanner的对象
	2.int 变量名B = 变量名A.nextInt();
	3.用if语句进行比较
*/	
import java.util.*;
class If{
	public static void main(String args[]){
		
		//输入语句
		System.out.println("请键第一个值：");
		Scanner a = new Scanner(System.in);
		Float x = a.nextFloat();
		System.out.println("请键第二个值：");
		
		Scanner b = new Scanner(System.in);
		int y = b.nextInt();
	
		
	
		
		//IF语句进行比较
		if(x > y){
			System.out.println("X>Y");
		}else{
			System.out.println("X<=Y");
		}
	}
}