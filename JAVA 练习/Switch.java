/*
��������һ��ѧ����������Switch�����ʵ�ֶԷ����ķ���

������
	��Scanner����һ������ǿ��ת������
	�ѷ�����Ϊ
				������ -1��[0-60
				���� 0��60-80]
				���� 1��80-100]

���裺�����������Ȼ��if����жϳɼ������䣬Ȼ��switch���Լ�������о��е���һ�٣��Ǿ����д��		
*/
//����Scanner��
import java.util.Scanner;

class Switch{
	public static void main (String args[]){
		
		//�������
		System.out.println("������һ��0-100�ĳɼ���");
		Scanner x = new Scanner(System.in);
		int score = x.nextInt();
		int y = 0;
		
		//�жϷ�����������
		if(0<=score&&score<60){
			y=-1;
		}else if(60<=score&&score<80){
			y=0;
		}else if(80<=score&&score<100){
			y=1;
		}
		//if�е���һ�٣������
		
		//��switch���з���
		switch(y){
			case -1:
			System.out.println("��ѧ���ɼ�������");
			case 0:
			System.out.println("��ѧ���ɼ�����");
			case 1:
			System.out.println("��ѧ���ɼ�����");
		}
		
		
	}
}