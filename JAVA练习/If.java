/*
���󣺱Ƚ������������Ĵ�С

��������Scanner��������������textInt()����ǿ��ת�������ͽ��бȽ�

���裺
	1.Scanner ������A = new Scanner(System.in);��������Scanner�Ķ���
	2.int ������B = ������A.nextInt();
	3.��if�����бȽ�
*/	
import java.util.*;
class If{
	public static void main(String args[]){
		
		//�������
		System.out.println("�����һ��ֵ��");
		Scanner a = new Scanner(System.in);
		Float x = a.nextFloat();
		System.out.println("����ڶ���ֵ��");
		
		Scanner b = new Scanner(System.in);
		int y = b.nextInt();
	
		
	
		
		//IF�����бȽ�
		if(x > y){
			System.out.println("X>Y");
		}else{
			System.out.println("X<=Y");
		}
	}
}