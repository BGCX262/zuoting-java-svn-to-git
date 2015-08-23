package banktemplate;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class LoginDialog extends JDialog implements ActionListener{
	private static final long serialVersionUID = 1L;
	//��ʾ�û�����ID
	JTextArea guide;
	//�û������ı���
	JTextArea input;
	//��ʾ�û���������
	JTextArea guide1;
	//�û������ı���
	JPasswordField input1;
	//��ʾ�û�״̬
	JTextArea showmsg;
	//ȷ�����밴ť
	JButton OK;
	//��ȡ�ı����С
	Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
	Person person;
	myWindow mv;
	
	LoginDialog(Person p){
		//��ʼ���Ի���
		person = p;
		init();
	}
	void init(){
		//���ô�С
		this.setSize(400,200);
		//����λ��
		this.setLocation(screenSize.width/2-200,screenSize.height/2-200);
		//���ø���ؼ����ӵ�������
		guide = new JTextArea(1,33);
		guide.append("������ID��");
		guide.setEditable(false);
		guide.setBackground(getBackground());
		guide.setFont(new Font("����",Font.BOLD,12));
		input = new JTextArea(1,30);
		guide1 = new JTextArea(1,33);
		guide1.append("���������룺");
		guide1.setEditable(false);
		guide1.setBackground(getBackground());
		guide1.setFont(new Font("����",Font.BOLD,12));
		input1 = new JPasswordField(30);
		showmsg = new JTextArea(1,33);
		showmsg.setEditable(false);
		showmsg.setBackground(getBackground());
		showmsg.setText("");
		OK = new JButton("ȷ��");
		OK.addActionListener(this);
		
		this.setLayout(new FlowLayout());
		this.add(guide);
		this.add(input);
		this.add(guide1);
		this.add(input1);
		this.add(showmsg);
		this.add(OK);
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == OK){
			//��ȡ����
			String inputID = input.getText();
			String inputpw = input1.getText();
			String id = person.getID();
			String pw = person.getPassword();
			
			if(inputID.equals(id) && inputpw.equals(pw))
				//���û��������붼�뵱ǰ�û�ƥ��
				//����������
				this.mv = new myWindow(person);
			    //�˳���½�Ի���
				this.setVisible(false);
			}
			else{
				//����Ϣ��ƥ������ʾ��¼��Ϣ����ȷ
				this.showmsg.setText("");
				this.showmsg.append("��½��Ϣ����ȷ");
			}
		}
}


