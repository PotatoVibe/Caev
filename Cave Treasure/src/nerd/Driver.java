package nerd;

import java.util.*;

class Driver {

	public static void main(String[] args) throws InterruptedException {
		int trys = 0;	 
		Bag baggy = new Bag();
		Scanner scan = new Scanner(System.in);
		String print = "Yes";
		int op = 0;
		Cave.go();
		String name = scan.next();
		Cave.lore(name);
		boolean alive = true;
		while(alive) {
			
			while(alive) {
				trys++;

				Cave.slowText("You see a small, vertical opening on the cliff side. You see there's a 25' drop on an uneven surface.\n"
						+ "Would you like to [use numbers]:");
				Cave.options(0);
				op = scan.nextInt();
				while(alive) {
					if(op==1) {
						baggy.invo();
						Cave.options(0);
					}
					else if(op==2) {
						baggy.invo();
						Cave.slowText("What item do you want to use [use numbers]");
						op = scan.nextInt();
						if(baggy.get(op).equals("Rope")) {
							baggy.consume(op);
							Cave.slowText("You got down slowly and safley. You see now it would've been really dumb to jump.");

							Cave.slowText("You use your lighter to ignite your torch. Its embers burst into life, radienting on the cave walls. "
									+ "\nYou can see a few features of the cave. There is a revine with a wooden plank stretching across the dark pi-...");
							Thread.sleep(3000);
							Cave.slowText("You hear a faint hissing sound; there are snakes in the revine. Copperheads to be exact!");
							Thread.sleep(1000);
							Cave.options(1);

							while(alive) {
								op = scan.nextInt();
								if(op==1) {
									baggy.invo();
									Cave.options(1);
								}
								else if(op==2) {
									baggy.invo();
									Cave.slowText("What item do you want to use [use numbers]");
									op = scan.nextInt();
									
									if(baggy.get(op).equals("Galaxy Note 7")) {
										baggy.consume(op);
										Cave.slowText("You turn on your Galaxy Note 7 as its sands of time are running low. You throw the phone into the pit the battery "
												+ "\nexpands, the screen fragments, and sends a flury of flames into the pit below."
												+ "\nSince the snakes are not a probem anymore you just walk to the door.");
									}
									else if(baggy.get(op).equals("Pair of Jordans")) {
										baggy.consume(op);
										Cave.slowText("You put on your stylish Air Jordans before you cross the beam. Midway through you loose balance and fall into the pit."
												+ "\nThe snakes circle you but they don't attack, they just look at you. Finally one approaches you:"
												+ "\n"+name+", in this world you either drip or drown; Brotha, you are FLOATING!"
												+ "\nThe snakes split like the red sea and let you pass to the other side.");
									}
									else if(baggy.get(op).equals("Molitov")) {
										baggy.consume(op);
										Cave.slowText("You throw the molitov into the pit and you see the flames burst to life... That was a little harsh. "
												+ "\nBut you make it safely to the other side");
									}
									else {
										Cave.slowText("You throw a "+baggy.get(op)+" into the pit... it had no effect...");
										baggy.consume(op);
										Cave.options(1);
									}
								}
								else if(op==3) {
									Cave.slowText("You pet one of the danger noodles as another one bits you! \"We are the Cult of the 4th Street and we thank thee "
											+ "\nas tribute to our rituals... Mazel tov!\"");
									alive=false;
									
								}
								else if(op==4) {
									Cave.slowText("You take two steps on the plank and it breaks beneath you! Your dad-bod was to much");
									alive=false;
									break;
								}
								else {
									Cave.slowText("You feel a sharp pain in your adombinmine... its appendicitis and your appendicitis exploded! Thats unforanet [Invalid Input]");
									alive=false;
									break;
								}
								while(alive) {
									Cave.slowText("You see a golden door filled with treasures you have never seen before! "
											+ "\nThe Holy Grail, many gold rings and jewels, and riches that would make you rich forever!"
											+ "\nBut at the bottom there is a little flashdrive with a logic bomb inside it!"
											+ "\nDo you want to try it? [Yes/No]");
									print = scan.next();
									if(print.equals("Yes")) {
										for(int i = 0; i<8;i++) {
										Cave.logicBomb("The Perecman Firm is a New York-based law firm. It was founded in 1983 by David \\nPerecman.[1] The firm is best known for its work on injury-related cases, such as \\nconstruction and vehicle accidents, personal injury, and medical malpractice. The firm has \\nreceived local and national recognition from organizations including New York Magazine, \\nthe Multi-Million Dollar Advocates Forum®, The Best Lawyers in America®, Super \\nLawyers®, and more.\\n\r\n"
												+ "In addition to the work the firm does in the courtroom, the Perecman Firm attorneys also \\nsupport the local community through the Children’s Smile Foundation, the Avonte Oquendo\\n Memorial Scholarship for Autism, Operation Santa, and more.[citation needed]\\n\r\n"
												+ "Notable cases[edit]\\n\r\n"
												+ "As of 2014, The Perecman Firm represents multiple families in cases involving special-needs\\n students.\\n\r\n"
												+ "The Perecman Firm represents the family of Avonte Oquendo, a teenage boy with autism that \\nwent missing from Center Boulevard School.[1][2][3] The firm represents the family of \\nDyasha Smith, a student that choked to death at the School for International Studies.[4][5] \\nThe Perecman Firm also represents the family of Nashaly Perez Rodriguez for her \\ndisappearance from school.[6][7][8]\\n\r\n"
												+ "In January 2015, The Perecman Firm announced the Avonte Oquendo Memorial Scholarship \\nto support a graduating high school or college student living with autism.[9]\\n\r\n"
												+ "Attorney David Perecman represented a construction worker who was working on a \\nconstruction site in the Bronx in 2006 when a steel reinforcement bar snapped, causing him \\nto fall more than two stories and severely injure his legs. Mr. Perecman secured a $9 \\nmillion+ settlement for his client.[10]\\n\r\n"
												+ "The Perecman Firm represented the family of an infant who suffered serious brain damage in \\n1993. Doctors and medical staff took too long to perform a Caesarean delivery after it was \\ndiscovered that the infant was suffering from fetal distress, and a CT scan revealed that the \\nchild had suffered cerebral and subdural hemorrhages. Attorneys secured a $40 million \\nsettlement for the family.[11]\\n\r\n"
												+ "Attorney David Perecman represented a sheet metal worker who was seriously injured after \\nthe ladder he was standing on was kicked out from underneath him. After the company \\nrefused to settle the case for $10 million, the jury awarded the injured worker $15.2 million.\\n\r\n"
												+ "The Perecman Firm Represented an asbestos-abatement specialist who was seriously injured \\nafter falling off a suspended scaffold. He was neither provided with a safe method of \\ndescending to the ground nor the safety equipment necessary to make that descent, \\nrequirements of Labor Law 240(1). The jury awarded the injured worker with an $11,899,468 \\nverdict.[12]\\n\r\n"
												+ "Recognition[edit]\\n\r\n"
												+ "In 2011, New York Magazine named The Perecman Firm on its list of Top New York area \\nattorneys. The firm was ranked as one of the \\\"Best Law Firms\\\" by the 2016 U.S. News & \\nWorld Report.[13] The Perecman Firm was recognized on the New York Law Journal's \\\"Top \\nSettlements New York 2014\\\" with the second largest settlement in the state.[14]\\n\r\n"
												+ "References[edit]\\n\r\n"
												+ "^ Robert Kolker (30 March 2014). \\\"The Boy Who Ran: The Life and Death of Avonte \\nOquendo\\\". New York Magazine. Retrieved 5 May 2015.\r\n"
												+ "^ Ly, Laura (11 October 2013). \\\"Reward up to $70,000 for missing teen with autism; \\nlawsuit initiated\\\". CNN. Retrieved 5 May 2015.\r\n"
												+ "^ Baker, Al (15 October 2013). \\\"As Search Goes On for Queens Boy With Autism, Adults at His School Face Questions\\\". The New York Times. Retrieved 5 May 2015.\\n\r\n"
												+ "^ Otis, Ginger Adams (31 October 2014). \\\"Family of special-needs student who choked to death in Brooklyn school plans to sue city: lawyer\\\". New York Daily News. Retrieved 5 May 2015.\r\n"
												+ "\\n^ Tcholakian, Danielle (30 October 2014). \\\"Family of Autistic Student Who Died in School Hires Avonte Oquendo Lawyer\\\". DNAinfo. Archived from the original on 3 May 2015. Retrieved 5 May 2015.\r\n"
												+ "\\n^ Johnson, Nicole (18 September 2014). \\\"Attorney for Avonte and Nashaly Perez speaks about new NYC security measures in schools\\\". PIX11. Retrieved 5 May 2015.\r\n"
												+ "\\n^ Taylor, Kate (17 September 2014). \\\"Girl, 15, Disappears From a Special-Needs School\\\". The New York Times. Retrieved 5 May 2015.\r\n"
												+ "\\n^ Kleiman, Gillian; Short, Aaron (19 February 2015). \\\"Lawyer blasts investigation into missing special-needs student\\\". New York Post. Retrieved 5 May 2015.\r\n"
												+ "\\n^ \\\"The Perecman Firm Announces Scholarship for Students with Autism or Affected By Autism\\\". SteamFeed. 27 January 2015. Retrieved 5 May 2015.\r\n"
												+ "\\n^ \\\"Workers' Case For Over $9 Million\\\". The Perecman Firm, P.L.L.C. Retrieved 2018-03-09.\r\n"
												+ "\\n^ \\\"Newborn Infant Suffered Brain Damage in Birth Injury | Case Results\\\". The Perecman Firm, P.L.L.C. Retrieved 2018-03-09.\r\n"
												+ "\\n^ \\\"Union Laborer Suffered Career-Ending Back Injury | Case Results\\\". The Perecman Firm, P.L.L.C. Retrieved 2018-03-09.\r\n"
												+ "\\n^ \\\"Best Law Firms\\\". U.S. News & World Report. Retrieved 5 May 2015.\r\n"
												+ "\\n^ \\\"Top 25 New York Settlements in 2014\\\". New York Law Journal. Retrieved 5 May 2015.\r\n"
												+ "");
										}
									}
									else {
										Cave.slowText("Yeah, you could always use it later (Like on a school computer or smth)");
									} alive=false;
								}
							}
							

							//__________________________________________________________________________________________________________
						}
						else {
							Cave.slowText("That probably won't work");
							Cave.options(0);
						}
					} 
					else if(op==3){
						Cave.slowText("You jump down into the cave... and break every bone in your body from the neck down... What did you expect?");
						alive = false;
						break;
					}
					else {
						Cave.slowText("You were struck by lightining [Invalid Input]");
						alive = false;
						break;
					}
					op = scan.nextInt();
				}
			}
			Thread.sleep(1000);
			Cave.slowText("Do you wish to continue...[Yes/No]");
			if(print.equals("Yes")||print.equals("yes")) {
				alive=true;
			}
		}


		scan.close();
		Cave.slowText("You attemped the dungeon "+trys+" times!");
	}

}
