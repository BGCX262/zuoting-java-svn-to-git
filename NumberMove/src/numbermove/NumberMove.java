package numbermove;
import java.util.*;
/*
 * move the last number in the array(sporting user's input) 
 * ver2
 * written by elfzuo
 * 2013.10.14
 */
public class NumberMove {
	//此类封装对数组的移数操作
	int[] array;//定义成员变量
	NumberMove(int array[]){
		int length = array.length;//获取传进来的数组的长度
		this.array = new int[length];//开辟成员变量的长度为传入的参数长度
		this.array = array;//为数组初始化
		System.out.println(Arrays.toString(array));//先输出一次原始数组
	}
	void Move(){
		//实现数字移动操作
		int temp = array[array.length-1];//将最最后一位放入临时变量
		for(int j=array.length-1;j>0;j--){
			array[j] = array[j-1];//数组中每一位向后移一位
		}
		array[0] = temp;//数组中第一个数赋值为临时变量的值
		System.out.println(Arrays.toString(array));//输出数组
	}
}
class MainClass{
	//测试类
	public static void main(String[] args){
		//提示用户输入数组长度
		System.out.println("输入排序数字的个数");
		//构造一个Scanner对象，其传入参数为System.in 
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//开辟长度满足用户要求的数组
		int[] array = new int[n];
		//依次获取用户输入的数组内元素
		for(int i=0;i<array.length;i++){
			System.out.println("输入第"+(i+1)+"个数");
			Scanner input = new Scanner(System.in);
			array[i] = input.nextInt();
		}
		//声明NumberMove类变量 nm，同时调用NumberMove(int[])构造函数，将array
		//作为参数传入
		NumberMove nm = new NumberMove(array);
		//实现一整轮的最尾数字移动
		for(int count=0; count<n; count++){
			nm.Move();
		}
	}
}
