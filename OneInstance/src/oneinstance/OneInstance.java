package oneinstance;
/*
 * limit the creation of the instance
 * ver1
 * written by elfzuo
 * 2013.10.14
 */
public class OneInstance {
	static int count = 0; //��¼�Ѵ���ʵ���ĸ���
	private OneInstance(){
		//�����캯������˽�еģ��ⲿ����ֱ�ӷ���
		System.out.println("ʵ��������");
		//count����������Ϊ�ж�����ʵ���Ĵ���
		count++;
	}
	static void creation(){
		//ֻ��ͨ��creation����ʵ��������ֻ�������෽��
		if(count == 0){
			//�ж����Ѵ���ʵ����Ϊ���򴴽�ʵ��
			OneInstance oi = new OneInstance();
		}
		else{
			//�ж����Ѵ���ʵ������Ϊ������ʾ�û�ֻ�ܴ�������
			System.out.println("ֻ�ܴ���Ψһʵ��");
		}
	}
	
}
class MainClass{
	public static void main(String[] args){
		for(int i=0;i<3;i++){
			OneInstance.creation();
		}
	}
}