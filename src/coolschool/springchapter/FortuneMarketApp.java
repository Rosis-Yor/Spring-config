package coolschool.springchapter;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FortuneMarketApp {

	public static void main(String[] args) {

	// this is the example with annotaions configuration
	// here we are reading the config file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
	
	// getting bean from container
	Coach fit = context.getBean("fitnessCoach", Coach.class) ;
	
	// executing its mehods
	System.out.println(fit.getDailyWorkout());
	System.out.println(fit.getDailyFortune());
		
	
	}

}
