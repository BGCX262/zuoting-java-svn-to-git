package waterState;
import java.util.*;
public class MainClass{
	public static void main(String[] args){
		//��ʾ�û�����
		System.out.println("����ˮ����ˮ���¶�");
		Scanner scanner = new Scanner(System.in);
		double temp = scanner.nextDouble();
		Water test = new Water(); 
		test.judge(temp);
		
	}

}