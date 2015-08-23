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
		//���εĹ��캯������ʼ��ʵ�����鲿��ֵ
		this.a = a;
		this.b = b;
	}
	complex(){
		//�޲εĹ��캯���������вι��캯������ʼ������Ϊ0����a=0,b=0
		this(0,0);
	}
	int getReal(){
		//��ȡʵ����ֵ
		return a;
	}
	int getImage(){
		//��ȡ�鲿��ֵ
		return b;
	}
	void printcomplex(){
		//��׼�����ͬ����ĸ���
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
		//�����ӷ���ʵ��������ʵ���鲿�ֱ����
		int newa = a + complex.a;
		int newb = b + complex.b;
		//�����Ӻ�õ����¸���
		complex newcomplex = new complex(newa,newb);
		//����µĸ���
		newcomplex.printcomplex();
	}
	void sub(complex complex){
		//����������ʵ��������ʵ���鲿�ֱ����
		int newa = a - complex.a;
		int newb = b - complex.b;
		//��������õ����¸���
		complex newcomplex = new complex(newa,newb);
		//����µĸ���
		newcomplex.printcomplex();
		
	}
	static void staticadd(complex a,complex b){
		//������ӵ��෽��
		//�ֱ�����������ʵ�����鲿���
		int newa = a.a + b.a;
		int newb = a.b + b.b;
		//�����Ӻ�õ����¸���
		complex c = new complex(newa,newb);
		//����µĸ���
		c.printcomplex();
	}
	static void staticsub(complex a,complex b){
		//����������෽��
		//�ֱ�����������ʵ�����鲿���
		int newa = a.a - b.a;
		int newb = a.b - b.b;
		//��������õ����¸���
		complex c = new complex(newa,newb);
		//����µĸ���
		c.printcomplex();
	}
}
class MainClass{
	public static void main(String[] args){
		int real,image;//��¼�貿ֵ��ʵ��ֵ
		complex c = new complex();//�����޲η�������complexʵ��c
		c.printcomplex();//���c
		//Ҫ���û������һ��������ʵ�����鲿
		System.out.println("�����һ��������ʵ��");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("�����һ���������鲿");
		scanner = new Scanner(System.in);
		int b = scanner.nextInt();
		complex c1 = new complex(a,b);//�����вη�������complexʵ��c1
		c1.printcomplex();//���c1
		//Ҫ���û�����ڶ���������ʵ�����鲿
		System.out.println("����ڶ���������ʵ��");
		scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("����ڶ����������鲿");
		scanner = new Scanner(System.in);
		b = scanner.nextInt();
		complex c2 = new complex(a,b);//�����вη�������complexʵ��c2
		
		real = c2.getReal();//ͨ��getReal������ȡʵ��
		image = c2.getImage();//ͨ��getImage������ȡ�貿
		//���c2��ʵ�����貿
		System.out.println("the real is "+real+","+"the image is "+image);
		//���Ը����ļӼ���(ʵ������)
		System.out.println("the function test");
		c2.add(c1);
		c2.sub(c1);
		//���Ը����ļӼ���(�෽��)
		System.out.println("the static function test");
		complex.staticadd(c1,c2);
		complex.staticsub(c2,c1);
		
	}
}