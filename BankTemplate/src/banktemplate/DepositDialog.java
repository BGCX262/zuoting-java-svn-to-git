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
public class DepositDialog extends JDialog implements ActionListener{
	private static final long serialVersionUID = 1L;
	//��ʾ�û���������
	JTextArea guide;
	//�û������ı���
	JTextArea input;
	//��ʾ�û�Ŀǰ���
	JTextArea showmsg;
	//ȷ�����밴ť
	JButton OK;
	//��ȡ���ڴ�С
	Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
	//����һ���û�
	Person person;
	//�û���������
	int add;
	
	DepositDialog(Person p){
		//��ʼ���Ի���
		person = p;
		init();
	}
	void init(){
		//���ô�С
		this.setSize(400,150);
		//����λ��
		this.setLocation(screenSize.width/2-200,screenSize.height/2-200);
		//���ø����������������
		guide = new JTextArea(1,33);
		guide.append("���������");
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
			//���û����ȷ����ť��ȡ�û���������д�����
			add = Integer.valueOf(input.getText());
			person.money += add;
			showmsg.setText("");
			showmsg.append("����ǰ�Ľ���ǣ�"+String.valueOf(person.money));
		}
	}
	
	int getadd(){
		return add;
	}

}
