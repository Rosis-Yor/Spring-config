package coolschool.springchapter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClimbingJavaConfigDemoApp {

	public static void main(String[] args) {

		// this is the example with programmatic configuration
		// here we read the configuration .java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(PineConfig.class) ;
		
		// getting bean from container
		Coach theCoach = context.getBean("mountainCoach", Coach.class) ;
		
		// executing its methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}

}
