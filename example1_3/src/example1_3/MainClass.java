package example1_3;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.printArea(100);
		Retangle retangle = new Retangle();
		retangle.printAre(100,65);
	}

}
class Circle{
	void printArea(double r){
		System.out.println(r*r*3.1415926);
	}
}
class Retangle{
	void printAre(double width,double hight){
		System.out.println(width*hight);
	}
}