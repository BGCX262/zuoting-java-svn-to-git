package waterState;


public class Water{
	WaterState state;
	public void show(){
		state.showState();
	}
	public void setState(WaterState s){
		this.state = s;
	}
	public void judge(double temp){
//		ͨ���¶��ж�ˮ��״̬
		System.out.println("ˮ��״̬��");
		Water test = new Water(); 
		if(temp>=100){
			test.setState(new Qitai());
			test.show();
		}
		else if(temp<100&&temp>0){
			test.setState(new Yetai());
			test.show();
		}
		else if(temp<0){
			test.setState(new Gutai());
			test.show();
		}
	}
}