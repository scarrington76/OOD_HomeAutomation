package HomeAuto;

import java.awt.Label;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Random;

public class HomeAutoMationController {
	public static void main(String args[]) {
		NFL nfl = new NFL();
		AFL afl = new AFL();
		CombinedLeagues combinedleague = new CombinedLeagues(nfl, afl);
		
		System.out.println("Announcing the new combined 1966 NFL League!!!\n");
		combinedleague.printTeam();
		
		System.out.println("\nFan asks, does Denver have a dome in the new league?");
		System.out.print("Commissioner Replies: ");
		if (combinedleague.hasDome("Denver")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("\nFan asks, does Houston have a dome in the new league?");
		System.out.print("Commissioner Replies: ");
		if (combinedleague.hasDome("Houston")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		///// Weather / Observer Pattern
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		
		currentDisplay.display();
		
		Label currentTime = weatherData.getTime();
		LocalTime sunrise = LocalTime.of(6,30);
		LocalTime sunset = LocalTime.of(18, 30);
		Random hour = new Random();
		Random min = new Random();
		LocalTime randomtime = LocalTime.of(hour.nextInt(23), min.nextInt(59));
		System.out.println(randomtime);

		System.out.println("Welcome Home Scott");
		System.out.println("The current time is : " + currentTime);
//		weatherData.setMeasurements(
//		weatherData.setMeasurements(82, 70, null);
//		weatherData.setMeasurements(78, 90, null);
		
////	BedroomLight bedroomlight = new CakeStore();
////	PastryStore cookieStore = new CookieStore();
//	RemoteControl remoteControl = new RemoteControl();
////	Light light = new Light("Living Room");
////	Oven oven = new Oven();
//	
////	LightOnCommand lightOn = new LightOnCommand(light);
////	OvenOnCommand ovenOn = new OvenOnCommand(oven);
////	LightOffCommand lightOff = new LightOffCommand(light);
////	OvenOffCommand ovenOff = new OvenOffCommand(oven);
//
////	Command[] kitchenOn = { lightOn, ovenOn};
////	Command[] kitchenOff = { lightOff, ovenOff};
////	MacroCommand kitchenOnMacro = new MacroCommand(kitchenOn);
////	MacroCommand kitchenOffMacro = new MacroCommand(kitchenOff);
////	remoteControl.setCommand(0, kitchenOnMacro, kitchenOffMacro);
//	  
//	System.out.println("--- Turning Kitchen On ---");
//	remoteControl.onButtonWasPushed(0);
////	Bakedgood bakedgood = cakeStore.orderBakedgood("birthday");
//	System.out.println("Susan ordered a " + bakedgood + "\n");
//	
//	
//
////	bakedgood = cookieStore.orderBakedgood("birthday");
//	System.out.println("Scott ordered a " + bakedgood + "\n");

	}
}
