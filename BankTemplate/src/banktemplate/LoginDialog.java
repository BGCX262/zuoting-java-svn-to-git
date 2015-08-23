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
	//提示用户输入ID
	JTextArea guide;
	//用户输入文本框
	JTextArea input;
	//提示用户输入密码
	JTextArea guide1;
	//用户输入文本框
	JPasswordField input1;
	//提示用户状态
	JTextArea showmsg;
	//确认输入按钮
	JButton OK;
	//获取文本框大小
	Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
	Person person;
	myWindow mv;
	
	LoginDialog(Person p){
		//初始化对话框
		person = p;
		init();
	}
	void init(){
		//设置大小
		this.setSize(400,200);
		//设置位置
		this.setLocation(screenSize.width/2-200,screenSize.height/2-200);
		//设置各类控件并加到容器中
		guide = new JTextArea(1,33);
		guide.append("请输入ID：");
		guide.setEditable(false);
		guide.setBackground(getBackground());
		guide.setFont(new Font("黑体",Font.BOLD,12));
		input = new JTextArea(1,30);
		guide1 = new JTextArea(1,33);
		guide1.append("请输入密码：");
		guide1.setEditable(false);
		guide1.setBackground(getBackground());
		guide1.setFont(new Font("黑体",Font.BOLD,12));
		input1 = new JPasswordField(30);
		showmsg = new JTextArea(1,33);
		showmsg.setEditable(false);
		showmsg.setBackground(getBackground());
		showmsg.setText("");
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
			//获取输入
			String inputID = input.getText();
			String inputpw = input1.getText();
			String id = person.getID();
			String pw = person.getPassword();
			
			if(inputID.equals(id) && inputpw.equals(pw))
				//若用户名与密码都与当前用户匹配
				//生成主窗口
				this.mv = new myWindow(person);
			    //退出登陆对话框
				this.setVisible(false);
			}
			else{
				//若信息不匹配则提示登录信息不正确
				this.showmsg.setText("");
				this.showmsg.append("登陆信息不正确");
			}
		}
}


