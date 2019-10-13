package coolschool.springchapter;

import java.io.BufferedReader;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import coolschool.utilities.MagicWand;

@Lazy
@Component
public class FitnessCoach implements Coach {

	@Autowired
	@Qualifier("fromFile")
	FortuneService fortuneService;

	FitnessCoach() {
	}

	// the bean is just created
	@PostConstruct
	public void init() {

		System.out.println("\n\n\t == Proper initialization is the mother of the well - running app ==\n\n");
	}

	@Override
	public String getDailyWorkout() {

		return " Keeping people fit ! ";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
