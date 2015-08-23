package banktemplate;

public class MainClass {
	public static void main(String[] args){
		//手动生成一个用户用户测试
		Person me = new Person();
		me.setID("1");
		me.setPassword("123");
		me.setMoney(100);
		//生成登陆对话框
		LoginDialog ldlg = new LoginDialog(me);
	}
}
