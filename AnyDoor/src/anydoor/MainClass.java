package anydoor;
/*
 * create doors at any size,color,material or function
 * ver1
 * written by elfzuo
 * 2013.10.16
 */

public class MainClass {
	public static void main(String[] args){
		userdisplay ud = new userdisplay();
		//父类引用子类对象
		Door door = ud.functionselect();
		//接口回调
		anyDoor anydoor = (anyDoor) door;
		//通过sizeselect为door设置宽度和高度
		ud.sizeselect(door);
		//通过materialselect为door设置材质
		ud.materialselect(door);
		//通过colorselect为door设置颜色
		ud.colorselect(door);
		//获取door的各项属性并输出
		double width = door.getWidth();
		double high = door.getHigh();
		String color = door.getColor();
		String material = door.getMaterial();
		System.out.print("这是一个"+width+"米宽,"+high+"米高的"+color+material+"的");
		anydoor.displayfunction();
		//子类实现的父类的抽象方法测试
		door.openDoor();
		door.closeDoor();
	}
}
