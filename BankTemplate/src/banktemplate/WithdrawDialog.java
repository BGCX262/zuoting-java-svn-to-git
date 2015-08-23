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
	//提示用户输入存款金额
	JTextArea guide;
	//用户输入文本框
	JTextArea input;
	//提示用户目前金额
	JTextArea showmsg;
	//确认输入按钮
	JButton OK;
	//获取显示器大小
	Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
	Person person;
	
	WithdrawDialog(Person p){
		//初始化对话框
		person = p;
		init();
	}
	void init(){
		//设置大小
		this.setSize(400,150);
		//设置位置
		this.setLocation(screenSize.width/2-200,screenSize.height/2-200);
		//设置各项组件并且加入容器
		guide = new JTextArea(1,33);
		guide.append("请输入取款金额：");
		guide.setEditable(false);
		guide.setBackground(getBackground());
		guide.setFont(new Font("黑体",Font.BOLD,12));
		input = new JTextArea(1,30);
		input.setText("0");
		showmsg = new JTextArea(1,33);
		showmsg.setEditable(false);
		showmsg.setBackground(getBackground());
		showmsg.setText("您当前的金额是："+String.valueOf(person.money));
		OK = new JButton("确定");
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
			//若单击确认按钮则获取用户输入取款金额
			int sub = Integer.valueOf(input.getText());
			if(person.money-sub<0){
				//若取款金额超过已有金额则提示用户余额不足
				showmsg.setText("");
				showmsg.append("余额不足！");
			}
			else{
				//否则执行取款操作
				person.money -= sub;
				showmsg.setText("");
				showmsg.append("您当前的金额是："+String.valueOf(person.money));
			}
			//this.setVisible(false);
		}
	}
	
}
