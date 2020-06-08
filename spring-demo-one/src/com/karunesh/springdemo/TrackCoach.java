package com.karunesh.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getForturne();
	}
	
	public void doMyStartupStuff() {
		System.out.println("Track Coach : inside method doMyStartupStuff");
	}
	
	public void doMyCleanupstuff() {
		System.out.println("Track Coach : inside method doMyCleanupstuff");
	}
	

}
