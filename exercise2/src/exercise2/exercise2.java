package exercise2;

public class exercise2 {
	public static void main(String[] args){
		/*char c1 = 65, c2 = 'ÎÒ', c3 = 'Ëû';
		System.out.println(c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		byte by = (byte)129;
		System.out.println(by);
		double d = 123456.783124;
		System.out.printf("%12.3f,%12.5f",d,d);*/
		double[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		double[][] b = {{1.0,2.2,3.3,4.4},{5.5,6.6,7.7,8.8}};
		a[0] = b[0];
		a[1] = b[1];
		System.out.println(a[1][3]);
		
	}
}
