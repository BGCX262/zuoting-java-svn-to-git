package LargeNumberCalculate;
import java.math.*;
/*
 * the test of calculation between two positive large numbers
 * ver1
 * written by elfzuo
 * 2013.9.17
 */
public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = {0,9,9,7,9,4,5,6,7,2,3,4,5,6,4,7,8,9,8,7,6,9};
		//int[] b = {0,0,5,9,1,6,4,5,6,2,3,4,5,7,2,1,3,4,0,3,2,9};
		int[] a = {0,1,0};
		int[] b = {0,1,1};
		LargeNumber test = new LargeNumber();
		test.plus(a,b);
		test.sub(a,b);
		//乘除法试用BigInteger求解
		BigInteger num1 = new BigInteger("5");
		BigInteger num2 = new BigInteger("0");
		BigInteger addresult = num1.add(num2);
		System.out.println(num1+"+"+num2+"="+addresult);
		BigInteger subresult = num1.subtract(num2);
		System.out.println(num1+"-"+num2+"="+subresult);
		BigInteger mutiresult = num1.multiply(num2);
		System.out.println(num1+"×"+num2+"="+mutiresult);
		try{
			BigInteger divresult = num1.divide(num2);
			System.out.println(num1+"÷"+num2+"="+divresult);
		}catch(ArithmeticException e){
			System.out.println("除数不能为零");
		}
		
		
	}//main
}
