package banktemplate;

//û���������ݿ⣬���ƺ�����������Ӧ�ô����ݿ���ȡ��
public class Person {
	String ID;//����
	String Password;//����
	double money;//���
	
	//��ȡ����
	String getID(){
		return this.ID;
	}
	//��ȡ����
	String getPassword(){
		return this.Password;
	}
	//��ȡ���
	double getMoney(){
		return this.money;
	}
	//���ÿ���
	void setID(String ID){
		this.ID = ID;
	}
	//��������
	void setPassword(String Password){
		this.Password = Password;
	}
	//���ý��
	void setMoney(double money){
		this.money = money;
	}
	
}
