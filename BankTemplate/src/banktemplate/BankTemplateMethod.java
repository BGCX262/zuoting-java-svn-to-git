package banktemplate;

//���г�����
public abstract class BankTemplateMethod {
	
	public abstract void takenumber();//ȡ��
	public abstract void transact();//����
	public final void bankstep(){
		//ģ�巽��
		takenumber();
		transact();
	}
}
