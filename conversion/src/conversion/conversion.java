package conversion;

import java.util.Scanner;

/*
 * this program is to convert the number from one system to another
 * version 1
 * written by elfzuo
 * 2013-10-23
 */
/********************************************************************/
public class conversion {
/*
 * convertion������������ת��
 * �����װ�������������ֱ������n������ת��Ϊ10���ƣ���10������װ��Ϊn���ƣ�
 * �Լ������Ŀ�Ƿ���Ͻ��ƹ淶
 */
	
	long ToTen(int n,String str){
		//��n�������ֵ��ַ���ת����ʮ����
		long result = 0;//��¼ת����ʮ�����Ժ������
		int[] x = new int[str.length()];//����һ�����ַ���������ȵ�int������
		for(int i=0; i<str.length();i++)
		{
			//�ֱ��ַ����ڵ��ַ�����ת��Ϊint�Ͳ���ŵ�������
			char c = str.charAt(i);//������ȡ�ַ�
			if(c>=65 && c<=70){//����A--F�ڽ���ֵװ��Ϊ10--15��int������
				x[i] = (int)str.charAt(i)-55;
			}//if
			else if(c>=48 && c<=57){//����1--9������ֵװ��Ϊ1--9��int������
				x[i] = (int)str.charAt(i)-48;
			}//else if
		}//for
		for(int i=0; i<x.length; i++){
			//��λ���Ը�λȨֵ����λ��ӵõ�ʮ���ƽ��
			long temp = (long)(x[i]*Math.pow(n,(x.length-1)-i));
			result += temp;
		}//for
		return result;
	}//ToTen
	
	
	void ToAny(int n,long num){
		//��ʮ������ת��Ϊ���������
		long c = num/n;//cΪ��������num�Խ���n������
		long r = num%n;//rΪ��������num�Խ���ȡ��
		if(c == 0){
			//������������Ϊ��
			if(r>=0 && r<=9){
				//����������ת��Ϊchar���������
				char ch = (char)(r+48);
				System.out.print(ch);
			}//if
			else if(r>=10 && r<=15)
			{
				//����10--15��Χ��ת��ΪA--F
				char ch = (char)(r+55);
				System.out.print(ch);
			}//else if
		}//if
		else{
			//������������Ϊ�㣬����Ҫ�ݹ�������г���
			this.ToAny(n,c);
			if(r>=0 && r<=9){
				//����������ת��Ϊchar���������
				char ch = (char)(r+48);
				System.out.print(ch);
			}//if
			else if(r>=10 && r<=15)
			{
				//����10--15��Χ��ת��ΪA--F
				char ch = (char)(r+55);
				System.out.print(ch);
			}//else if
		}//else
	}//ToAny
	
}//class
/*******************************************************************/
interface Check{
	//�����Ŀ�Ƿ���Ͻ��ƹ淶��Ҫ�׳�CheckException
	void checknumber(String r) throws CheckException;
}
/*******************************************************************/
class CheckException extends Exception{
    //�����Լ����쳣��
	private static final long serialVersionUID = 1L;
	String message;//��ȡ�쳣��Ϣ
	//�ø���Exception�Ĺ��캯�������Լ��Ĵ�����Ϣ
	public CheckException(String message){
		super(message);
		this.message = message;
	}
	void showInfor(){
		System.out.println(message);
	}
}
/*******************************************************************/
class TwoTo extends conversion implements Check{
	//������ת��Ϊ���������̳�conversion�࣬��Ҫ��дchecknumber����
	@Override
	public void checknumber(String str) throws CheckException{
		// TODO Auto-generated method stub
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(!(ch>=48 && ch<=49)){
				throw new CheckException("���������ݲ����Ϲ淶");
			}//if
		}//for
	}//checknumber
	public long ToTen(String str){
		return super.ToTen(2, str);
	}
	
}
/*******************************************************************/
class EightTo extends conversion implements Check{
	//������ת��Ϊ���������̳�conversion�࣬��Ҫ��дchecknumber����
	@Override
	public void checknumber(String str) throws CheckException{
		// TODO Auto-generated method stub
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(!(ch>=48 && ch<=55)){
				throw new CheckException("�˽������ݲ����Ϲ淶");
			}//if
		}//for
	}//checknumber
	public long ToTen(String str){
		return super.ToTen(8, str);
	}
	
}
/*******************************************************************/
class TenTo extends conversion implements Check{
	//������ת��Ϊ���������̳�conversion�࣬��Ҫ��дchecknumber����
	@Override
	public void checknumber(String str) throws CheckException{
		// TODO Auto-generated method stub
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(!(ch>=48 && ch<=57)){
				throw new CheckException("ʮ�������ݲ����Ϲ淶");
			}//if
		}//for
	}//checknumber
	public long ToTen(String str){
		return super.ToTen(10, str);
	}
	
}
/*******************************************************************/
class SixteenTo extends conversion implements Check{
	//������ת��Ϊ���������̳�conversion�࣬��Ҫ��дchecknumber����
	@Override
	public void checknumber(String str) throws CheckException{
		// TODO Auto-generated method stub
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(!((ch>=48 && ch<=57)||(ch>=65 && ch<=70))){
				throw new CheckException("ʮ���������ݲ����Ϲ淶");
			}//if
		}//for
	}//checknumber
	public long ToTen(String str){
		return super.ToTen(16, str);
	}
	
}
/*******************************************************************/
class InputRequest{
	//�������������û�����
	public void request(){
		//Ҫ���û������ת�����Ľ���
		System.out.println("�������ת�������Ľ���(2,8,10,16)");
		Scanner scan1 = new Scanner(System.in);
		int befor = scan1.nextInt();
		//Ҫ���û������ת����
		System.out.println("�������ת��������");
		Scanner scan2 = new Scanner(System.in);
		String str = scan2.next();
		//Ҫ���û�����ת�������Ľ���
		System.out.println("������ת��������Ľ���(2,8,10,16)");
		Scanner scan3 = new Scanner(System.in);
		int after = scan3.nextInt();
		//�ж�ת��ǰ���Ľ����Ƿ�֧��ת��
		if(!(befor==2||befor==8||befor==10||befor==16)){
			System.out.println("��ת�����Ʋ�֧��");
		}//�ж�ת�������Ľ����Ƿ�֧��ת��
		else if(!(after==2||after==8||after==10||after==16)){
			System.out.println("Ҫ���ת������Ʋ�֧��");
		}
		else{
			//�����ƺ���ʼ����ת��
			//ͨ���û�����Ĵ�ת�������ƽ����ж�new�ľ������
			if(befor == 2){
				//��ת��������Ϊ2��new TwoTo��ִ�з�װ�ڸ�����Ĳ���
					TwoTo con = new TwoTo();
					//checknumber�����׳��쳣���뱻����
				try{
					con.checknumber(str);
					long result = con.ToTen(str);
					con.ToAny(after, result);
				}catch(CheckException e){
					//��ӡ��Ϣ
					e.showInfor();
				}
			}
			else if(befor == 8){
				//��ת��������Ϊ8��new EightTo��ִ�з�װ�ڸ�����Ĳ���
				EightTo con = new EightTo();
				try{
					//checknumber�����׳��쳣���뱻����
					con.checknumber(str);
					long result = con.ToTen(str);
					con.ToAny(after, result);
				}catch(CheckException e){
					//��ӡ��Ϣ
					e.showInfor();
				}
			}
			else if(befor == 10){
				//��ת��������Ϊ10��new TenTo��ִ�з�װ�ڸ�����Ĳ���
				TenTo con = new TenTo();
				try{
					//checknumber�����׳��쳣���뱻����
					con.checknumber(str);
					long result = con.ToTen(str);
					con.ToAny(after, result);
				}catch(CheckException e){
					//��ӡ��Ϣ
					e.showInfor();
				}
			}
			else if(befor == 16){
				//��ת��������Ϊ16��new SixteenTo��ִ�з�װ�ڸ�����Ĳ���
				SixteenTo con = new SixteenTo();
				try{
					//checknumber�����׳��쳣���뱻����
					con.checknumber(str);
					long result = con.ToTen(str);
					con.ToAny(after, result);
				}catch(CheckException e){
					//��ӡ��Ϣ
					e.showInfor();
				}
			}
		}
	}
}

