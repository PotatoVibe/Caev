package nerd;
import java.util.*;
public class Bag {
	private ArrayList<String> item= new ArrayList<String>();
	public Bag() {
		item.add("Lighter");
		item.add("Molitov");
		item.add("Torch");
		item.add("Rag");
		item.add("Knife");
		item.add("Bouncy Ball");
		item.add("Small Rock");
		item.add("Galaxy Note 7");
		item.add("Pair of Jordans");
		item.add("Rope");
	}

	public void invo() throws InterruptedException {
		int index = 1;
		for(String tango: item) {
			Cave.slowText(index+") "+tango);
			index++;
			Thread.sleep(200);
		}
		Cave.logicBomb("__________________________________________________________________________________________");
	}

	public void scav(String balls) {
		item.add(balls);
		System.out.println("You have collected a "+balls+"!");
	}

	public void consume(int index) {
		System.out.println("You remove a "+item.get(index-1)+" from your bag!");
		item.remove(index-1);
	}

	public String get(int i) {
		return item.get(i-1);
	}

}
