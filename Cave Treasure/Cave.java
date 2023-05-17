package nerd;

import java.util.Scanner;

public class Cave {
	public static void go() throws InterruptedException {
		System.out.println("Game notes:"
				+ "\n - Invalid inputs results in death or crash"
				+ "\n - Using a wrong item may kill you and/or loose items"
				+ "\n - Use spaces for your name; use \"_\"");
		Thread.sleep(6000);
		
		System.out.println("Hello, brave adventure!");
		Thread.sleep(2000);
		System.out.println("You are about to embark on a dangerous quest! One filled with traps and hazards at every turn!");
		Thread.sleep(4000);
		System.out.println("Before you throw you into the dungeon like a lamb to the slaughter,\n"
				+ "we need to know your name!");
		Thread.sleep(3000);
		System.out.println("Enter name:");
				
	}
	
	
	
	public static void lore(String name) throws InterruptedException{
		System.out.println(name+"? Ok, we will try to remember that if you make it back.");
		Thread.sleep(3000);
		System.out.println("Our team and I will make a rondavue to the cave's enterance and drop you and your gear off.\n"
				+ "From there you are on your own...");
		Thread.sleep(3000);
		System.out.println("*Jeep starting*");
		Thread.sleep(1500);
		System.out.println("*Jeep driving over rocks*");
		Thread.sleep(1500);
		System.out.println("*Jeep stopping on loose gravel*");
		Thread.sleep(2000);
		System.out.println("This is your stop. God speed!");
	}
	public static void options(int level) throws InterruptedException{
		if(level==0) {
			Thread.sleep(500);
			System.out.println("1) Check bag");
			Thread.sleep(500);
			System.out.println("2) Use Item");
			Thread.sleep(1000);
			System.out.println("3) Jump!");
		}
		else if(level==1) {
			System.out.println("You use your lighter to light your torch, its embers quickly ingnite and radiet throughout the room...");
			Thread.sleep(3000);
			System.out.println("There is something else in the room, there is moment and a sutle rattling sound... Before you is a sturdy looking plank of wood.");
		}
	}
}
