package example3_2;

public class example3_2 {
	public static void main(String[] args){
		int a = 9;
		int b = 5;
		int c = 7;
		int t = 0;
		if(a < b){
			t = a;
			a = b;
			b = t;
		}
		if(a < c){
			t = a;
			a = c;
			c = t;
		}
		if(b < c){
			t = b;
			b = c;
			c = t;
		}
		System.out.println("a="+a+" b="+b+" c="+c);
	}
}
