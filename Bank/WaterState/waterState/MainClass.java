package waterState;
import java.util.*;
public class MainClass{
	public static void main(String[] args){
		//提示用户输入
		System.out.println("输入水杯中水的温度");
		Scanner scanner = new Scanner(System.in);
		double temp = scanner.nextDouble();
		Water test = new Water(); 
		test.judge(temp);
		
	}

}