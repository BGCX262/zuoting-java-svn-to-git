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

public class getNumberDialog extends JDialog implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int num = 1;
	//�û���ʾ�ı���
	JTextArea guide;
	//��ʾ�û���ȡ�ĺ���
	JTextArea shownum;
	
	JButton OK;
	//��ȡ��Ļ��С
	Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
	getNumberDialog(){
		
		init();
	}
	void init() {
		// TODO Auto-generated method stub
		//���ô�С
		this.setSize(400,130);
		//����λ��
		this.setLocation(screenSize.width/2-200,screenSize.height/2-200);
		//���ø����������������
		guide = new JTextArea(1,33);
		guide.append("��Ǻ��Լ��ĺ���:"+String.valueOf(getNumberDialog.num));
		guide.setEditable(false);
		guide.setBackground(getBackground());
		guide.setFont(new Font("����",Font.BOLD,12));
		shownum = new JTextArea(1,33);
		shownum.setEditable(false);
		shownum.setBackground(getBackground());
		shownum.setText("���ȷ�Ϻ���Ⱥ�");
		OK = new JButton("ȷ��");
		OK.addActionListener(this);
		
		this.setLayout(new FlowLayout());
		this.add(guide);
		this.add(shownum);
		this.add(OK);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == OK){
			//���û�����ȷ�ϰ�ť������������10��ģ��ȴ�����Ȼ���Զ��ر�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.setVisible(false);
		}
		
	}
}
