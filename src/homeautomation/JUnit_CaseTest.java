package homeautomation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class JUnit_CaseTest {
 
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		XmasLight christmastreeLight = new XmasLight("Christmas Tree");
		Light pathwayLight = new Light("Pathway Lights");
		Light snowmanLight = new Light ("Snowman Light");
		GarageDoor garageDoor = new GarageDoor("Garage Door");
		Trainset trainset = new Trainset("Trainset");
		Nativityscene nativityscene = new Nativityscene("Nativity Scene");
		XmasLight xmaslight = new XmasLight("Christmas Tree");
		Snowman snowman = new Snowman();
		Xmasmusic xmasmusic = new Xmasmusic();
		
		
		LightOnCommand livingRoomLightOn = 
				new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = 
				new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = 
				new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = 
				new LightOffCommand(kitchenLight);
		XmasOnCommand christmastreeLightOn = 
				new XmasOnCommand(christmastreeLight);
		XmasOffCommand christmastreeLightOff = 
				new XmasOffCommand(christmastreeLight);
		LightOnCommand pathwayLightOff = 
				new LightOnCommand(pathwayLight);
		LightOffCommand pathwayLightOn = 
				new LightOffCommand(pathwayLight);
		LightOnCommand snowmanLightOff = 
				new LightOnCommand(snowmanLight);
		LightOffCommand snowmanLightOn = 
				new LightOffCommand(snowmanLight);
		TrainsetOnCommand trainsetOn = 
				new TrainsetOnCommand(trainset);
		TrainsetOffCommand trainsetOff = 
				new TrainsetOffCommand(trainset);
		NativitysceneOnCommand nativitysceneOn = 
				new NativitysceneOnCommand(nativityscene);
		NativitysceneOffCommand nativitysceneOff = 
				new NativitysceneOffCommand(nativityscene);
		GarageDoorUpCommand garageDoorUp =
				new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown =
				new GarageDoorDownCommand(garageDoor);
 
		
		//////// Weather / Observer Pattern ////////
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		LocalTime sunrise = LocalTime.of(6,30);
		LocalTime sunset = LocalTime.of(18,30);
		LocalTime currentTime = weatherData.getTime();
		Random hour = new Random();
		Random min = new Random();
		LocalTime randomtime = LocalTime.of(hour.nextInt(23), min.nextInt(59));
		System.out.println("Observers notified of change in sunrise and sunset......");
		weatherData.setMeasurements(sunrise, sunset);
		//////////////////////////////////////////////
		
		/////////Command Pattern /////////////////////////
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, christmastreeLightOn, christmastreeLightOff);
		remoteControl.setCommand(3, pathwayLightOn, pathwayLightOff);
		remoteControl.setCommand(4, snowmanLightOn, snowmanLightOff);
		remoteControl.setCommand(5, trainsetOn, trainsetOff);
		remoteControl.setCommand(6, nativitysceneOn, nativitysceneOff);
		remoteControl.setCommand(7, garageDoorUp, garageDoorDown);

		////////Facade call for Christmas ///////////////////
		Griswoldxmas griswoldxmas = new Griswoldxmas(nativityscene, trainset, xmaslight, snowman, xmasmusic);
		/////////////////////////////////////////////////////
		
		///////Log Iterator Pattern ///////////////
		GarageDoor garagelog = new GarageDoor("GarageLog");
		Light lightlog = new Light("LightLog");
		LogReader logreader = new LogReader (garagelog, lightlog);
//		*****CANNOT GET CODE TO WORK DUE TO AN ERROR IN GARAGE ARRAY SETUP
		
		
		
		String choice = null;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Welcome Home Prof. Nowak");
			System.out.println("Command Options: ");
			System.out.println("1 - Display Remote Control");
			System.out.println("2 - Display Current Time");
			System.out.println("3 - Display Sunrise / Sunset");
			System.out.println("4 - Switch Living Room Light");
			System.out.println("5 - Switch Kitchen Light");
			System.out.println("6 - Switch Pathway Light");
			System.out.println("7 - Switch Garage Door");
			System.out.println("8 - Turn on/off Christmas Lights");
			System.out.println("9 - Print Activity Logs");   // NOT WORKING ****
			System.out.println("Q - Quit");
			choice = scan.nextLine();
			switch (choice) {
			case "1":
				System.out.println(remoteControl);
				break;
			case "2":
				System.out.println("The current time is : " + currentTime + "\n");
				break;
			case "3":
				currentDisplay.display();
				System.out.println();
				break;
			case "4":
				remoteControl.onButtonWasPushed(0);
				remoteControl.offButtonWasPushed(0);
				break;
			case "5":
				remoteControl.onButtonWasPushed(1);
				remoteControl.offButtonWasPushed(1);
				break;
			case "6":
				remoteControl.onButtonWasPushed(3);
				remoteControl.offButtonWasPushed(3);
				break;
			case "7":
				remoteControl.onButtonWasPushed(7);
				remoteControl.offButtonWasPushed(7);
				break;
			case "8":
				griswoldxmas.start();
				griswoldxmas.end();
				break;
			case "9":   //***NOT WORKING PROPERLY****
				logreader.printLog();
				break;
				
		} } while (!choice.equalsIgnoreCase("Q"));
		
	}
}

