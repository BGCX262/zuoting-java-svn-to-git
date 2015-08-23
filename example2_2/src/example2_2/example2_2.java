package example2_2;

public class example2_2 {
	public static void main(String[] args){
		int c = 128;
		long d = 77777;
		float f = 2e3f;
		double g = 3.14e-300;
		double result = f*g;
		System.out.println("f ="+f);
		System.out.println("g ="+g);
		System.out.println("result ="+result);
		g = 1234.123456789;
		c = (int)d;
		f = (float)g;
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("f = "+f);
		System.out.println("g = "+g);
	}
}
