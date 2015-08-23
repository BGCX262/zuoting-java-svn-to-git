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
	//用户提示文本框
	JTextArea guide;
	//提示用户获取的号码
	JTextArea shownum;
	
	JButton OK;
	//获取屏幕大小
	Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
	getNumberDialog(){
		
		init();
	}
	void init() {
		// TODO Auto-generated method stub
		//设置大小
		this.setSize(400,130);
		//设置位置
		this.setLocation(screenSize.width/2-200,screenSize.height/2-200);
		//设置各种组件并加入容器
		guide = new JTextArea(1,33);
		guide.append("请记好自己的号码:"+String.valueOf(getNumberDialog.num));
		guide.setEditable(false);
		guide.setBackground(getBackground());
		guide.setFont(new Font("黑体",Font.BOLD,12));
		shownum = new JTextArea(1,33);
		shownum.setEditable(false);
		shownum.setBackground(getBackground());
		shownum.setText("点击确认后请等候");
		OK = new JButton("确定");
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
			//若用户单击确认按钮，主进程休眠10秒模拟等待过程然后自动关闭
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
