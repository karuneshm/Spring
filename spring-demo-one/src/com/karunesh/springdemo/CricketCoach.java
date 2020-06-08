package com.karunesh.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	

	public CricketCoach() {
		System.out.println("Cricket Coach : inside no-arg Constrictor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach : inside setter method");
		this.fortuneService = fortuneService;
	}
	
   
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach : inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach : inside setter method - setTeam");

		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fasy bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getForturne();
	}

}
