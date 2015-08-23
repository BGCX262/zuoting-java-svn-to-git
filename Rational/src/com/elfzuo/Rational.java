package com.elfzuo;
import java.math.*;
import java.text.*;
/*
 * the encapsulation of the rational class
 * ver2
 * written by elfzuo
 * 2013.10.06
 */
public class Rational {
	int numerator;//分子
	int denominator;//分母
	Rational(){//做一个无参构造函数
		
	}//fun Rational()
	Rational(int a, int b){//带参数的构造函数
		if(a == 0){//如果分子数为0，则整个分数始终未0，则默认分子数为0，分母数为1
			numerator = 0;
			denominator = 1;
		}//if
		else{//若分子数不为零，则传参数到方法setNumeratorAndDenominator(),设置分数值
			setNumeratorAndDenominator(a,b);
		}//else
	}//fun Rational(int a,int b)
	void setNumeratorAndDenominator(int a, int b){//设置分子和分母
		int c = f(Math.abs(a),Math.abs(b));//计算最大公约数
		numerator = a/c;
		denominator = b/c;
		if(numerator < 0 && denominator < 0){
			numerator = -numerator;
			denominator = -denominator;
		}//if
	}//fun setNumeratorAndDenominator(int a, int b)
	int getNumerator(){//获取分子值
		return numerator;
	}//int getNumerator
	int getDenominator(){//获取分母值
		return denominator;
	}//int getDenominator
	int f(int a, int b){//求a和b的最大公约数
		if(a<b){
			int c = a;
			a = b;
			b = c;
		}//if
		int r = a%b;
		while(r != 0){
			a = b;
			b = r;
			r = a%b;
		}//while
		return b;
	}//fun f
	Rational add(Rational r){//加法运算
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b + denominator * a;
		int newDenominator = denominator * b;
		Rational result = new Rational(newNumerator,newDenominator);
		return result;
	}//fun add(Rational r)
	Rational sub(Rational r){//减法运算
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b - denominator * a;
		int newDenominator = denominator * b;
		Rational result = new Rational(newNumerator,newDenominator);
		return result;
	}//fun sub
	Rational muti(Rational r){//乘法运算
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * a;
		int newDenominator = denominator * b;
		Rational result = new Rational(newNumerator,newDenominator);
		return result;
	}//fun muti
	Rational div(Rational r){//除法运算
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b;
		int newDenominator = denominator * a;
		Rational result = new Rational(newNumerator,newDenominator);
		return result;
	}//fun div
	void reci(){//求倒数运算
			int newNumerator;
			int newDenominator;
			if(!(denominator>0 && numerator<0)){
				newNumerator = denominator;
				newDenominator = numerator;
			}
			else{
				newNumerator = -denominator;
				newDenominator = -numerator;
			}
			if(newDenominator != 0){
				System.out.println(numerator+"/"+denominator+"的倒数是"+newNumerator+"/"+newDenominator);
			}
			else{
				System.out.println("0没有倒数");
			}
	}
	Rational abs(){//求绝对值
		int newNumerator;
		int newDenominator;
		newNumerator = Math.abs(numerator);//分别将分子分母转化为绝对值
		newDenominator = Math.abs(denominator);
		Rational result = new Rational(newNumerator,newDenominator);
		return result;
	}
	BigDecimal toBigDecimal(){//将分数转换为小数
		BigDecimal decimalResult = new BigDecimal((1.0*numerator)/denominator);
		return decimalResult;
	}
	Rational toRational(double r){//将小数转换为分数(不精确，会再改进)
		NumberFormat  formater  =  DecimalFormat.getInstance();  
		formater.setMaximumFractionDigits(2);  //设置小数点后最长的个数 
		formater.setMinimumFractionDigits(2);  //设置小数点后最短的个数 
		String s1 = formater.format(r);
		String s2 = s1.substring(0, s1.indexOf(".")) + s1.substring(s1.indexOf(".")+1);
		int IntegerResult = Integer.parseInt(s2);
		Rational result = new Rational(IntegerResult,100);
		return result;
	}
	//可以将double型数据转换为分数便可以用math的函数进行任意计算再转为为分数，sin函数为例
	void sin(Rational r){
		try{
			double number = (numerator*1.0)/denominator;
			double doubleResult = Math.sin(number);
			toRational(doubleResult);
		}catch(Exception e){
			System.out.println("不能进行三角函数计算");
		}
	}
}//class Rational
