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

public class WithdrawDialog extends JDialog implements ActionListener{
	private static final long serialVersionUID = 1L;
	//��ʾ�û���������
	JTextArea guide;
	//�û������ı���
	JTextArea input;
	//��ʾ�û�Ŀǰ���
	JTextArea showmsg;
	//ȷ�����밴ť
	JButton OK;
	//��ȡ��ʾ����С
	Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
	Person person;
	
	WithdrawDialog(Person p){
		//��ʼ���Ի���
		person = p;
		init();
	}
	void init(){
		//���ô�С
		this.setSize(400,150);
		//����λ��
		this.setLocation(screenSize.width/2-200,screenSize.height/2-200);
		//���ø���������Ҽ�������
		guide = new JTextArea(1,33);
		guide.append("������ȡ���");
		guide.setEditable(false);
		guide.setBackground(getBackground());
		guide.setFont(new Font("����",Font.BOLD,12));
		input = new JTextArea(1,30);
		input.setText("0");
		showmsg = new JTextArea(1,33);
		showmsg.setEditable(false);
		showmsg.setBackground(getBackground());
		showmsg.setText("����ǰ�Ľ���ǣ�"+String.valueOf(person.money));
		OK = new JButton("ȷ��");
		OK.addActionListener(this);
		
		this.setLayout(new FlowLayout());
		this.add(guide);
		this.add(input);
		this.add(showmsg);
		this.add(OK);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == OK){
			//������ȷ�ϰ�ť���ȡ�û�����ȡ����
			int sub = Integer.valueOf(input.getText());
			if(person.money-sub<0){
				//��ȡ��������н������ʾ�û�����
				showmsg.setText("");
				showmsg.append("���㣡");
			}
			else{
				//����ִ��ȡ�����
				person.money -= sub;
				showmsg.setText("");
				showmsg.append("����ǰ�Ľ���ǣ�"+String.valueOf(person.money));
			}
			//this.setVisible(false);
		}
	}
	
}
