package banktemplate;

public class Deposit extends BankTemplateMethod{
	Person person;//声明一个用户
	int addmoney;//存进的钱
	DepositDialog ddlg;//存款对话框
	
	Deposit(Person p){
		person = p;//设置当前用户
	}
	@Override
	public void takenumber() {
		//取号码
		// TODO Auto-generated method stub
		//创建取号码对话框
		getNumberDialog getnumberdlg = new getNumberDialog();
		//置顶
		getnumberdlg.setAlwaysOnTop(true);
	}

	@Override
	public void transact() {
		//交易
		// TODO Auto-generated method stub
		//创建存款对话框
		DepositDialog ddlg = new DepositDialog(person);
	}
}
