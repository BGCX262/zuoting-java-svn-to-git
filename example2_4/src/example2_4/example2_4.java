package example2_4;

public class example2_4 {
	public static void main(String[] args){
		int[] a = {1,2,3,4};
		int[] b = {100,200,300};
		char[] c = {'z','t','t'};
		System.out.println("a的长度是"+a.length);
		System.out.println("b的长度是"+b.length);
		System.out.println("a的引用是"+""+a);
		System.out.println("b的引用是"+""+b);
		System.out.println(a == b);
		a = b;
		System.out.println("a的长度是"+a.length);
		System.out.println("b的长度是"+b.length);
		System.out.println("a的引用是"+""+a);
		System.out.println("b的引用是"+""+b);
		System.out.println(a == b);
		System.out.println(c);
		System.out.println("a[0]="+a[0]+" "+"a[1]="+a[1]+" "+"a[2]="+a[2]);
		System.out.println(""+c[0]+c[1]);
	}
}
