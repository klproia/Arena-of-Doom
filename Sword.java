/**
 * CMSY-166: CE - More Composition 
 * Copyright 2021 Howard Community College
 * @Katie Proia 
 * @version 1.0
 */

public class Sword extends Weapon {
	//Declare instance variables 
	private boolean isEngraved;
	
	//Generate zero-argument constructor
	public Sword() {
		super();
		isEngraved = false;
	}
	
	//Generate constructor argument with parameters
	public Sword(int damage, double cost, boolean isEngraved) {
		super(0, 0.0);
		this.isEngraved = isEngraved;
	}
	
	//generate getters and setters
	public boolean isEngraved() {
		return isEngraved;
	}

	public void setEngraved(boolean isEngraved) {
		this.isEngraved = isEngraved;
	} 
	
//Create toString 	
@Override 
	public String toString() { 
		String b = Boolean.toString(isEngraved); 
		return String.format("cost: %.1f, damage: %d, wood type: %s, engraved: %b \n", super.toString(), b);
	}		
} //end of class
