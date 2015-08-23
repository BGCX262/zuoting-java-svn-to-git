package example2_9;
enum Week{
	sunday,monday,tuesday,wednesday,thursday,friday,saturday
}
public class example2_9 {
	public static void main(String[] args){
		Week week = Week.friday;
		if(week == Week.sunday || week == Week.saturday){
			System.out.println("today is "+week);
			System.out.println("have a rest");
		}
		else{
			System.out.println("today is "+week);
		}
	}
}
