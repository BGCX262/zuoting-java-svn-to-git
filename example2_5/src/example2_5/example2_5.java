package example2_5;
import java.util.*;
public class example2_5 {
	public static void main(String[] args){
		char[] a = {'a','b','c','d','e','f'};
		char[] b = {'1','2','3','4','5','6'};
		int[] c = {1,2,3,4,5,6};
		int[] d = {10,20,30,40,50,60};
		System.out.println("a��Ԫ��Ϊ");
		System.out.println(Arrays.toString(a));
		System.out.println("b��Ԫ��Ϊ");
		System.out.println(Arrays.toString(b));
		System.out.println("c��Ԫ��Ϊ");
		System.out.println(Arrays.toString(c));
		System.out.println("d��Ԫ��Ϊ");
		System.out.println(Arrays.toString(d));
		System.arraycopy(a, 0, b, 0, a.length);
		System.arraycopy(c, 2, d, 2, c.length-3);
		System.out.println("a��Ԫ��Ϊ");
		System.out.println(Arrays.toString(a));
		System.out.println("b��Ԫ��Ϊ");
		System.out.println(Arrays.toString(b));
		System.out.println("c��Ԫ��Ϊ");
		System.out.println(Arrays.toString(c));
		System.out.println("d��Ԫ��Ϊ");
		System.out.println(Arrays.toString(d));
	}
}
