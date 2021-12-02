/**
 * CMSY-166: CE - More Composition 
 * Copyright 2021 Howard Community College
 * @Katie Proia 
 * @version 1.0
 */

public class Club extends Weapon {
	//Declare Instance variables 
	private String woodType = "weapon"; 
		
	//Creating constructor with zero-arguments 
	public Club() {
		super(); 
		woodType = "Oak";
	}
	
	
	//Creating constructor with all arguments
	public Club(int damage, double cost, String woodType) {
		super(0, 0.0);
		this.woodType = woodType;		
	}
	
	
	//Setting the getters and setters 
	public String getWoodType() {
		return woodType;
	}


	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}
	
@Override 
	public String toString() { 
		return String.format("cost: %.1f, damage: %d, wood type: %s", getCost(), getDamage(), woodType);
	}		
} //end of class 

