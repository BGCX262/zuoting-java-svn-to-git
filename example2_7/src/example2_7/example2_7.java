package example2_7;
import java.util.*;
public class example2_7 {
	public static void main(String[] args){
		int a[] = {3,2,1,5,4,6,9,8,7};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int search = 0;
		int index = Arrays.binarySearch(a, search);
		if(index > 0){
			System.out.println(search+"����������ͬԪ���ڵ�"+(index+1)+"λ");
		}
		else{
			System.out.println("û���ҵ�ָ��Ԫ��");
		}
	}
}
