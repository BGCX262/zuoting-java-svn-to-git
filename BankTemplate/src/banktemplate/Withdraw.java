package banktemplate;

//ȡ����
public class Withdraw extends BankTemplateMethod{
	//������ǰ�û�
	Person person;
	//�û�����ȡ����
	int submoney;
	
	Withdraw(Person p){
		person = p;
		
	}
	@Override
	public void takenumber() {
		// TODO Auto-generated method stub
		//����ȡ����Ի���
		getNumberDialog getnumberdlg = new getNumberDialog();
		//���øöԻ����ö�
		getnumberdlg.setAlwaysOnTop(true);
	}

	@Override
	public void transact() {
		// TODO Auto-generated method stub
		//����ȡ��Ի���
		WithdrawDialog wdlg = new WithdrawDialog(person);
	}
}
