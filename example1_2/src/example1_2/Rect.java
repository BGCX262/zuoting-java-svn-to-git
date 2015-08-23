package example1_2;

public class Rect {
	double width;
	double hight;
	double getArea(){
		return width*hight;
	}
}
class test{
	public static void main(String[] args){
		Rect rect = new Rect();
		rect.width = 1.2;
		rect.hight = 1.2;
		double area = rect.getArea();
		System.out.println(area);
	}
}
