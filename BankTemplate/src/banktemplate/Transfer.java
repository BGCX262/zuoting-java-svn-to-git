package banktemplate;

//转账类
public class Transfer extends BankTemplateMethod{
	//声明当前用户
	Person person;
	//转账金额
	int transmoney;
	//转账ID
	String transID;
	
	Transfer(Person p){
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
		//创建转账对话框
		TransferDialog tdlg = new TransferDialog(person);
	}
}
