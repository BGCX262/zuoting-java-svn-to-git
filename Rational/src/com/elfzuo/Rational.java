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
	int numerator;//����
	int denominator;//��ĸ
	Rational(){//��һ���޲ι��캯��
		
	}//fun Rational()
	Rational(int a, int b){//�������Ĺ��캯��
		if(a == 0){//���������Ϊ0������������ʼ��δ0����Ĭ�Ϸ�����Ϊ0����ĸ��Ϊ1
			numerator = 0;
			denominator = 1;
		}//if
		else{//����������Ϊ�㣬�򴫲���������setNumeratorAndDenominator(),���÷���ֵ
			setNumeratorAndDenominator(a,b);
		}//else
	}//fun Rational(int a,int b)
	void setNumeratorAndDenominator(int a, int b){//���÷��Ӻͷ�ĸ
		int c = f(Math.abs(a),Math.abs(b));//�������Լ��
		numerator = a/c;
		denominator = b/c;
		if(numerator < 0 && denominator < 0){
			numerator = -numerator;
			denominator = -denominator;
		}//if
	}//fun setNumeratorAndDenominator(int a, int b)
	int getNumerator(){//��ȡ����ֵ
		return numerator;
	}//int getNumerator
	int getDenominator(){//��ȡ��ĸֵ
		return denominator;
	}//int getDenominator
	int f(int a, int b){//��a��b�����Լ��
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
	Rational add(Rational r){//�ӷ�����
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b + denominator * a;
		int newDenominator = denominator * b;
		Rational result = new Rational(newNumerator,newDenominator);
		return result;
	}//fun add(Rational r)
	Rational sub(Rational r){//��������
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b - denominator * a;
		int newDenominator = denominator * b;
		Rational result = new Rational(newNumerator,newDenominator);
		return result;
	}//fun sub
	Rational muti(Rational r){//�˷�����
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * a;
		int newDenominator = denominator * b;
		Rational result = new Rational(newNumerator,newDenominator);
		return result;
	}//fun muti
	Rational div(Rational r){//��������
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newNumerator = numerator * b;
		int newDenominator = denominator * a;
		Rational result = new Rational(newNumerator,newDenominator);
		return result;
	}//fun div
	void reci(){//��������
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
				System.out.println(numerator+"/"+denominator+"�ĵ�����"+newNumerator+"/"+newDenominator);
			}
			else{
				System.out.println("0û�е���");
			}
	}
	Rational abs(){//�����ֵ
		int newNumerator;
		int newDenominator;
		newNumerator = Math.abs(numerator);//�ֱ𽫷��ӷ�ĸת��Ϊ����ֵ
		newDenominator = Math.abs(denominator);
		Rational result = new Rational(newNumerator,newDenominator);
		return result;
	}
	BigDecimal toBigDecimal(){//������ת��ΪС��
		BigDecimal decimalResult = new BigDecimal((1.0*numerator)/denominator);
		return decimalResult;
	}
	Rational toRational(double r){//��С��ת��Ϊ����(����ȷ�����ٸĽ�)
		NumberFormat  formater  =  DecimalFormat.getInstance();  
		formater.setMaximumFractionDigits(2);  //����С�������ĸ��� 
		formater.setMinimumFractionDigits(2);  //����С�������̵ĸ��� 
		String s1 = formater.format(r);
		String s2 = s1.substring(0, s1.indexOf(".")) + s1.substring(s1.indexOf(".")+1);
		int IntegerResult = Integer.parseInt(s2);
		Rational result = new Rational(IntegerResult,100);
		return result;
	}
	//���Խ�double������ת��Ϊ�����������math�ĺ����������������תΪΪ������sin����Ϊ��
	void sin(Rational r){
		try{
			double number = (numerator*1.0)/denominator;
			double doubleResult = Math.sin(number);
			toRational(doubleResult);
		}catch(Exception e){
			System.out.println("���ܽ������Ǻ�������");
		}
	}
}//class Rational
