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

public class TransferDialog extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	//��ʾ�û�����ת��ID
	JTextArea guide;
	//�û������ı���
	JTextArea input;
	//��ʾ�û�����ת�˽��
	JTextArea guide1;
	//�û������ı���
	JTextArea input1;
	//����״̬
	JTextArea showmsg;
	//ȷ�����밴ť
	JButton OK;
	//��ȡ��ʾ����С
	Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
	//������ǰ�û�
	Person person;
	//ת�˽��
	int transmoney;
	//ת��ID
	String transID;
	
	TransferDialog(Person p){
		//��ʼ���Ի���
		person = p;
		init();
	}
	void init(){
		//���ô�С
		this.setSize(400,200);
		//����λ��
		this.setLocation(screenSize.width/2-200,screenSize.height/2-200);
		//���ø����������������
		guide = new JTextArea(1,33);
		guide.append("ת���˻���");
		guide.setEditable(false);
		guide.setBackground(getBackground());
		guide.setFont(new Font("����",Font.BOLD,12));
		input = new JTextArea(1,30);
		input.setText("0");
		guide1 = new JTextArea(1,33);
		guide1.append("������ת�˽�");
		guide1.setEditable(false);
		guide1.setBackground(getBackground());
		guide1.setFont(new Font("����",Font.BOLD,12));
		input1 = new JTextArea(1,30);
		input1.setText("0");
		showmsg = new JTextArea(1,33);
		showmsg.append("");
		showmsg.setEditable(false);
		showmsg.setBackground(getBackground());
		showmsg.setFont(new Font("����",Font.BOLD,12));
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
			//������ȷ�ϣ����ȡ�û�����ת�˽��
			transmoney = Integer.valueOf(input1.getText());
			if(person.money-transmoney<0){ 
				//��ת�˽������н�����ʾ ����
				showmsg.setText("");
				showmsg.append("����");
			}
			else{
				//����ִ��ת�˲���
				person.money-=transmoney;
				showmsg.setText("");
				showmsg.append("ת�˳ɹ�");
			}
			//this.setVisible(false);
		}
	}
}
