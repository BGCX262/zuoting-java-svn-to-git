package banktemplate;

//ת����
public class Transfer extends BankTemplateMethod{
	//������ǰ�û�
	Person person;
	//ת�˽��
	int transmoney;
	//ת��ID
	String transID;
	
	Transfer(Person p){
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
		//����ת�˶Ի���
		TransferDialog tdlg = new TransferDialog(person);
	}
}
