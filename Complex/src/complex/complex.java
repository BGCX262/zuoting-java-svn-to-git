package complex;
import java.util.*;
/*
 * the encapsulation of the complex number
 * ver1
 * written by elfzuo
 * 2013.10.14
 */
public class complex {
    int a,b;
	complex(int a,int b){
		//带参的构造函数，初始化实部与虚部的值
		this.a = a;
		this.b = b;
	}
	complex(){
		//无参的构造函数，调用有参构造函数，初始化复数为0，即a=0,b=0
		this(0,0);
	}
	int getReal(){
		//获取实部的值
		return a;
	}
	int getImage(){
		//获取虚部的值
		return b;
	}
	void printcomplex(){
		//标准输出不同情况的复数
		if(a==0 && b==0){
			System.out.println(0);
		}
		else if(a==0 && b!=0){
			System.out.println(b+"i");
		}
		else if(a!=0 && b==0){
			System.out.println(a);
		}
		else if(b>0){
			System.out.println(a+"+"+b+"i");
		}
		else{
			System.out.println(a+""+b+"i");
		}
		
	}
	void add(complex complex){
		//复数加法的实例方法，实部虚部分别相加
		int newa = a + complex.a;
		int newb = b + complex.b;
		//声明加后得到的新复数
		complex newcomplex = new complex(newa,newb);
		//输出新的复数
		newcomplex.printcomplex();
	}
	void sub(complex complex){
		//复数减法的实例方法，实部虚部分别相减
		int newa = a - complex.a;
		int newb = b - complex.b;
		//声明减后得到的新复数
		complex newcomplex = new complex(newa,newb);
		//输出新的复数
		newcomplex.printcomplex();
		
	}
	static void staticadd(complex a,complex b){
		//复数相加的类方法
		//分别将两个复数的实部，虚部相加
		int newa = a.a + b.a;
		int newb = a.b + b.b;
		//声明加后得到的新复数
		complex c = new complex(newa,newb);
		//输出新的复数
		c.printcomplex();
	}
	static void staticsub(complex a,complex b){
		//复数相减的类方法
		//分别将两个复数的实部，虚部相减
		int newa = a.a - b.a;
		int newb = a.b - b.b;
		//声明减后得到的新复数
		complex c = new complex(newa,newb);
		//输出新的复数
		c.printcomplex();
	}
}
class MainClass{
	public static void main(String[] args){
		int real,image;//记录需部值和实部值
		complex c = new complex();//调用无参方法创建complex实例c
		c.printcomplex();//输出c
		//要求用户输入第一个复数的实部和虚部
		System.out.println("输入第一个复数的实部");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("输入第一个复数的虚部");
		scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		complex c1 = new complex(a,b);//调用有参方法创建complex实例c1
		c1.printcomplex();//输出c1
		//要求用户输入第二个复数的实部和虚部
		System.out.println("输入第二个复数的实部");
		scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("输入第二个复数的虚部");
		scanner = new Scanner(System.in);
		b = scanner.nextInt();
		complex c2 = new complex(a,b);//调用有参方法创建complex实例c2
		
		real = c2.getReal();//通过getReal方法获取实部
		image = c2.getImage();//通过getImage方法获取需部
		//输出c2的实部和需部
		System.out.println("the real is "+real+","+"the image is "+image);
		//测试复数的加减法(实例方法)
		System.out.println("the function test");
		c2.add(c1);
		c2.sub(c1);
		//测试复数的加减法(类方法)
		System.out.println("the static function test");
		complex.staticadd(c1,c2);
		complex.staticsub(c2,c1);
		
	}
}