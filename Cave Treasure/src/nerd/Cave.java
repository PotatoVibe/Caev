package nerd;

import java.util.Scanner;

public class Cave {
	public static void go() throws InterruptedException {
		Cave.slowText("Game notes:"
				+ "\n - Invalid inputs results in death or crash"
				+ "\n - Using a wrong item may kill you and/or loose items"
				+ "\n - Don't use spaces for your name; use \"_\"");
		Thread.sleep(3000);
		System.out.println("\n");
		Cave.slowText("Hello, brave adventure!");
		Thread.sleep(2000);
		Cave.slowText("You are about to embark on a dangerous quest! One filled with traps and hazards at every turn!");
		Thread.sleep(2000);
		Cave.slowText("Before you throw you into the dungeon like a lamb to the slaughter,\n"
				+ "we need to know your name!");
		Thread.sleep(2000);
		System.out.println("");
		Cave.slowText("Enter name:");

	}

	public static void lore(String name) throws InterruptedException{
		Cave.slowText(name+"? Ok, we will try to remember that if you make it back.");
		Thread.sleep(1000);
		Cave.slowText("Our team and I will make a rondavue to the cave's enterance and drop you and your gear off.\n"
				+ "From there you are on your own...");
		Thread.sleep(2000);
		Cave.slowText("*Jeep starting*");
		Thread.sleep(1000);
		Cave.slowText("*Jeep driving over rocks*");
		Thread.sleep(1000);
		Cave.slowText("*Jeep stopping on loose gravel*");
		Thread.sleep(1000);
		Cave.slowText("This is your stop. God speed!");
	}
	public static void options(int level) throws InterruptedException{
		if(level==0) {
			Thread.sleep(500);
			Cave.slowText("1) Check bag");
			Thread.sleep(500);
			Cave.slowText("2) Use Item");
			Thread.sleep(1000);
			Cave.slowText("3) Jump!");
		}
		else if(level==1) {
			Thread.sleep(500);
			Cave.slowText("1) Check bag");
			Thread.sleep(500);
			Cave.slowText("2) Use Item");
			Thread.sleep(500);
			Cave.slowText("3) Pet the spicy noodles");
			Thread.sleep(500);
			Cave.slowText("4) Cross the beam");
		}
	}

	public static void slowText(String string) throws InterruptedException{
		System.out.println("");
		for(int odin = 0;odin<string.length();odin++) {
			if(string.substring(odin,odin+1).equals("\\")) {
				System.out.println("");
				odin+=2;

			}
			else{
				System.out.print(string.substring(odin,odin+1));
			}
			Thread.sleep(5);//norm is 40
		}
	}	
	
	
	
	public static void logicBomb(String string) throws InterruptedException{
		System.out.println("");
		for(int odin = 0;odin<string.length();odin++) {
			if(string.substring(odin,odin+1).equals("\\")) {
				System.out.println("");
				odin+=2;

			}
			else{
				System.out.print(string.substring(odin,odin+1));
			}
			Thread.sleep(1);//norm is 40
		}
	}	
}