package numbermove;
import java.util.*;
/*
 * move the last number in the array(sporting user's input) 
 * ver2
 * written by elfzuo
 * 2013.10.14
 */
public class NumberMove {
	//�����װ���������������
	int[] array;//�����Ա����
	NumberMove(int array[]){
		int length = array.length;//��ȡ������������ĳ���
		this.array = new int[length];//���ٳ�Ա�����ĳ���Ϊ����Ĳ�������
		this.array = array;//Ϊ�����ʼ��
		System.out.println(Arrays.toString(array));//�����һ��ԭʼ����
	}
	void Move(){
		//ʵ�������ƶ�����
		int temp = array[array.length-1];//�������һλ������ʱ����
		for(int j=array.length-1;j>0;j--){
			array[j] = array[j-1];//������ÿһλ�����һλ
		}
		array[0] = temp;//�����е�һ������ֵΪ��ʱ������ֵ
		System.out.println(Arrays.toString(array));//�������
	}
}
class MainClass{
	//������
	public static void main(String[] args){
		//��ʾ�û��������鳤��
		System.out.println("�����������ֵĸ���");
		//����һ��Scanner�����䴫�����ΪSystem.in 
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//���ٳ��������û�Ҫ�������
		int[] array = new int[n];
		//���λ�ȡ�û������������Ԫ��
		for(int i=0;i<array.length;i++){
			System.out.println("�����"+(i+1)+"����");
			Scanner input = new Scanner(System.in);
			array[i] = input.nextInt();
		}
		//����NumberMove����� nm��ͬʱ����NumberMove(int[])���캯������array
		//��Ϊ��������
		NumberMove nm = new NumberMove(array);
		//ʵ��һ���ֵ���β�����ƶ�
		for(int count=0; count<n; count++){
			nm.Move();
		}
	}
}
