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
	//提示用户输入转账ID
	JTextArea guide;
	//用户输入文本框
	JTextArea input;
	//提示用户输入转账金额
	JTextArea guide1;
	//用户输入文本框
	JTextArea input1;
	//操作状态
	JTextArea showmsg;
	//确认输入按钮
	JButton OK;
	//获取显示器大小
	Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
	//声明当前用户
	Person person;
	//转账金额
	int transmoney;
	//转账ID
	String transID;
	
	TransferDialog(Person p){
		//初始化对话框
		person = p;
		init();
	}
	void init(){
		//设置大小
		this.setSize(400,200);
		//设置位置
		this.setLocation(screenSize.width/2-200,screenSize.height/2-200);
		//设置各项组件并加入容器
		guide = new JTextArea(1,33);
		guide.append("转账账户：");
		guide.setEditable(false);
		guide.setBackground(getBackground());
		guide.setFont(new Font("黑体",Font.BOLD,12));
		input = new JTextArea(1,30);
		input.setText("0");
		guide1 = new JTextArea(1,33);
		guide1.append("其输入转账金额：");
		guide1.setEditable(false);
		guide1.setBackground(getBackground());
		guide1.setFont(new Font("黑体",Font.BOLD,12));
		input1 = new JTextArea(1,30);
		input1.setText("0");
		showmsg = new JTextArea(1,33);
		showmsg.append("");
		showmsg.setEditable(false);
		showmsg.setBackground(getBackground());
		showmsg.setFont(new Font("黑体",Font.BOLD,12));
		OK = new JButton("确定");
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
			//若单击确认，则获取用户输入转账金额
			transmoney = Integer.valueOf(input1.getText());
			if(person.money-transmoney<0){ 
				//若转账金额超过已有金额，则提示 余额不足
				showmsg.setText("");
				showmsg.append("余额不足");
			}
			else{
				//否则执行转账操作
				person.money-=transmoney;
				showmsg.setText("");
				showmsg.append("转账成功");
			}
			//this.setVisible(false);
		}
	}
}
