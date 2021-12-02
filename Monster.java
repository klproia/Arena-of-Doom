
/**
 * CMSY-166: CE - Object Inheritance 
 * Copyright 2021 Howard Community College
 * @Katie Proia 
 * @version 1.0
 */

public abstract class Monster implements Combatant {
	//Declare Instance variables 
	private int currentHealth;
	private int damageDealt;
	double treasureCarried;

	public Monster() {
		currentHealth = 0;
		damageDealt = 0;
		treasureCarried = 0.0;
	}

	public Monster(int currentHealth, int damageDealt, double treasureCarried) {
		super();
		this.currentHealth = currentHealth;
		this.damageDealt = damageDealt;
		this.treasureCarried = treasureCarried;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getDamageDealt() {
		return damageDealt;
	}

	public void setDamageDealt(int damageDealt) {
		this.damageDealt = damageDealt;
	}

	public double getTreasureCarried() {
		return treasureCarried;
	}

	public void setTreasureCarried(double treasureCarried) {
		this.treasureCarried = treasureCarried;
	}

	@Override
	public String toString() {
		return String.format("hp: %d, damage: %d, treasure: %.1f", currentHealth, damageDealt, treasureCarried);
	}

	@Override
	public void attack(Combatant target, int damage) {

	}

	@Override
	public void getAttacked(Combatant target, int damage) {
		// TODO Auto-generated method stub

	}
}
