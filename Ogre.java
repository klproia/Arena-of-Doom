/**
 * CMSY-166: CE - More Composition Copyright 2021 Howard Community College
 * 
 * @Katie Proia
 * @version 1.0
 */

public class Ogre extends Monster implements Combatant {
	// Declare instance variables
	String tribeName;

	// generate zero-argument constructor
	public Ogre() {
		super();
		tribeName = "Unknown";
	}

	// generate constructor with parameters
	public Ogre(int currentHealth, int damageDealt, double treasureCarried, String tribeName) {
		super();
		this.tribeName = tribeName;
	}
	
	// generate getters and setters 
	public String getTribeName() {
		return tribeName;
	}

	public void setTribeName(String tribeName) {
		this.tribeName = tribeName;
	}
	

@Override 
	public String toString() { 
		return String.format("hp: %d, damage: %d, annoyance: %d, tribe: %s, treasure: %.3f", super.toString(), tribeName);
	}	


public void getAttacked(Monster monster, int damage) {
	// TODO Auto-generated method stub
	System.out.println("The Ogre is getting ready to be attacked");
	monster.setCurrentHealth(monster.getCurrentHealth() - 1);
	if (monster.getCurrentHealth() >= 1) {
		System.out.println("The Ogre is still alive");
	} else { 
		System.out.println("The Ogre died");
	}
	
}

	@Override
	public void attack(Combatant target, int damage) {

	}
}
 //end of class
