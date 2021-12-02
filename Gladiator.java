/**
 * CMSY-166: CE - More Composition 
 * Copyright 2021 Howard Community College
 * @Katie Proia 
 * @version 1.0
 */

//interface Combatant

public class Gladiator implements Combatant {
	//Declare Instance variables 
	private String gladiatorName;
	private int currentHealth;
	private Club weapon = new Club();
	private Rags armor = new Rags();
	private double treasureCarried = 0.0;
	private int getAttacked; 
	
	//
	
//Create zero argument constructor and constructor with parameters 
public Gladiator() {
		super.toString(); 
		gladiatorName = "name";
		currentHealth = 10;
		treasureCarried = 0.5;
	}	
	

public Gladiator(String gladiatorName, int currentHealth, Club weapon, Rags armor, double treasureCarried) {
		super(); 
		this.gladiatorName =  gladiatorName;
		this.currentHealth = currentHealth;
		this.weapon = weapon;
		this.armor = armor;
		this.treasureCarried = treasureCarried;
	}

//Generate getters and setters

public String getGladiatorName() {
	return gladiatorName;
}


public void setGladiatorName(String gladiatorName) {
	this.gladiatorName = gladiatorName;
}


public int getcurrentHealth() {
	return currentHealth;
}


public void setcurrentHealth(int currentHealth) {
	this.currentHealth = currentHealth;
}


public Club getWeapon() {
	return weapon;
}


public void setWeapon(Club weapon) {
	this.weapon = weapon;
}


public Rags getArmor() {
	return armor;
}


public void setArmor(int damage, double cost, String color) {
	armor.setColor(color);
	armor.setCost(cost);
	armor.setDamage(damage);
}


public double getTreasureCarried() {
	return treasureCarried;
}


public void setTreasureCarried(double treasureCarried) {
	this.treasureCarried = treasureCarried;
}	


@Override 
public String toString() { 
	//return super.toString(); 
	return String.format("hp: %d, weapon: %s, armor: %s, treasure carried: %.3f", currentHealth, weapon, armor, treasureCarried);
}

	@Override
	public void attack(Combatant target, int damage) {
		// TODO Auto-generated method stub
		System.out.println("The gladiator is attacking");
		
	}

	@Override
	public void getAttacked(Combatant target, int damage) {
		// TODO Auto-generated method stub
		System.out.println("The gladiator is getting ready to be attacked");
		currentHealth = getAttacked - 1; 
		if (currentHealth >= 1) { 
			System.out.println("Gladiator is still alive");
		} else { 
			System.out.println("The Gladiator died");
		}
		
	}
} //end of class
