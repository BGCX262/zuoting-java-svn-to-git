package banktemplate;

//取款类
public class Withdraw extends BankTemplateMethod{
	//声明当前用户
	Person person;
	//用户输入取款金额
	int submoney;
	
	Withdraw(Person p){
		person = p;
		
	}
	@Override
	public void takenumber() {
		// TODO Auto-generated method stub
		//创建取号码对话框
		getNumberDialog getnumberdlg = new getNumberDialog();
		//设置该对话框置顶
		getnumberdlg.setAlwaysOnTop(true);
	}

	@Override
	public void transact() {
		// TODO Auto-generated method stub
		//创建取款对话框
		WithdrawDialog wdlg = new WithdrawDialog(person);
	}
}
