package commonmeasure;
import java.util.*;
/*
 * calculate the common divisor and common multiple between two numbers
 * ver1
 * written by elfzuo
 * 2013.10.14
 */
class CommonDivisor{
	//��շת������������Լ��
	public int f(int a,int b){
		//ʵ�����Լ���㷨
		if(a<b){
			//��֤a<b
			int c = a;
			a = b;
			b = c;
		}
		int r = a%b;
        while(r!=0){
        	//��a��bȡ�಻Ϊ�㣬���������ͽϴ���������������ѭ������ֱ������Ϊ��
        	a = b;
        	b = r;
        	r = a%b;
        }
        return b;//����Ϊ������õ���b��Ϊ���Լ��
    }
}
class CommonMultiple extends CommonDivisor{
	public int f(int a,int b){
		//��д����f����ʵ����С����������
		int m = super.f(a, b);//���ø����f�����������Լ��������m
		return (a*b)/m;//ͨ����ʽ������С������
	}
}

public class CommonMeasure {
	//������
	public static void main(String[] args){
		int a,b,result;//�ֱ��¼������������ͼ�����
		//Ҫ���û������һ������
		System.out.println("�����������Լ������С�������ĵ�һ����");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		//Ҫ���û�����ڶ�������
		System.out.println("�����������Լ������С�������ĵڶ�����");
		scanner = new Scanner(System.in);
		b = scanner.nextInt();
		//����û�ָ���������Լ�����㲢������
		CommonDivisor cd = new CommonDivisor();
		result = cd.f(a, b);
		System.out.println("�������ֵ����Լ��Ϊ:"+result);
		//����û�ָ��������С���������㲢������
		CommonMultiple cm = new CommonMultiple();
		result = cm.f(a, b);
		System.out.println("�������ֵ���С������Ϊ:"+result);
	}
}