package project1;

public class MyApp {
	public static void main (String[]arges) {
		
		// create the object
		// Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}
	
}
