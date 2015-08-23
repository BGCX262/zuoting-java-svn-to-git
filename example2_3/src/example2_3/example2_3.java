package example2_3;
import java.util.*;
public class example2_3 {
	public static void main(String[] args){
		System.out.println("please into several double date");
		System.out.println("input 0 to calculate sum and average");
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		double count = 0;
		double input = scan.nextDouble();
		while(input != 0){
			sum = sum + input;
			count++;
			input = scan.nextDouble();
		}
		System.out.println("the count is"+count);
		System.out.println("the sum is"+sum);
		System.out.println("the average is"+sum/count);
		System.out.printf("%1.2f", sum);
		
	}
}
