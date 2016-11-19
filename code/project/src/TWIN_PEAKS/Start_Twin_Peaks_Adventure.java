package TWIN_PEAKS;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*******************************************************
 * Project 10: Twin Peaks Mystery/Adventure Game       *
 * By: Aaron O'Brien                                   *
 * CSC 2322: Programming and Data Structures 2         *
 *******************************************************/

public class Start_Twin_Peaks_Adventure{
	private static Satchel bag = new Satchel();
	private static Items item = new Items();
	private static Actors character = new Actors();
	private static Posse pos = new Posse();
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		String userName = ("Aaron");
		
		System.out.println("'Welcome to Twin Peaks, Washington... Where it's always doom and gloom!' said the woman. ");
		System.out.println("You're in the Double R Diner, conversing with an employee.");
		System.out.println("She then says. 'The town is in mourning, a young high school girl named Laura Palmer was brutally murdered.' she says softly. 'Here's a picture of her.'");
		BufferedImage image997 = null;
		try{
			image997 = ImageIO.read(new File("C:\\Users\\socce\\Desktop\\resume\\code\\twin peaks adventure game (java)\\code\\project 10\\laura palmer.jpg"));}
		catch (IOException e){
			e.printStackTrace();}

		JLabel picLabel262 = new JLabel(new ImageIcon(image997));
		JOptionPane.showMessageDialog(null, picLabel262, "Laura Palmer", JOptionPane.PLAIN_MESSAGE, null);
		
		System.out.println("\nPress 1 to leave the Diner and head north.");
		System.out.println("Press 2 to leave the Diner and head south.");
		System.out.println("Press 3 to leave the Diner and head east.");
		System.out.println("Press 4 to leave the Diner and head west.");
		System.out.println("Press 5 to see map of Twin Peaks, Washington.");
		System.out.println("Press 6 to see a picture of the Double R Diner, the Owner, Employees & a Black Cup of Joe.");
		System.out.println("Press 7 to see what is in your satchel and who is in your posse. ");
		System.out.println("Press 8 to use your clues and posse to speculate who the murderer of Laura Palmer was.\n");
		
		int userInput = scan.nextInt();
		switch(userInput){
			
			case 1: 
				Locations_2 one = new Locations_2();
				Scanner scan3 = new Scanner(System.in);
				System.out.println("You've selected to go north.");
				System.out.println("\nWelcome to Big Ed's Gas Farm.");
				System.out.println("\nPress 1 for short description and 2 for a long description.");
				int userInput2 = scan3.nextInt();
				
				if(userInput2 == 1){
					one.bigEdsShort(null, null, null);}
				else
					one.bigEdsLong(null, null, null);
				
				System.out.println("\nPress 1 to leave Big Ed's Gas Farm and head north.");
				System.out.println("Press 2 to leave Big Ed's Gas Farm and head south.");
				System.out.println("Press 3 to leave Big Ed's Gas Farm and head east.");
				System.out.println("Press 4 to leave Big Ed's Gas Farm and head west.");
				System.out.println("Press 5 to see map of Twin Peaks, Washington.");
				System.out.println("Press 6 to see a picture of the Big Ed's Gas Farm, Big Ed himself & the hidden item. Then, return to the Double R Diner. ");
				System.out.println("Press 7 to wander the forest. \n");
				
				int userInput4 = scan2.nextInt();
				switch(userInput4){
					
					case 1: 
						Locations_1 three = new Locations_1();
						Scanner scan6 = new Scanner(System.in);
						Scanner scan66 = new Scanner(System.in);
						System.out.println("\nYou've selected to go north.");
						System.out.println("\nPress 1 for short description and 2 for a long description.");
						int userInput3 = scan6.nextInt();
						
						if(userInput3 == 1){
							three.greatNorthernShort(null, null, null);}
						else
							three.greatNorthernLong(null, null, null);
						
						BufferedImage image99 = null;
						BufferedImage image98 = null;
						try{
							image99 = ImageIO.read(new File("great northern.gif"));
							image98 = ImageIO.read(new File("benjamin horne.PNG"));}
						catch (IOException e){
							e.printStackTrace();}

						JLabel picLabel44 = new JLabel(new ImageIcon(image99));
						JOptionPane.showMessageDialog(null, picLabel44, "The Great Northern Hotel", JOptionPane.PLAIN_MESSAGE, null);
						JLabel picLabel22 = new JLabel(new ImageIcon(image98));
						JOptionPane.showMessageDialog(null, picLabel22, "Owner: Benjamin Horne", JOptionPane.PLAIN_MESSAGE, null);
						
						System.out.println("\nPress 1 to go back to the Double R Diner & 2 to leave Twin Peaks for good...");
						int userInput66 = scan66.nextInt();
						
						if(userInput66 == 1){
							main(null);}
						else
							System.exit(0);
						break;
					
					case 2: 
						System.out.println("\nYou've selected to go south. Back to the Double R Diner!");
						main(null);
						break;
					
					case 3: 
						Locations_2 two = new Locations_2();
						Scanner scan5 = new Scanner(System.in);
						Scanner scan75 = new Scanner(System.in);
						System.out.println("\nYou've selected to go east.");
						System.out.println("\nPress 1 for short description and 2 for a long description.");
						
						int userInput7 = scan5.nextInt();
						
						if(userInput7  == 1){
							two.coopersDreamShort(null, null, null);}
						else
							two.coopersDreamLong(null, null, null);
						
						BufferedImage image2 = null;
						BufferedImage image4 = null;
						try{
							image2 = ImageIO.read(new File("dale cooper.jpg"));
							image4 = ImageIO.read(new File("black lodge entrance.png"));}
						catch (IOException e){
							e.printStackTrace();}

						JLabel picLabel4 = new JLabel(new ImageIcon(image2));
						JOptionPane.showMessageDialog(null, picLabel4, "Special FBI Agent Dale Cooper", JOptionPane.PLAIN_MESSAGE, null);
						JLabel picLabel2 = new JLabel(new ImageIcon(image4));
						JOptionPane.showMessageDialog(null, picLabel2, "The Black Lodge Entrance.", JOptionPane.PLAIN_MESSAGE, null);
						System.out.println("\nPress 1 to add Agent Dale Cooper to your Posse. Or 2 to leave him be & return to the Double R Diner.");
						
						int userInput93441 = scan75.nextInt();
						
						if(userInput93441  == 1){
							pos.addMember(character.actor3);
							main(null);}
						else
							System.out.println("\nLeft be.");
							main(null);
						
						break;
					
					case 4: 
						Scanner scan549 = new Scanner(System.in);
						System.out.println("\nYou've selected to go west.");
						BufferedImage image1112 = null;
						BufferedImage image1114 = null;
						try{
							image1114 = ImageIO.read(new File("saw mill.jpg"));
							image1112 = ImageIO.read(new File("pete martell.jpeg"));}
						catch (IOException e){
							e.printStackTrace();}

						JLabel picLabel1114 = new JLabel(new ImageIcon(image1114));
						JOptionPane.showMessageDialog(null, picLabel1114, "Twin Peaks Saw Mill", JOptionPane.PLAIN_MESSAGE, null);
						JLabel picLabel1112 = new JLabel(new ImageIcon(image1112));
						JOptionPane.showMessageDialog(null, picLabel1112, "Pete Martell", JOptionPane.PLAIN_MESSAGE, null);
						System.out.println("\nPress 1 to add Pete to your Posse. Or 2 to leave him be & return to the Double R Diner.");
						
						int userInput9441 = scan549.nextInt();
						
						if(userInput9441  == 1){
							pos.addMember(character.actor7);
							main(null);}
						else
							System.out.println("\nLeft be.");
							main(null);
						
						break;
					
					case 5:
						BufferedImage image12 = null;
						BufferedImage image14 = null;
						try{
							image12 = ImageIO.read(new File("twinpeaksmap.jpg"));
							image14 = ImageIO.read(new File("entrance.jpg"));}
						catch (IOException e){
							e.printStackTrace();}

						JLabel picLabel14 = new JLabel(new ImageIcon(image14));
						JOptionPane.showMessageDialog(null, picLabel14, "Twin Peaks, Washington", JOptionPane.PLAIN_MESSAGE, null);
						JLabel picLabel12 = new JLabel(new ImageIcon(image12));
						JOptionPane.showMessageDialog(null, picLabel12, "Twin Peaks, Washington", JOptionPane.PLAIN_MESSAGE, null);
						main(null);
						break;
					
					case 6:
						character.identifyActor9();
						Scanner scan59 = new Scanner(System.in);
						Scanner scan599 = new Scanner(System.in);
						BufferedImage image = null;
						BufferedImage image3 = null;
						BufferedImage image67 = null;
						try{
							image = ImageIO.read(new File("bigEds.jpg"));
							image3 = ImageIO.read(new File("ed hurley.jpg"));
							image67 = ImageIO.read(new File("eyepatch.png"));
							image.getHeight();
							image.getWidth();}
						catch (IOException e){
							e.printStackTrace();}
						JLabel picLabel = new JLabel(new ImageIcon(image));
						JLabel picLabel3 = new JLabel(new ImageIcon(image3));
						JLabel picLabel33 = new JLabel(new ImageIcon(image67));
						JOptionPane.showMessageDialog(null, picLabel, "Big Ed's Gas Farm", JOptionPane.PLAIN_MESSAGE, null);
						JOptionPane.showMessageDialog(null, picLabel3, "Ed Hurley", JOptionPane.PLAIN_MESSAGE, null);
						JOptionPane.showMessageDialog(null, picLabel33, "Eye Patch", JOptionPane.PLAIN_MESSAGE, null);
						
						System.out.println("\nPress 1 to keep the eye patch in your satchel or 2 to leave it be.");
						
						int userInput94 = scan59.nextInt();
						
						if(userInput94  == 1){
							bag.addItem(item.item4);
							}
						else
							System.out.println("\nLeft be.");
						
						System.out.println("\nPress 1 to add Ed to your Posse. Or 2 to leave him be & return to the Double R Diner.");
						
						int userInput944 = scan599.nextInt();
						
						if(userInput944  == 1){
							pos.addMember(character.actor9);
							main(null);}
						else
							System.out.println("\nLeft be.");
							main(null);
						
						break;
						
					case 7:
						Scanner scan5999 = new Scanner(System.in);
						Scanner scan6000 = new Scanner(System.in);
						Scanner scan6001 = new Scanner(System.in);
						Scanner scan6002 = new Scanner(System.in);
						character.identifyActor6();
						System.out.println("\nYou have fallen into a cave.");
						BufferedImage image1322 = null;
						try{
							image1322 = ImageIO.read(new File("owl cave.jpg"));}
						catch (IOException e){
							e.printStackTrace();}

						JLabel picLabel15 = new JLabel(new ImageIcon(image1322));
						JOptionPane.showMessageDialog(null, picLabel15, "Owl Cave", JOptionPane.PLAIN_MESSAGE, null);
						
						System.out.println("\nNothing here... it seems. Uh oh, you've found... a man with a missing arm...?");
						BufferedImage image122 = null;
						try{
							image122 = ImageIO.read(new File("mike.gif"));}
						catch (IOException e){
							e.printStackTrace();}

						JLabel picLabel125 = new JLabel(new ImageIcon(image122));
						JOptionPane.showMessageDialog(null, picLabel125, "MIKE, THE ONE-ARMED MAN", JOptionPane.PLAIN_MESSAGE, null);
						
						System.out.println("\nPress 1 to try and add MIKE to your Posse. Or 2 to run back to the Double R Diner.");
						
						int userInput9494 = scan5999.nextInt();
						
						if(userInput9494  == 1){
							System.out.println("\nHe cannot be reasoned with, he then whips out his knife and attacks you...");
							
							System.out.println("\nPress 1 to look for an item in your satchel. Or 2 to accept death.");
							
							int userInput94949 = scan6000.nextInt();
							if(userInput94949  == 1){
								System.out.println(bag.inventory());
								if(bag.inventory().isEmpty()){
									System.out.println("\nNo items in your inventory! You've gone insane and are going to die a slow and painful death while MIKE takes over Twin Peaks.");
									System.exit(0);}}
								else
									System.out.println("\nYou've defeated MIKE with your item!");
									System.out.println("\nCongratulations, you overcame the supernatural horror of Twin Peaks. In other words, you've won the game!");
									BufferedImage image16322 = null;
									try{
										image16322 = ImageIO.read(new File("winning.png"));}
									catch (IOException e){
										e.printStackTrace();}

									JLabel picLabel615 = new JLabel(new ImageIcon(image16322));
									JOptionPane.showMessageDialog(null, picLabel615, "WINNER!", JOptionPane.PLAIN_MESSAGE, null);
									System.exit(0);}
						else
							System.out.println("\nYou smoked him. You're safe, for now...");
							
							System.out.println("\nThere's something that caught your eye as you're running out...Press 1 to stuff it in your satchel or 2 to continue.");
						
							int userInput3464 = scan6001.nextInt();
						
							if(userInput3464  == 1){
								bag.addItem(item.item5);
								System.out.println("\nCurious on what it is? Press 1 to look at the item. 2 to keep on.");
								int userInput111 = scan6002.nextInt();
								
								if(userInput111  == 1){
									BufferedImage image6741 = null;
									try{
										image6741 = ImageIO.read(new File("armpatch.jpg"));}
									catch (IOException e){
										e.printStackTrace();}

									JLabel picLabel164 = new JLabel(new ImageIcon(image6741));
									JOptionPane.showMessageDialog(null, picLabel164, "On the Back of the Patch States: The Bookhouse Boys", JOptionPane.PLAIN_MESSAGE, null);
									main(null);}
								else
									System.out.println("\nOnwards!");
									main(null);}
							else
								System.out.println("\nOnwards!");
								main(null);
							
						
						
					default: 
						System.out.println("\nUnknown selection... Try again.\n");
						main(null);}
					
					
			case 2: 
				Scanner scan65 = new Scanner(System.in);
				System.out.println("You've selected to go south.");
				System.out.println("\nYou're now at the entrance of Twin Peaks.");
				BufferedImage image2 = null;
				try{
					image2 = ImageIO.read(new File("entrance.jpg"));}
				catch (IOException e){
					e.printStackTrace();}

				JLabel picLabel4 = new JLabel(new ImageIcon(image2));
				JOptionPane.showMessageDialog(null, picLabel4, "Welcome to Twin Peaks, Washington.", JOptionPane.PLAIN_MESSAGE, null);
				System.out.println("\nTurn around..press 1, leave Twin Peaks for good? Press 2.");
				int userInput644 = scan65.nextInt();
				
				if(userInput644  == 1){
					main(null);}
				else
					System.out.println("\nSo long.");
					System.exit(0);
				break;
			
			case 3: 
				System.out.println("You've selected to go east.");
				Locations_2 two = new Locations_2();
				
				Scanner scan9 = new Scanner(System.in);
				Scanner scan55 = new Scanner(System.in);
				Scanner scan955 = new Scanner(System.in);
				
				System.out.println("\nPress 1 for short description and 2 for a long description.");
				int userInput9 = scan9.nextInt();
				
				if(userInput9  == 1){
					two.sheriffsDeptShort(null, null, null);}
				else
					two.sheriffsDeptLong(null, null, null);
				
				Scanner scan10 = new Scanner(System.in);
				
				System.out.println("\nPress 1 for a picture of the location, the Sheriff and the pistol item...then returning to the Double R Diner, or 2, to return to the Double R Diner");
				int userInput10 = scan10.nextInt();
				
				if(userInput10  == 1){
					BufferedImage image12 = null;
					BufferedImage image4 = null;
					BufferedImage image6 = null;
					try{
						image12 = ImageIO.read(new File("sheriffs dept.jpg"));
						image4 = ImageIO.read(new File("harry s truman.jpg"));
						image6 = ImageIO.read(new File("pistol.jpg"));}
					catch (IOException e){
						e.printStackTrace();}

					JLabel picLabel14 = new JLabel(new ImageIcon(image12));
					JOptionPane.showMessageDialog(null, picLabel14, "Twin Peaks Sheriff's Department", JOptionPane.PLAIN_MESSAGE, null);
					JLabel picLabel2 = new JLabel(new ImageIcon(image4));
					JOptionPane.showMessageDialog(null, picLabel2, "Sheriff Harry S. Truman", JOptionPane.PLAIN_MESSAGE, null);
					JLabel picLabel6 = new JLabel(new ImageIcon(image6));
					JOptionPane.showMessageDialog(null, picLabel6, "Pistol", JOptionPane.PLAIN_MESSAGE, null);
					
					System.out.println("\nPress 1 to keep the pistol in your satchel or 2 to leave it be.");
					
					int userInput99 = scan55.nextInt();
					
					if(userInput99  == 1){
						bag.addItem(item.item1);
						}
					else
						System.out.println("\nLeft be.");
						
					
					System.out.println("\nPress 1 to add Sheriff Harry S. Truman to your Posse. Or 2 to leave him be & return to the Double R Diner.");
					
					int userInput344 = scan955.nextInt();
					
					if(userInput344  == 1){
						pos.addMember(character.actor8);
						main(null);}
					else
						System.out.println("\nLeft be.");
						main(null);}
				else
					main(null);
				
				break;
			
			case 4: 
				Scanner scan435 = new Scanner(System.in);
				Scanner scan436 = new Scanner(System.in);
				System.out.println("You've selected to go west.");
				System.out.println("\nDead end. There's something on the ground...");
				System.out.println("\nPress 1 to look, 2 to return to the Double R Diner.");
				int userInput939 = scan435.nextInt();
				
				if(userInput939  == 1){
					BufferedImage image212 = null;
					try{
						image212 = ImageIO.read(new File("newspaper clipping.jpg"));}
					catch (IOException e){
						e.printStackTrace();}

					JLabel picLabel214 = new JLabel(new ImageIcon(image212));
					JOptionPane.showMessageDialog(null, picLabel214, "Newspaper Clipping", JOptionPane.PLAIN_MESSAGE, null);
					
					System.out.println("\nPress 1 to keep the clipping in your satchel or 2 to leave it be. Both return to the Double R Diner.");
					
					int userInput989 = scan436.nextInt();
					
					if(userInput989  == 1){
						bag.addItem(item.item3);
						main(null);}
					else
						main(null);}
				main(null);
				break;
			
			case 5:
				BufferedImage image112 = null;
				BufferedImage image4 = null;
				try{
					image112 = ImageIO.read(new File("twinpeaksmap.jpg"));
					image4 = ImageIO.read(new File("entrance.jpg"));}
				catch (IOException e){
					e.printStackTrace();}

				JLabel picLabel114 = new JLabel(new ImageIcon(image4));
				JOptionPane.showMessageDialog(null, picLabel114, "Twin Peaks, Washington", JOptionPane.PLAIN_MESSAGE, null);
				JLabel picLabel2 = new JLabel(new ImageIcon(image112));
				JOptionPane.showMessageDialog(null, picLabel2, "Twin Peaks, Washington", JOptionPane.PLAIN_MESSAGE, null);
				main(null);
				break;
			
			case 6:
				Scanner scan56 = new Scanner(System.in);
				BufferedImage image6 = null;
				BufferedImage image7 = null;
				BufferedImage image8 = null;
				BufferedImage image9 = null;
				try{
					image6 = ImageIO.read(new File("doubleRdiner.png"));
					image7 = ImageIO.read(new File("norma jennings.jpg"));
					image8 = ImageIO.read(new File("shelly johnson.jpg"));
					image9 = ImageIO.read(new File("black coffee.jpg"));}
				catch (IOException e){
					e.printStackTrace();}

				JLabel picLabel6 = new JLabel(new ImageIcon(image6));
				JOptionPane.showMessageDialog(null, picLabel6, "Double R Diner", JOptionPane.PLAIN_MESSAGE, null);
				JLabel picLabel7 = new JLabel(new ImageIcon(image7));
				JOptionPane.showMessageDialog(null, picLabel7, "Owner: Norma Jennings", JOptionPane.PLAIN_MESSAGE, null);
				JLabel picLabel8 = new JLabel(new ImageIcon(image8));
				JOptionPane.showMessageDialog(null, picLabel8, "Employee: Shelly Johnson", JOptionPane.PLAIN_MESSAGE, null);
				JLabel picLabel9 = new JLabel(new ImageIcon(image9));
				JOptionPane.showMessageDialog(null, picLabel9, "Cup of Joe: As Black as a Moonless Night.", JOptionPane.PLAIN_MESSAGE, null);
				
				System.out.println("\nPress 1 to put the coffee in your satchel or 2 to leave it at the diner.");
				
				int userInput999 = scan56.nextInt();
				
				if(userInput999  == 1){
					System.out.println("\nYou then run outside to check the weather then slowly walk back in real suave. Norma jokingly says again...");
					bag.addItem(item.item6);
					main(null);}
				else
					main(null);
				break;
				
			case 7:
				System.out.println("You have, " +bag.inventory()+ " in your bag ");
				System.out.println("& are trouting town with, " +pos.thePosse()+ " in your unstoppable, crime-solving posse. Focusing back to the...");
				
				if(bag.inventory().size() >= 4 || pos.thePosse().size() >= 4){
					
					System.out.println("\nYou can now discuss the murder of Laura Palmer.");
			
					System.out.println("\nPress 1 to ask Agent Dale Cooper what he knows.");
					System.out.println("Press 2 to ask Sheriff Harry S. Truman why she might have been murdered. Did she have any enemies?");
					System.out.println("Press 3 to ask Pete Martell if there was any activity at the Saw Mill?");
					System.out.println("Press 4 to ask Ed Hurley if anyone suspicious got gas that night?");
					System.out.println("Press 5 to ask Leland Palmer(Father) where she was the night she died?");
					
					Scanner scan96545 = new Scanner(System.in);
					int userInput88 = scan96545.nextInt();
					switch(userInput88){
						
						case 1:
							System.out.println("\n'Not much ' " + userName + ". Though, I have had these very strange dreams of her...");
							break;
							
						case 2:
							System.out.println("\n'She was loved by everyone ' " + userName + ". But was very attracted to danger. We discovered cocaine in her system the night she was murdered.");
							break;
						
						case 3:
							System.out.println("\n'Nothing out of the ordinary ' " + userName + ". I was making coffee when I heard something,");
							System.out.println("I went outside and saw something glimmer on the shores of the lake near the mill. That's where I found her wrapped in plastic... ");
							break;
							
						case 4:
							System.out.println("\n'There was a lot of activity at the pumps that evening ' " + userName + ". Most heading north to the border (Canada). Maybe she went to One Eyed Jacks?");
							break;
							
						case 5:
							BufferedImage image1722 = null;
							try{
								image1722 = ImageIO.read(new File("leland palmer.jpg"));}
							catch (IOException e){
								e.printStackTrace();}

							JLabel picLabel76215 = new JLabel(new ImageIcon(image1722));

							JOptionPane.showMessageDialog(null, picLabel76215, "Leland Palmer", JOptionPane.PLAIN_MESSAGE, null);
							
							System.out.println("\n'Ohhh god! ' Mr. Palmer cries hysterically. 'My little girl...MURDERED! AHH! She, uh, said she was going out. I figured it was with her boyfriend.'");
							System.out.println("\n'What was the boyfriends name?' you ask. Agent Dale Cooper butts in, 'Bobby Briggs, I've already spoke to him, he's not the killer '" +userName+ ". That, I can assure you.");
							break;
							
						default: 
							System.out.println("\nUnknown selection... Try again.\n");
							main(null);
							break;}

				
					System.out.println("\n'Thank you all. I want to ask the group something now. I was exploring Twin Peaks when I ran into a man trying to murder me. ");		
					System.out.println("\n'This man, had one arm and kept screaming...'KILLER BOB WILL CONSUME YOU!'");
					System.out.println("\n'Thoughts? Anyone know who this man is?' You say with concern. Leland speaks out, 'Yes! He was... was someone I met in my youth. He kept speaking about a man in his visions.' ");
					System.out.println("\n'He always screamed the name 'Bob'. I saw him in my visions recently as well. He looks very similar to this man in the newpaper. Look... '");
					System.out.println("\n'I saw him in the mirror! I looked like him '" + userName + "! I killed my little girl didn't I?!?! AHHH!");
					System.out.println("\n'NO! ' you scream to Leland. 'Don't you see! BOB did!! You've been a puppet under his control!");
				
					BufferedImage image176322 = null;
					try{
						image176322 = ImageIO.read(new File("leland palmer, the discovery.jpg"));}
					catch (IOException e){
						e.printStackTrace();}

					JLabel picLabel7615 = new JLabel(new ImageIcon(image176322));
					JOptionPane.showMessageDialog(null, picLabel7615, "Leland Discovers", JOptionPane.PLAIN_MESSAGE, null);
				
				
					System.out.println("\nGAME OVER.");
					System.exit(0);}
							
				else
					main(null);
					break;
			
			default: 
				System.out.println("\nUnknown selection... Try again.\n");
				main(null);
				break;}}}	