package oneinstance;
/*
 * limit the creation of the instance
 * ver1
 * written by elfzuo
 * 2013.10.14
 */
public class OneInstance {
	static int count = 0; //记录已创建实例的个数
	private OneInstance(){
		//将构造函数做成私有的，外部不能直接访问
		System.out.println("实例被创建");
		//count自增，可作为判断限制实例的创建
		count++;
	}
	static void creation(){
		//只能通过creation创建实例，所以只能做成类方法
		if(count == 0){
			//判断若已创建实例数为零则创建实例
			OneInstance oi = new OneInstance();
		}
		else{
			//判断若已创建实例数不为零则提示用户只能创建单例
			System.out.println("只能创建唯一实例");
		}
	}
	
}
class MainClass{
	public static void main(String[] args){
		for(int i=0;i<3;i++){
			OneInstance.creation();
		}
	}
}