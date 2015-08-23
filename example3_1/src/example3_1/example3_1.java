package example3_1;

public class example3_1 {
	public static void main(String[] s){
		char c1 = '中', c2 = '国', c3 ='科', c4='大';
		char secret = 'A';
		c1 = (char)(c1^secret);
		c2 = (char)(c2^secret);
		c3 = (char)(c3^secret);
		c4 = (char)(c4^secret);
		System.out.println("密文:"+c1+" "+c2+" "+c3+" "+c4);
		c1 = (char)(c1^secret);
		c2 = (char)(c2^secret);
		c3 = (char)(c3^secret);
		c4 = (char)(c4^secret);
		System.out.println("原文:"+c1+" "+c2+" "+c3+" "+c4);
	}
}
