/**
 * CMSY-166: CE - Making Gladiator (the Easy Way) 
 * CMSY-166: CE - Composition 
 * Copyright 2021 Howard Community College
 * @Katie Proia 
 * @version 1.0
 *
 */
import java.util.Scanner;

public class GladiatorTest {
	public static void main (String [] args) { 
		System.out.println("Copyyright 2021 Howard Community College"); 
		Scanner input = new Scanner(System.in); 
		
		
		//Declare variables
		 Gladiator gladiator;  
		 int hp;
		 //Double treasureCarried = 0.0;
		 
		 gladiator = new Gladiator ();		 
		 gladiator.getCurrentHealth();
		 gladiator.getTreasureCarried();
		 
		 
		 System.out.printf("%s the Gladiator (hp: %d armor: %s, silver: %.1f)", gladiator.getGladiator(), gladiator.getCurrentHealth(), gladiator.getArmor().toString(), gladiator.getTreasureCarried());
		 
		 //Getting information from user 
		 System.out.printf("\nEnter a name: ", gladiator.getGladiator());
		 gladiator.setGladiator(input.nextLine());
		 
		 System.out.printf("\nEnter current health: ", gladiator.getCurrentHealth());
		 gladiator.setCurrentHealth(input.nextInt());

		 /*
		 - incorrect -
		 System.out.printf("Enter armor: ", armor.toString());
		 gladiator.setArmor(input.nextLine());
		 */

		/*
		- correct -

		(check last comment).
		System.out.printf("Enter armor damage: "); int armorDamage = input.nextInt();
		System.out.printf("Enter armor color: "); String armorColor = input.nextLine(); input.nextLine();
		System.out.printf("Enter armor cost: "); Double armorCost = input.nextDouble();

		gladiator.setArmor(armorDamage, armorCost, armorColor);
		*/






		 System.out.printf("Enter treasure: ");
		 gladiator.setTreasureCarried(input.nextDouble()); 
		 
		 
		 System.out.printf("%s the Gladiator (hp: %d, weapon: , armor: %s, treasure carried: %.3f)", gladiator.getGladiator(), gladiator.getCurrentHealth(), gladiator.getArmor().toString(), gladiator.getTreasureCarried());

		 
		
		
		
		
	}//end of main 
} //end of class 


/*
tutor comments:

By creationg an instance of an object inside of this class, when you create another instance in gladiator.java you have to differentiate which one you are accessing when
invoking methods. That can be confusing because you can have multiple objects with the same name if they are in different classes depending on the scope.

- The idea is to use the setters and getters to interact with the object of what you are setting and getting.

For example.

gladiator.setArmor()

setArmor should change the information of the variables of your instance of the Rags object. So inside the setArmor there should be setters.

-
Same applies to gladiator.getArmor()

inside gladiator.getArmor() you should not return a string, but all the information from your instance of the object. (You could return a string
by using the toString method, however it would not be the ideal way to use a getter).
Instead, when printing the information, you could use both methods at the same time. for example: gladiator.getArmor().toString() <- this will return the string method
of the instance of your gladiator (because getArmor returns the variables of the instance).

-
-

You should try to not create many instances of an object if you are not going to use it. Just leave it in one place. The best place would be
the one in which you need to access the most. In this case, gladiator.java.
You should not initialize the object inside of the constructor, because that will make it difficult to access and modify the information later.

->

Try to recreate the setters and getters and all methods that utilize your other objects.


->

modified:

Armor().
 */