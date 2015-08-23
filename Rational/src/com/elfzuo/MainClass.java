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
		Scanner n1=new Scanner(System.in);//构造一个Scanner对象，其传入参数为System.in 
		System.out.println("请输入第一个数的分子数");
		int numerator1 =n1.nextInt();//读取一个int数值
		
		Scanner d1=new Scanner(System.in);//构造一个Scanner对象，其传入参数为System.in 
		System.out.println("请输入第一个数的分母数");
		int denominator1 =d1.nextInt();//读取一个int数值
		
		Scanner n2=new Scanner(System.in);//构造一个Scanner对象，其传入参数为System.in 
		System.out.println("请输入第二个数的分子数");
		int numerator2 =n2.nextInt();//读取一个int数值
		
		Scanner d2=new Scanner(System.in);//构造一个Scanner对象，其传入参数为System.in 
		System.out.println("请输入第二个数的分母数");
		int denominator2 =d2.nextInt();//读取一个int数值
		
		//声明Rational类变量r1,r2并初始化为键盘输入的值
		Rational r1 = new Rational(numerator1,denominator1);
		Rational r2 = new Rational(numerator2,denominator2);
		//通过Rational类的add方法计算r1+r2
		Rational result = r1.add(r2);
		//获取结果的分子值和分母值
		int a = result.getNumerator();
		int b = result.getDenominator();
		//输出结果
		System.out.println(numerator1+"/"+denominator1+"+"+numerator2+"/"+denominator2+"="+a+"/"+b);
		//通过Rational类的sub方法计算r1-r2
		result = r1.sub(r2);
		//获取结果的分子值和分母值
		a = result.getNumerator();
		b = result.getDenominator();
		//输出结果
		System.out.println(numerator1+"/"+denominator1+"-"+numerator2+"/"+denominator2+"="+a+"/"+b);
		//通过Rational类的muti方法计算r1*r2
		result = r1.muti(r2);
		//获取结果的分子值和分母值
		a = result.getNumerator();
		b = result.getDenominator();
		//输出结果
		System.out.println(numerator1+"/"+denominator1+"×"+numerator2+"/"+denominator2+"="+a+"/"+b);
		//通过Rational类的div方法计算r1/r2
		result = r1.div(r2);
		//获取结果的分子值和分母值
		a = result.getNumerator();
		b = result.getDenominator();
		//输出结果
		System.out.println(numerator1+"/"+denominator1+"÷"+numerator2+"/"+denominator2+"="+a+"/"+b);
		//通过Rational类的reci方法计算r1的倒数
		r1.reci();
		//通过Rational类的reci方法计算r2的倒数
		r2.reci();
		//通过Rational类的abs方法计算r1的绝对值
		result = r1.abs();
		//获取结果的分子值和分母值
		a = result.getNumerator();
		b = result.getDenominator();
		//输出结果
		System.out.println(numerator1+"/"+denominator1+"的绝对值是"+a+"/"+b);
		//通过Rational类的abs方法计算r2的绝对值
		result = r2.abs();
		//获取结果的分子值和分母值
		a = result.getNumerator();
		b = result.getDenominator();
		//输出结果
		System.out.println(numerator2+"/"+denominator2+"的绝对值是"+a+"/"+b);
		//计算sin值
		r1.sin(r1);
		a = result.getNumerator();
		b = result.getDenominator();
		System.out.println("sin函数计算后结果是"+a+"/"+b);
		//计算前n项之和，设置k做计数与n作比较判断循环是否结束
		Scanner number=new Scanner(System.in);//构造一个Scanner对象，其传入参数为System.in 
		System.out.println("请输入n");
		int n =number.nextInt();//读取一个int数值
		int k = 1;
		System.out.println("计算 2/1 + 3/2 + 5/3 + 8/5 + 13/8 ...的值"+n+"项和.");
		//初始化sum为0，第一项为2/1
		Rational sum = new Rational(0,1);
		Rational item = new Rational(2,1);
		while(k<=n){
			sum = sum.add(item);//sum等于前面每一项的和
			k++;//k做计数，每次循环加一
			int fenzi = item.getNumerator();//获取当前分子
			int fenmu = item.getDenominator();//获取当前分母
			item.setNumeratorAndDenominator(fenzi+fenmu,fenzi);
			//设置下一项的分数，下一项的分子为上一项的分子分母之和，下一项的分子为上一项的分子
		}//while
		//循环结束后获取结果的分子分母
		a = sum.getNumerator();
		b = sum.getDenominator();
		//输出结果
		System.out.println("用分数表示:");
		System.out.println(a+"/"+b);
		//通过toBigDecimal()方法将分数转化为小数
		result = new Rational(a,b);
		BigDecimal decimalResult = result.toBigDecimal();
		System.out.println(decimalResult);
	}//fun main
}
