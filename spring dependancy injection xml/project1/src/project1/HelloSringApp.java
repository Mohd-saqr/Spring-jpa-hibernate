package project1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import setter_injection.Car;

public class HelloSringApp {
	 ClassPathXmlApplicationContext cpa= new
			ClassPathXmlApplicationContext("applicationContext.xml");
	public static void main(String[] args) {
	// inversion of controll 
		/// load the spring congiguration file
		 ClassPathXmlApplicationContext cpa= new
					ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrive bean from spring container
		 Coach c =cpa.getBean("myCouch",Coach.class);
		//call methods on the bean
		 System.out.println(c.getDailyWorkout());
		
		// close the context
		 
		 
		 
		 /// Constructor dependency injection 
		 

		 
		 DependancyCoach couch2= cpa.getBean("dependancyInjection" ,DependancyCoach.class);
		 
		 System.out.println(couch2.getDailyWorkout());
		 
//			setter injection
			
//			Car car = cpa.getBean("Car" ,Car.class);
//			System.out.print(car.getEngineType());
//			cpa.close();
	}
	
	

	
	
	
	

}
