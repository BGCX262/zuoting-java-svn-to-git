package LargeNumberCalculate;
/*
 * the calculation between two positive large numbers
 * ver1
 * written by elfzuo
 * 2013.9.17
 */
/******************************************************************/
public class LargeNumber {	//完成大整数的加法
	
	boolean compare(int[] a, int[] b){//判断被减数是否大于减数
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]>b[i])
			{
				return true;
			}
		}
		return false;
	}
	void printarray(int[] a){//打印数组内元素
		/*
		 * 数组a存放一个加数
		 * 数组b存放另一个加数
		 * 变量i完成for循环计数
		 * k来判断数组第一个非零数，从而输出完整的大整数
		 */
		int i = 0;
		int k = 0;
		//找到第一个不为零的数组元素下标k，后面的数据可以组成需要计算的完整大整数
		for(i = 0; i<a.length; i++){
			if(a[i] != 0){
				k = i;
				break;
			}//if
		}//for
	    //挨个输出a[i]的内容
		for(i = k; i<a.length; i++){
			System.out.print(a[i]);
		}//for
	}
/******************************************************************/
	void plus(int[] a, int[] b){
		/*
		 * 数组a存放一个加数
		 * 数组b存放另一个加数
		 * 数组c存放加操作后的结果
		 * 变量i完成for循环计数
		 * 变量result每一次记录对应位数相加后的结果，判断是否进位
		 */
		int[] c = new int[a.length];
		int result = 0;
		printarray(a);
		System.out.print("加上");
		printarray(b);
		System.out.print("等于");
		//挨个进行加法计算
		//从数组下标最大值，也就是大整数的最低位进行计算
		//按照数组下标挨个相加，若判断大于零，则进位
		for(int i = a.length-1; i>=0; i--){
			result = a[i] + b[i];
			if(result >= 10){
				c[i] = result % 10;
				a[i-1] = a[i-1] + 1;
			}//if
			else{
				c[i] = result;
			}//else
		}//for
		printarray(c);
		System.out.println();
	}//plus function


/******************************************************************/
	public void sub(int[] a, int[] b){//完成减法操作
		/*
		 * 数组a存放被减数
		 * 数组b存放减数
		 * 数组c存放减操作后的结果
		 * 变量i完成for循环计数
		 * 变量result每一次记录对应位数相减后的结果，判断是否借位
		 */
		int[] c = new int[a.length];
		int result = 0;
		printarray(a);
		System.out.print("减去");
		printarray(b);
	    System.out.print("等于");
	    //System.out.println(compare(a,b));
	    //如果被加数大于减数则进行正常的减法计算
	    if(compare(a,b) == true)
	    {
	    	//按照数组下标，挨个进行减法计算
		    //从数组下标最大，也就是大整数最低位开始进行计算
		    //若判断结果是否小于零，向上一位借位
			for(int i = a.length-1; i>0; i--){
				result = a[i] - b[i];
				if(result < 0){
					c[i] = 10 + result;
					a[i-1] = a[i-1] - 1;
				}//if
				else{
					c[i] = result;
				}//else
			}
			printarray(c);
	    }//if compare(a,b) == true
	    
	    //如果被减数比减数小，则用减数减去被减数，输出结果前先输入“-”表示未负数
	    else if(compare(a,b) == false){
	    	//按照数组下标，挨个进行减法计算
		    //从数组下标最大，也就是大整数最低位开始进行计算
		    //若判断结果是否小于零，向上一位借位
			for(int i = a.length-1; i>0; i--){
				result = b[i] - a[i];
				if(result < 0){
					c[i] = 10 + result;
					a[i-1] = a[i-1] - 1;
				}//if
				else{
					c[i] = result;
				}//else
			}
			
		    System.out.print("-");
			printarray(c);
	    }//else if(compare(a,b)==false)
	    System.out.println();
	}//fun sub
}// class LargeNumber
