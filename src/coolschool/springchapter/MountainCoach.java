package coolschool.springchapter;

public class MountainCoach implements Coach {

	private FortuneService fortuneService;
	
	public MountainCoach(FortuneService theFortuneService) {
		
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
	
		return " Climbed 2200 m high peak . ";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
