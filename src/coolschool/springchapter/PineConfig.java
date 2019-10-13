package coolschool.springchapter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PineConfig {
	
	@Bean
	public FortuneService wellBeingFortuneService() {
		
		return new WellBeingFortuneService() ;
	}
	
	@Bean
	public Coach mountainCoach() {
		
		return new MountainCoach(wellBeingFortuneService());
	}
	

}
