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

//主对话框类
public class myWindow extends JDialog implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//存款按钮
	JButton deposit;
	//存款按钮
	JButton withdraw;
	//转账按钮
	JButton transfer;
	//提示用户选择
	JTextArea showmsg;
	//控制格式
	JTextArea blank;
	//获取显示器大小
	Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
	Person person;
	
	myWindow(Person p){
		person = p;
		init();
	}
	
	void init(){
		//设置大小
		this.setSize(400,130);
		//设置位置
		this.setLocation(screenSize.width/2-200,screenSize.height/2-200);
		//设置各项组件并加入容器
		showmsg = new JTextArea(1,33);
		showmsg.setEditable(false);
		showmsg.setBackground(getBackground());
		showmsg.setText("请选择操作");
		deposit = new JButton("存款");
		deposit.addActionListener(this);
		withdraw = new JButton("取款");
		withdraw.addActionListener(this);
		transfer = new JButton("转账");
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
			//若单击存款按钮则使用存款类的模板方法
			Deposit deposit = new Deposit(person);
			deposit.bankstep();
	
		}
		else if(e.getSource() == withdraw){
			//若单击取款按钮则使用取款类的模板方法
			Withdraw withdraw = new Withdraw(person);
			withdraw.bankstep();
		}
		else if(e.getSource() == transfer){
			//若单击转账按钮则使用转账类的模板方法
			Transfer transfer = new Transfer(person);
			transfer.bankstep();
		}
	}

}
