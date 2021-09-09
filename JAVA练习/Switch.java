/*
需求：输入一个学生分数，用Switch语句来实现对分数的分类

分析：
	用Scanner输入一个分数强制转换整形
	把分数分为
				不及格 -1：[0-60
				良好 0：60-80]
				优秀 1：80-100]

步骤：先输入分数，然后if语句判断成绩的区间，然后switch，自己出的题感觉有点多此一举，那就随便写吧		
*/
//导入Scanner包
import java.util.Scanner;

class Switch{
	public static void main (String args[]){
		
		//输入语句
		System.out.println("请输入一个0-100的成绩：");
		Scanner x = new Scanner(System.in);
		int score = x.nextInt();
		int y = 0;
		
		//判断分数所在区间
		if(0<=score&&score<60){
			y=-1;
		}else if(60<=score&&score<80){
			y=0;
		}else if(80<=score&&score<100){
			y=1;
		}
		//if有点多次一举，故意的
		
		//用switch进行分类
		switch(y){
			case -1:
			System.out.println("该学生成绩不及格");
			case 0:
			System.out.println("该学生成绩良好");
			case 1:
			System.out.println("该学生成绩优秀");
		}
		
		
	}
}