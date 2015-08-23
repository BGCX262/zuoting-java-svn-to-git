package banktemplate;

//银行抽象类
public abstract class BankTemplateMethod {
	
	public abstract void takenumber();//取号
	public abstract void transact();//交易
	public final void bankstep(){
		//模板方法
		takenumber();
		transact();
	}
}
