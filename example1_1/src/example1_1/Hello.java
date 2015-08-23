package example1_1;

public class Hello {
	public static void main(String[] args){
		System.out.println("this is a java program!");
		Student student = new Student();
		student.speak("i'm a student ^_^");
	}
}
class Student{
	void speak(String s){
		System.out.println(s);
	}
}