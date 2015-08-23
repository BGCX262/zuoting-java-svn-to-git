package banktemplate;

//没有连接数据库，完善后这个类的内容应该从数据库内取出
public class Person {
	String ID;//卡号
	String Password;//密码
	double money;//金额
	
	//获取卡号
	String getID(){
		return this.ID;
	}
	//获取密码
	String getPassword(){
		return this.Password;
	}
	//获取金额
	double getMoney(){
		return this.money;
	}
	//设置卡号
	void setID(String ID){
		this.ID = ID;
	}
	//设置密码
	void setPassword(String Password){
		this.Password = Password;
	}
	//设置金额
	void setMoney(double money){
		this.money = money;
	}
	
}
