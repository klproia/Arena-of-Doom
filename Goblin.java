/**
 * CMSY-166: CE - More Composition 
 * Copyright 2021 Howard Community College
 * @Katie Proia 
 * @version 1.0
 */

public class Goblin extends Monster implements Combatant {
	//Declare instance variables 
	private int annoyanceLevel; 
	private int getAttacked; 
		
	//Create zero-argument constructor for goblin 
	public Goblin() { 
		super();
		annoyanceLevel = 5; 
	}
	
	//Create constructor for class Goblin that accepts with int values: damagedealt, currentHealth, annoyanceLevel 
	public Goblin (int currentHealth, int damageDealt, double treasureCarried, int annoyanceLevel) { 
		super(0, 0, 0.5);
		this.annoyanceLevel = annoyanceLevel;  
	}
	
	
	//Create getters and setters for each instance variable 
		public int getannoyanceLevel() { 
		return annoyanceLevel;
	}
	
	public void setannoyanceLevel(int annyonance) { 
		this.annoyanceLevel = annyonance; 
	} 
	
@Override 
	public String toString() { 
		return String.format("hp: %d, damage: %d, annoyance: %d, treasure: %.3f", super.toString(), annoyanceLevel);
	}


	//Monster goblin = new Monster() {

	@Override
	public void attack(Combatant target, int damage) {
		// TODO Auto-generated method stub
		System.out.println("The Goblin is attacking");
		
	}


	/*
	@tutor
	to get the information of something, we should access the instance of that something.
	For example, we want the current health of the goblin being attacked by the Gladiator, not all goblins or the class Goblin.java.
	For that to work, we need to use a setter or a getter.
	Instead of: currentHealth > 1
	you should: [instance of your monster, in this case, the parameter "monster"].getHealth (or the name of the getter method) > 1
	-
	Same applies to any value of monster you want to change.
	instead of currentHealth = something;
	you want to:
	monster.setHealth(something); (with the correct name of the method).


	!!
	same error that happened here is happening at Ogre.java (getAttacked method)
	read the notes here and check the differences to fix the getAttacked method in Ogre.java
	 */

	public void getAttacked(Monster monster, int damage) {
		// TODO Auto-generated method stub
		System.out.println("The goblin is getting ready to be attacked");
		monster.setCurrentHealth(monster.getCurrentHealth() - 1);
		if (monster.getCurrentHealth() >= 1) {
			System.out.println("The Goblin is still alive");
		} else { 
			System.out.println("The Goblin died");
		}
		
	};

	@Override
	public void attack(Combatant target, int damage) {

	}
} //end of class
