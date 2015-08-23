package com.elfzuo;
import java.util.Scanner;
import java.math.*;
/*
 * the test of the rational class
 * ver2
 * written by elfzuo
 * 2013.10.06
 */
public class MainClass {
	public static void main(String args[]){
		Scanner n1=new Scanner(System.in);//����һ��Scanner�����䴫�����ΪSystem.in 
		System.out.println("�������һ�����ķ�����");
		int numerator1 =n1.nextInt();//��ȡһ��int��ֵ
		
		Scanner d1=new Scanner(System.in);//����һ��Scanner�����䴫�����ΪSystem.in 
		System.out.println("�������һ�����ķ�ĸ��");
		int denominator1 =d1.nextInt();//��ȡһ��int��ֵ
		
		Scanner n2=new Scanner(System.in);//����һ��Scanner�����䴫�����ΪSystem.in 
		System.out.println("������ڶ������ķ�����");
		int numerator2 =n2.nextInt();//��ȡһ��int��ֵ
		
		Scanner d2=new Scanner(System.in);//����һ��Scanner�����䴫�����ΪSystem.in 
		System.out.println("������ڶ������ķ�ĸ��");
		int denominator2 =d2.nextInt();//��ȡһ��int��ֵ
		
		//����Rational�����r1,r2����ʼ��Ϊ���������ֵ
		Rational r1 = new Rational(numerator1,denominator1);
		Rational r2 = new Rational(numerator2,denominator2);
		//ͨ��Rational���add��������r1+r2
		Rational result = r1.add(r2);
		//��ȡ����ķ���ֵ�ͷ�ĸֵ
		int a = result.getNumerator();
		int b = result.getDenominator();
		//������
		System.out.println(numerator1+"/"+denominator1+"+"+numerator2+"/"+denominator2+"="+a+"/"+b);
		//ͨ��Rational���sub��������r1-r2
		result = r1.sub(r2);
		//��ȡ����ķ���ֵ�ͷ�ĸֵ
		a = result.getNumerator();
		b = result.getDenominator();
		//������
		System.out.println(numerator1+"/"+denominator1+"-"+numerator2+"/"+denominator2+"="+a+"/"+b);
		//ͨ��Rational���muti��������r1*r2
		result = r1.muti(r2);
		//��ȡ����ķ���ֵ�ͷ�ĸֵ
		a = result.getNumerator();
		b = result.getDenominator();
		//������
		System.out.println(numerator1+"/"+denominator1+"��"+numerator2+"/"+denominator2+"="+a+"/"+b);
		//ͨ��Rational���div��������r1/r2
		result = r1.div(r2);
		//��ȡ����ķ���ֵ�ͷ�ĸֵ
		a = result.getNumerator();
		b = result.getDenominator();
		//������
		System.out.println(numerator1+"/"+denominator1+"��"+numerator2+"/"+denominator2+"="+a+"/"+b);
		//ͨ��Rational���reci��������r1�ĵ���
		r1.reci();
		//ͨ��Rational���reci��������r2�ĵ���
		r2.reci();
		//ͨ��Rational���abs��������r1�ľ���ֵ
		result = r1.abs();
		//��ȡ����ķ���ֵ�ͷ�ĸֵ
		a = result.getNumerator();
		b = result.getDenominator();
		//������
		System.out.println(numerator1+"/"+denominator1+"�ľ���ֵ��"+a+"/"+b);
		//ͨ��Rational���abs��������r2�ľ���ֵ
		result = r2.abs();
		//��ȡ����ķ���ֵ�ͷ�ĸֵ
		a = result.getNumerator();
		b = result.getDenominator();
		//������
		System.out.println(numerator2+"/"+denominator2+"�ľ���ֵ��"+a+"/"+b);
		//����sinֵ
		r1.sin(r1);
		a = result.getNumerator();
		b = result.getDenominator();
		System.out.println("sin�������������"+a+"/"+b);
		//����ǰn��֮�ͣ�����k��������n���Ƚ��ж�ѭ���Ƿ����
		Scanner number=new Scanner(System.in);//����һ��Scanner�����䴫�����ΪSystem.in 
		System.out.println("������n");
		int n =number.nextInt();//��ȡһ��int��ֵ
		int k = 1;
		System.out.println("���� 2/1 + 3/2 + 5/3 + 8/5 + 13/8 ...��ֵ"+n+"���.");
		//��ʼ��sumΪ0����һ��Ϊ2/1
		Rational sum = new Rational(0,1);
		Rational item = new Rational(2,1);
		while(k<=n){
			sum = sum.add(item);//sum����ǰ��ÿһ��ĺ�
			k++;//k��������ÿ��ѭ����һ
			int fenzi = item.getNumerator();//��ȡ��ǰ����
			int fenmu = item.getDenominator();//��ȡ��ǰ��ĸ
			item.setNumeratorAndDenominator(fenzi+fenmu,fenzi);
			//������һ��ķ�������һ��ķ���Ϊ��һ��ķ��ӷ�ĸ֮�ͣ���һ��ķ���Ϊ��һ��ķ���
		}//while
		//ѭ���������ȡ����ķ��ӷ�ĸ
		a = sum.getNumerator();
		b = sum.getDenominator();
		//������
		System.out.println("�÷�����ʾ:");
		System.out.println(a+"/"+b);
		//ͨ��toBigDecimal()����������ת��ΪС��
		result = new Rational(a,b);
		BigDecimal decimalResult = result.toBigDecimal();
		System.out.println(decimalResult);
	}//fun main
}
