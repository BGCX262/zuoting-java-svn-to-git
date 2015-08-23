package conversion;

import java.util.Scanner;

/*
 * this program is to convert the number from one system to another
 * version 1
 * written by elfzuo
 * 2013-10-23
 */
/********************************************************************/
public class conversion {
/*
 * convertion类用来做进制转换
 * 类里封装了三个个函数分别操作把n进制数转换为10进制，把10进制数装换为n进制，
 * 以及检查数目是否符合进制规范
 */
	
	long ToTen(int n,String str){
		//将n进制数字的字符串转换成十进制
		long result = 0;//记录转换成十进制以后的数据
		int[] x = new int[str.length()];//创建一个与字符串长度相等的int型数组
		for(int i=0; i<str.length();i++)
		{
			//分别将字符串内的字符挨个转换为int型并存放到数组内
			char c = str.charAt(i);//挨个获取字符
			if(c>=65 && c<=70){//若在A--F内将数值装换为10--15的int型数据
				x[i] = (int)str.charAt(i)-55;
			}//if
			else if(c>=48 && c<=57){//若在1--9内则将数值装换为1--9的int型数据
				x[i] = (int)str.charAt(i)-48;
			}//else if
		}//for
		for(int i=0; i<x.length; i++){
			//按位乘以该位权值并逐位相加得到十进制结果
			long temp = (long)(x[i]*Math.pow(n,(x.length-1)-i));
			result += temp;
		}//for
		return result;
	}//ToTen
	
	
	void ToAny(int n,long num){
		//将十进制数转换为任意进制数
		long c = num/n;//c为传进来的num对进制n做除法
		long r = num%n;//r为传进来的num对进制取余
		if(c == 0){
			//若除法的余数为零
			if(r>=0 && r<=9){
				//将最后的余数转换为char型数据输出
				char ch = (char)(r+48);
				System.out.print(ch);
			}//if
			else if(r>=10 && r<=15)
			{
				//若在10--15范围则转换为A--F
				char ch = (char)(r+55);
				System.out.print(ch);
			}//else if
		}//if
		else{
			//若除法余数不为零，则需要递归继续进行除法
			this.ToAny(n,c);
			if(r>=0 && r<=9){
				//将最后的余数转换为char型数据输出
				char ch = (char)(r+48);
				System.out.print(ch);
			}//if
			else if(r>=10 && r<=15)
			{
				//若在10--15范围则转换为A--F
				char ch = (char)(r+55);
				System.out.print(ch);
			}//else if
		}//else
	}//ToAny
	
}//class
/*******************************************************************/
interface Check{
	//检查数目是否符合进制规范需要抛出CheckException
	void checknumber(String r) throws CheckException;
}
/*******************************************************************/
class CheckException extends Exception{
    //定义自己的异常类
	private static final long serialVersionUID = 1L;
	String message;//获取异常信息
	//用父类Exception的构造函数定义自己的错误信息
	public CheckException(String message){
		super(message);
		this.message = message;
	}
	void showInfor(){
		System.out.println(message);
	}
}
/*******************************************************************/
class TwoTo extends conversion implements Check{
	//二进制转换为任意进制类继承conversion类，需要重写checknumber方法
	@Override
	public void checknumber(String str) throws CheckException{
		// TODO Auto-generated method stub
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(!(ch>=48 && ch<=49)){
				throw new CheckException("二进制数据不符合规范");
			}//if
		}//for
	}//checknumber
	public long ToTen(String str){
		return super.ToTen(2, str);
	}
	
}
/*******************************************************************/
class EightTo extends conversion implements Check{
	//二进制转换为任意进制类继承conversion类，需要重写checknumber方法
	@Override
	public void checknumber(String str) throws CheckException{
		// TODO Auto-generated method stub
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(!(ch>=48 && ch<=55)){
				throw new CheckException("八进制数据不符合规范");
			}//if
		}//for
	}//checknumber
	public long ToTen(String str){
		return super.ToTen(8, str);
	}
	
}
/*******************************************************************/
class TenTo extends conversion implements Check{
	//二进制转换为任意进制类继承conversion类，需要重写checknumber方法
	@Override
	public void checknumber(String str) throws CheckException{
		// TODO Auto-generated method stub
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(!(ch>=48 && ch<=57)){
				throw new CheckException("十进制数据不符合规范");
			}//if
		}//for
	}//checknumber
	public long ToTen(String str){
		return super.ToTen(10, str);
	}
	
}
/*******************************************************************/
class SixteenTo extends conversion implements Check{
	//二进制转换为任意进制类继承conversion类，需要重写checknumber方法
	@Override
	public void checknumber(String str) throws CheckException{
		// TODO Auto-generated method stub
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(!((ch>=48 && ch<=57)||(ch>=65 && ch<=70))){
				throw new CheckException("十六进制数据不符合规范");
			}//if
		}//for
	}//checknumber
	public long ToTen(String str){
		return super.ToTen(16, str);
	}
	
}
/*******************************************************************/
class InputRequest{
	//该类用于请求用户输入
	public void request(){
		//要求用户输入待转换数的进制
		System.out.println("请输入待转换的数的进制(2,8,10,16)");
		Scanner scan1 = new Scanner(System.in);
		int befor = scan1.nextInt();
		//要求用户输入待转换数
		System.out.println("请输入待转换的数据");
		Scanner scan2 = new Scanner(System.in);
		String str = scan2.next();
		//要求用户输入转换后数的进制
		System.out.println("请输入转换后的数的进制(2,8,10,16)");
		Scanner scan3 = new Scanner(System.in);
		int after = scan3.nextInt();
		//判断转换前数的进制是否支持转换
		if(!(befor==2||befor==8||befor==10||befor==16)){
			System.out.println("待转换进制不支持");
		}//判断转换后数的进制是否支持转换
		else if(!(after==2||after==8||after==10||after==16)){
			System.out.println("要求的转换后进制不支持");
		}
		else{
			//若进制合理开始进行转换
			//通过用户输入的待转换数进制进行判断new的具体的类
			if(befor == 2){
				//待转换数进制为2则new TwoTo并执行封装在该类里的操作
					TwoTo con = new TwoTo();
					//checknumber方法抛出异常必须被捕获
				try{
					con.checknumber(str);
					long result = con.ToTen(str);
					con.ToAny(after, result);
				}catch(CheckException e){
					//打印信息
					e.showInfor();
				}
			}
			else if(befor == 8){
				//待转换数进制为8则new EightTo并执行封装在该类里的操作
				EightTo con = new EightTo();
				try{
					//checknumber方法抛出异常必须被捕获
					con.checknumber(str);
					long result = con.ToTen(str);
					con.ToAny(after, result);
				}catch(CheckException e){
					//打印信息
					e.showInfor();
				}
			}
			else if(befor == 10){
				//待转换数进制为10则new TenTo并执行封装在该类里的操作
				TenTo con = new TenTo();
				try{
					//checknumber方法抛出异常必须被捕获
					con.checknumber(str);
					long result = con.ToTen(str);
					con.ToAny(after, result);
				}catch(CheckException e){
					//打印信息
					e.showInfor();
				}
			}
			else if(befor == 16){
				//待转换数进制为16则new SixteenTo并执行封装在该类里的操作
				SixteenTo con = new SixteenTo();
				try{
					//checknumber方法抛出异常必须被捕获
					con.checknumber(str);
					long result = con.ToTen(str);
					con.ToAny(after, result);
				}catch(CheckException e){
					//打印信息
					e.showInfor();
				}
			}
		}
	}
}

