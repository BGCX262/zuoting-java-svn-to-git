package banktemplate;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextArea;

//���Ի�����
public class myWindow extends JDialog implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//��ť
	JButton deposit;
	//��ť
	JButton withdraw;
	//ת�˰�ť
	JButton transfer;
	//��ʾ�û�ѡ��
	JTextArea showmsg;
	//���Ƹ�ʽ
	JTextArea blank;
	//��ȡ��ʾ����С
	Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
	Person person;
	
	myWindow(Person p){
		person = p;
		init();
	}
	
	void init(){
		//���ô�С
		this.setSize(400,130);
		//����λ��
		this.setLocation(screenSize.width/2-200,screenSize.height/2-200);
		//���ø����������������
		showmsg = new JTextArea(1,33);
		showmsg.setEditable(false);
		showmsg.setBackground(getBackground());
		showmsg.setText("��ѡ�����");
		deposit = new JButton("���");
		deposit.addActionListener(this);
		withdraw = new JButton("ȡ��");
		withdraw.addActionListener(this);
		transfer = new JButton("ת��");
		transfer.addActionListener(this);
		blank = new JTextArea(1,33);
		blank.setEditable(false);
		blank.setBackground(getBackground());
		this.setLayout(new FlowLayout());
		this.add(showmsg);
		this.add(blank);
		this.add(deposit);
		this.add(withdraw);
		this.add(transfer);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == deposit){
			//��������ť��ʹ�ô�����ģ�巽��
			Deposit deposit = new Deposit(person);
			deposit.bankstep();
	
		}
		else if(e.getSource() == withdraw){
			//������ȡ�ť��ʹ��ȡ�����ģ�巽��
			Withdraw withdraw = new Withdraw(person);
			withdraw.bankstep();
		}
		else if(e.getSource() == transfer){
			//������ת�˰�ť��ʹ��ת�����ģ�巽��
			Transfer transfer = new Transfer(person);
			transfer.bankstep();
		}
	}

}
