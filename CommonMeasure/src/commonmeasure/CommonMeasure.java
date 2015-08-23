package commonmeasure;
import java.util.*;
/*
 * calculate the common divisor and common multiple between two numbers
 * ver1
 * written by elfzuo
 * 2013.10.14
 */
class CommonDivisor{
	//用辗转相除法计算最大公约数
	public int f(int a,int b){
		//实现最大公约数算法
		if(a<b){
			//保证a<b
			int c = a;
			a = b;
			b = c;
		}
		int r = a%b;
        while(r!=0){
        	//若a对b取余不为零，则让余数和较大数继续求余数，循环计算直至余数为零
        	a = b;
        	b = r;
        	r = a%b;
        }
        return b;//余数为零后所得到的b则为最大公约数
    }
}
class CommonMultiple extends CommonDivisor{
	public int f(int a,int b){
		//重写父类f方法实现最小公倍数计算
		int m = super.f(a, b);//调用父类的f方法计算最大公约数并存入m
		return (a*b)/m;//通过公式计算最小公倍数
	}
}

public class CommonMeasure {
	//测试类
	public static void main(String[] args){
		int a,b,result;//分别记录两个输入参数和计算结果
		//要求用户输入第一个数据
		System.out.println("请输入求最大公约数，最小公倍数的第一个数");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		//要求用户输入第二个数据
		System.out.println("请输入求最大公约数，最小公倍数的第二个数");
		scanner = new Scanner(System.in);
		b = scanner.nextInt();
		//完成用户指定数的最大公约数计算并输出结果
		CommonDivisor cd = new CommonDivisor();
		result = cd.f(a, b);
		System.out.println("两个数字的最大公约数为:"+result);
		//完成用户指定数的最小公倍数计算并输出结果
		CommonMultiple cm = new CommonMultiple();
		result = cm.f(a, b);
		System.out.println("两个数字的最小公倍数为:"+result);
	}
}