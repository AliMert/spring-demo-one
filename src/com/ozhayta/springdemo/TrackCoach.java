package com.ozhayta.springdemo;

public class TrackCoach implements Coach {
	public TrackCoach() {
		System.out.println("TrackCoach: inside no-arg constructor");
	}
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("TrackCoach: inside 'FortuneService' arg constructor");

		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method 'doMyStartupStuff'");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method 'doMyCleanupStuff'");
	}

}
