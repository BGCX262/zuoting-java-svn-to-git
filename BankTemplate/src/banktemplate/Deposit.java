package banktemplate;

public class Deposit extends BankTemplateMethod{
	Person person;//����һ���û�
	int addmoney;//�����Ǯ
	DepositDialog ddlg;//���Ի���
	
	Deposit(Person p){
		person = p;//���õ�ǰ�û�
	}
	@Override
	public void takenumber() {
		//ȡ����
		// TODO Auto-generated method stub
		//����ȡ����Ի���
		getNumberDialog getnumberdlg = new getNumberDialog();
		//�ö�
		getnumberdlg.setAlwaysOnTop(true);
	}

	@Override
	public void transact() {
		//����
		// TODO Auto-generated method stub
		//�������Ի���
		DepositDialog ddlg = new DepositDialog(person);
	}
}
