package banktemplate;

public class MainClass {
	public static void main(String[] args){
		//�ֶ�����һ���û��û�����
		Person me = new Person();
		me.setID("1");
		me.setPassword("123");
		me.setMoney(100);
		//���ɵ�½�Ի���
		LoginDialog ldlg = new LoginDialog(me);
	}
}
