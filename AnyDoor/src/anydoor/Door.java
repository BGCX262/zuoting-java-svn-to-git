package anydoor;
import java.util.*;
/*
 * create doors at any size,color,material or function
 * ver1
 * written by elfzuo
 * 2013.10.16
 */

//定义anyDoor接口，只关注显示门功能的操作；
interface anyDoor {
	public void displayfunction();
}
//封装一个存放门的属性的抽象类
public abstract class Door{
	private double width;//门的宽度
	private double high;//门的高度
	private String color;//门的颜色
	private String material;//门的材质
	Door(){
		//实现无参构造函数，方便子类使用
		width = 1.2;//默认无参时门的宽为1.2m
		high = 2.5;//默认无参时门的高度为2.5m
	}
	Door(double width,double high,String color,String material){
		//实现带参的构造函数，方便子类使用
		this.width = width;
		this.high = high;
	}
	abstract void openDoor();//声明抽象方法形容门被打开
	abstract void closeDoor();//声明抽象方法形容门被关闭
	void setWidth(double width){
		//设置门的宽度
		this.width = width;
	}
	void setHigh(double high){
		//设置门的高度
		this.high = high;
	}
	void setColor(String color){
		//设置门的高度
		this.color = color;
	}
	void setMaterial(String material){
		//设置门的高度
		this.material = material;
	}
	double getHigh(){
		//获取门的高度
		return high;
	}
	double getWidth(){
		//获取门的宽度
		return width;
	}
	String getColor(){
		//获取门的颜色
		return color;
	}
	String getMaterial(){
		//获取门的材质
		return material;
	}
	
}
class thiefproofDoor extends Door implements anyDoor{
	//防盗门类继承Door类并且实现anyDoor接口
	thiefproofDoor(){
		//使用父类无参构造方法
		super();
	}
	thiefproofDoor(double width, double high, String color, String material) {
		//使用父类带参构造方法
		super(width, high, color, material);
	}
	
	@Override
	public void displayfunction() {
		//重写接口方法
		System.out.println("防盗门");
	}

	@Override
	void openDoor() {
		//重写父类抽象方法
		System.out.println("防盗门已打开");
		
	}

	@Override
	void closeDoor() {
		//重写父类抽象方法
		System.out.println("防盗门已关闭");
		
	}
	
}
class waterproofDoor extends Door implements anyDoor{
	//防水门类继承Door类并且实现anyDoor接口
	waterproofDoor(){
		//使用父类无参构造方法
		super();
	}
	
	waterproofDoor(double width, double high, String color, String material) {
		//使用父类带参构造方法
		super(width, high, color, material);
	}

	@Override
	public void displayfunction() {
		//重写接口方法
		System.out.println("防水门");
	}

	@Override
	void openDoor() {
		// 重写父类抽象方法
		System.out.println("防水门已打开");
		
	}

	@Override
	void closeDoor() {
		// 重写父类抽象方法
		System.out.println("防水门已关闭");
		
	}
	
}
class bulletproofDoor extends Door implements anyDoor{
	//防弹门类继承Door类并且实现anyDoor接口
	bulletproofDoor(){
		//使用父类无参构造方法
		super();
	}
	bulletproofDoor(double width, double high, String color, String material) {
		//使用父类带参构造方法
		super(width, high, color, material);
	}

	@Override
	public void displayfunction() {
		// 重写接口方法
		System.out.println("防弹门");
	}

	@Override
	void openDoor() {
		// 重写父类抽象方法
		System.out.println("防弹门已打开");
		
	}

	@Override
	void closeDoor() {
		// 重写父类抽象方法
		System.out.println("防弹门已关闭");
		
	}
	
}
class fireproofDoor extends Door implements anyDoor{
	//防火门继承Door类并且实现anyDoor接口
	fireproofDoor(){
		//使用父类无参构造方法
		super();
	}
	fireproofDoor(double width, double high, String color, String material) {
		//使用父类带参构造方法
		super(width, high, color, material);
	}

	@Override
	public void displayfunction() {
		// 重写接口方法
		System.out.println("防火门");
	}

	@Override
	void openDoor() {
		// 重写父类抽象方法
		System.out.println("防火门已打开");
		
	}

	@Override
	void closeDoor() {
		// 重写父类抽象方法
		System.out.println("防火门已关闭");
		
	}
	
}
class rustproofDoor extends Door implements anyDoor{
	//防锈门继承Door类并且实现anyDoor接口
	rustproofDoor(){
		//使用父类无参构造方法
		super();
	}
	rustproofDoor(double width, double high, String color, String material) {
		//使用父类带参构造方法
		super(width, high, color, material);
	}

	@Override
	public void displayfunction() {
		// 重写接口方法
		System.out.println("防锈门");
	}

	@Override
	void openDoor() {
		// 重写父类抽象方法
		System.out.println("防锈门已打开");
		
	}

	@Override
	void closeDoor() {
		// 重写父类抽象方法
		System.out.println("防锈门已关闭");
		
	}
}
//封装供给用户选择菜单的类
class userdisplay{
	//功能选择菜单
	 Door functionselect(){
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("***        请输入需要创建的功能                     ***");
		System.out.println("***          (键入0退出)            ***");
		System.out.println("***          1: 防盗门                                 ***");
		System.out.println("***          2: 防水门                                 ***");
		System.out.println("***          3: 防弹门                                 ***");
		System.out.println("***          4: 防火门                                 ***");
		System.out.println("***          5: 防锈门                                 ***");
		System.out.println("*************************************");
		System.out.println("*************************************");
	    Scanner select = new Scanner(System.in);//等待用户输入选择
	    int i = select.nextInt();
	    Door door = null;
	    switch(i){//根据用户选择生成不同的门
	    case 1:
	    	door = new thiefproofDoor();
	    	System.out.println("已生成防盗门");
	    	break;
	    case 2:
	    	door = new waterproofDoor();
	    	System.out.println("已生成防水门");
	    	break;
	    case 3:
	    	door = new bulletproofDoor();
	    	System.out.println("已生成防弹门");
	    	break;
	    case 4:
	    	door = new fireproofDoor();
	    	System.out.println("已生成防火门");
	    	break;
	    case 5:
	    	door = new rustproofDoor();
	    	System.out.println("已生成防锈门");
	    	break;
	    }
	    return door;//将生成的门返回
	}
	 
	 //大小设置菜单，入输入1则设置默认参数，输入2则要求用户输入参数
	 void sizeselect(Door door){
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("***          请输入需要创建的门                    ***");
		System.out.println("***                               ***");
		System.out.println("***      1:   创建默认参数的门                     ***");
		System.out.println("*** (默认宽1.2m,高2.5m,颜色黑色,材质木质)***");
		System.out.println("***                               ***");
		System.out.println("***      2:   创建输入参数的门                     ***");
		System.out.println("***                               ***");
		System.out.println("*************************************");
		System.out.println("*************************************");
	    Scanner select = new Scanner(System.in);
	    int i = select.nextInt();
	    switch(i){
	    case 1:
	    	//创建实例时用无参构造函数，故有默认宽值1.2和默认高值2.5
	    	System.out.println("已设置宽为1.2m,高为2.5m");
	    	break;
	    case 2:
	    	//要求用户输入宽度
	    	System.out.println("输入门的宽");
	    	Scanner scanner = new Scanner(System.in);
	    	//设置传入的door的宽为用户输入值
	    	door.setWidth(scanner.nextDouble());
	    	//要求用户输入高度
	    	System.out.println("输入门的高");
	    	scanner = new Scanner(System.in);
	    	//设置传入的door的高为用户输入值
	    	door.setHigh(scanner.nextDouble());
	    	//显示已设置的宽度和高度
	    	System.out.println("已设置宽为:"+door.getWidth()+" 高为:"+door.getHigh());
	    	break;
	    }
	}
	 //设置颜色菜单
	 void colorselect(Door door){
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("***        请输入需要创建的颜色                     ***");
		System.out.println("***          (键入0退出)            ***");
		System.out.println("***          1: 黑色                                    ***");
		System.out.println("***          2: 白色                                    ***");
		System.out.println("***          3: 蓝色                                    ***");
		System.out.println("***          4: 绿色                                    ***");
		System.out.println("***          5: 棕色                                    ***");
		System.out.println("*************************************");
		System.out.println("*************************************");
	    Scanner select = new Scanner(System.in);
	    int i = select.nextInt();
	    switch(i){//根据不同的用户选择将传入的door的颜色值设置为不同字符串
	    case 1:
	    	door.setColor(new String("黑色"));
	    	System.out.println("已设置颜色为"+door.getColor());
	    	break;
	    case 2:
	    	door.setColor(new String("白色"));
	    	System.out.println("已设置颜色为"+door.getColor());
	    	break;
	    case 3:
	    	door.setColor(new String("蓝色"));
	    	System.out.println("已设置颜色为"+door.getColor());
	    	break;
	    case 4:
	    	door.setColor(new String("绿色"));
	    	System.out.println("已设置颜色为"+door.getColor());
	    	break;
	    case 5:
	    	door.setColor(new String("棕色"));
	    	System.out.println("已设置颜色为"+door.getColor());
	    	break;
	    }
	}
	 //材质设置菜单
	 void materialselect(Door door){
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println("***        请输入需要创建的材质                     ***");
		System.out.println("***          (键入0退出)            ***");
		System.out.println("***          1: 金属门                                 ***");
		System.out.println("***                               ***");
		System.out.println("***          2: 木质门                                 ***");
		System.out.println("***                               ***");
		System.out.println("***          3: 玻璃门                                 ***");
		System.out.println("*************************************");
		System.out.println("*************************************");
	    Scanner select = new Scanner(System.in);
	    int i = select.nextInt();
	    switch(i){//根据不同的用户选择将传入的door的材质设置为不同字符串
	    case 1:
	    	door.setMaterial(new String("金属"));
	    	System.out.println("已设置门的材质为"+door.getMaterial());
	    	break;
	    case 2:
	    	door.setMaterial(new String("木质"));
	    	System.out.println("已设置门的材质为"+door.getMaterial());
	    	break;
	    case 3:
	    	door.setMaterial(new String("玻璃"));
	    	System.out.println("已设置门的材质为"+door.getMaterial());
	    	break;
	    	
	    }
	}
     
}