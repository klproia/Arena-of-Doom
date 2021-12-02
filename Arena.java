import java.util.Scanner;

/*
 * CMSY-166 Java - Lab3: The Arena of Doom 
 *  CMSY-166 Java - Lab6: Lab Object Orientation 
 * Copyright 2021 Howard Community College 
 * Katie Proia 
 * version 1.1
 */

public class Arena {

	// @tutor in this case, having one single static Scanner for choices may be the best way to go because we will have to deal with less garbage collection and debugging issues.
	// System.in is also closed when you close a Scanner and that may be causing some exceptions when opening again (unsure why).
	static Scanner choice = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Copyright 2021 Howard Community College");
		Scanner input = new Scanner(System.in);


		// create constants such as final variables for
		// Goblin damage, Ogre damage, Giant damage, Dragon damage and Gladiator's
		// Silver
		final int GOBLIN_DAMAGE = 2;
		final int OGRE_DAMAGE = 4;
		final int GIANT_DAMAGE = 6;
		final int DRAGON_DAMAGE = 10;
		final double GLADIATORS_SILVER = 10;

		// call the gladiator, monsters goblin and ogre classes
		/*
		@tutor
		 some classes should be concrete classes! So they should not be abstract. And make sure to override certain methods
		 when needed. Also do not create instances of classes inside objects unless really needed. And they should be
		 declared as an instance variable (usually).
		 */
		Gladiator gamer = new Gladiator();
		Monster aGoblin = new Goblin();
		Monster aOgre = new Ogre(); 

		// extra declaration of variables
		int mainChoice = 0;
		final int GOBLIN = 1;
		final int OGRE = 2;
		final int GIANT = 3;
		final int DRAGON = 4;
		int damage = 0; 
		int currentHealth;

		// prompting user to input name
		System.out.print("What is your name, gladiator? " + "\n");
		gamer.setGladiatorName(input.nextLine());
		System.out.printf("Welcome to the Arena of Doom, " + gamer.getGladiatorName() + "\n");

		// Initialize gladiators information
		System.out.printf("%s, the Gladiators: hit points: %d, silver: %.3f , weapon: , Armor: ,", gamer.getGladiatorName(), gamer.getcurrentHealth(), gamer.getTreasureCarried(), gamer.getWeapon(), gamer.getArmor());
		
		//System.out.printf(gamer.getGladiatorName() + " the Gladiator's \nHit points: " + gamer.getcurrentHealth() + "\nSilver: " +
				//gamer.getTreasureCarried() + "\nWeapon: " + gamer.getWeapon() + "\nArmor: " + gamer.getArmor());
		
		// main game loop
		// create constants to describe the users choices in the main action menu
		// Enter_arena, rest, shop, status and quit
		final int ENTER_ARENA1 = 1;
		final int REST2 = 2;
		final int SHOP3 = 3;
		final int STATUS4 = 4;
		final int QUIT5 = 5;

		do {
			// call the main menu method
			mainChoice = getValidMenuChoice();
			switch (mainChoice) {
			case ENTER_ARENA1: {
				// call the monster method
				int monsterChoice = 0;
					monsterChoice = getValidMonsterChoice();
				switch (monsterChoice) {
				case GOBLIN:
					damage = damage + GOBLIN_DAMAGE;
					//gladiator gains an amount of silver equal to the Goblin's treasure carried
					aGoblin.treasureCarried = aGoblin.treasureCarried + GLADIATORS_SILVER;   
					System.out.println(gamer.getGladiatorName() + " the Gladiator defeats the Goblin\n You gained: %.3f" + gamer.getTreasureCarried());
					break;
				case OGRE:
					damage = damage + OGRE_DAMAGE;
					//TODO: update this hard-coded value 
					aOgre.treasureCarried = aOgre.treasureCarried + GLADIATORS_SILVER; 
					System.out.println(gamer.getGladiatorName() + " the Gladiator defeats the Ogre\n You gained: %.3f" + gamer.getTreasureCarried());
					break;
				case GIANT:
					damage = damage + GIANT_DAMAGE;
					//TODO: update this hard-coded value 
					aGoblin.treasureCarried = aGoblin.treasureCarried + GLADIATORS_SILVER;
					System.out.println(gamer.getGladiatorName() + " the Gladiator defeats the Giant\n");
					break;
				case DRAGON:
					damage = damage + DRAGON_DAMAGE;
					//TODO: update this hard-coded value 
					aGoblin.treasureCarried = aGoblin.treasureCarried + GLADIATORS_SILVER;
					System.out.println(gamer.getGladiatorName() + " the Gladiator defeats the Dragon");
					break;
				default:
					System.out.println("There is no such choice.");
					break;
				} // end of opponent switch
				break;
			}
			case REST2:
				currentHealth = gamer.getcurrentHealth() + 2;
				// System.out.println(LIFE_TOTAL);
				System.out.printf(gamer.getGladiatorName() + " the Gladiator rests, gaining 2 hit points.");
				break;
			case SHOP3:
				System.out.println("This has not been implemented yet");
				break;
			case STATUS4:
				//System.out.printf("%s, the Gladiators: hit points: %d, silver: %.3f , weapon: , armor: ,", gamer.getGladiatorName(), gamer.getcurrentHealth(), gamer.getTreasureCarried(), gamer.getWeapon(), gamer.getArmor());
				System.out.printf(gamer.getGladiatorName() + " the Gladiator's \nHit points: " + gamer.getcurrentHealth() + "\nSilver: " + gamer.getTreasureCarried() + "\nWeapon: " + gamer.getWeapon() + "\nArmor: " + gamer.getArmor()+ "\n");
				break;
			case QUIT5:
				System.out.printf(gamer.getGladiatorName() + "the Gladiator has left the building.");
				System.out.printf(" Goodbye " + gamer.getGladiatorName() + "." + " Thank you for playing.");
				continue;
			default:
				System.out.println("Error - Can not read");
				break;

			} // end of switch
		} while (mainChoice != QUIT5); // end of do..while loop
		input.close();
		choice.close();

	}// end of main

	public static int getValidMenuChoice() {
		int ENTER_ARENA = 1;
		int REST = 2;
		int SHOP = 3;
		int STATUS = 4;
		int QUIT = 5;

		int menuChoice = 0;
		System.out.println("\nChoose an option");
		System.out.printf("%d - Enter the Arena\n", ENTER_ARENA);
		System.out.printf("%d - Rest at the Healer's Tent\n", REST);
		System.out.printf("%d - Buy Equipment at the Bazaar\n", SHOP);
		System.out.printf("%d - Display Status\n", STATUS);
		System.out.printf("%d - Quit the Game\n", QUIT);
		System.out.print("What would you like to do? \n");
		menuChoice = choice.nextInt();

		return menuChoice;
	} // end of menu choice class

	public static int getValidMonsterChoice() {
		int GOBLIN = 1;
		int OGRE = 2;
		int GIANT = 3;
		int DRAGON = 4;

		/*
		HOW IT WAS
			Scanner opponent = new Scanner(System.in);
		int opponentOption = 0;
		System.out.println("\nChoose an Opponent: 1 - Goblin; 2 - Ogre; 3 - Giant; 4 - Dragon; ");
		//opponentOption = opponent.nextInt();
		if (opponentOption == GOBLIN) {
			System.out.println("You choose opponent 1 - Goblin");
		} else if (opponentOption == OGRE) {
			System.out.println("You choose opponent 2 - Ogre");
		} else if (opponentOption == GIANT) {
			System.out.println("You choose opponent 3 - Giant");
		} else if (opponentOption == DRAGON) {
			System.out.println("You choose opponent 4 - Dragon");
		} else {
			System.out.println("What opponent is this?");
			//getValidMonsterChoice();
		}
		opponentOption = opponent.nextInt();
		opponent.close();
		return opponentOption;

		 */

		int opponentOption = 0;
		System.out.println("\nChoose an Opponent: 1 - Goblin; 2 - Ogre; 3 - Giant; 4 - Dragon; ");
		opponentOption = choice.nextInt();
		//opponentOption = opponent.nextInt();
		if (opponentOption == GOBLIN) {
			System.out.println("You choose opponent 1 - Goblin");
		} else if (opponentOption == OGRE) {
			System.out.println("You choose opponent 2 - Ogre");
		} else if (opponentOption == GIANT) {
			System.out.println("You choose opponent 3 - Giant");
		} else if (opponentOption == DRAGON) {
			System.out.println("You choose opponent 4 - Dragon");
		} else {
			System.out.println("What opponent is this?");
			//getValidMonsterChoice();
		}
		return opponentOption;

	}// end of getValidMonsterChoice

}// end of class
