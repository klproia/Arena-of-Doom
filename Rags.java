/**
 * CMSY-166: CE - More Composition 
 * Copyright 2021 Howard Community College
 * @Katie Proia 
 * @version 1.0
 */

public class Rags {
	//Declare Instance variables 
	private int damage;
	private String color; 
	private double cost;
	
	
	//Creating constructor with zero-arguments 
	public Rags() {
		damage = 2;
		cost = 1.5;
		color = "dull grey";
	}
	
	
	//Creating constructor with all arguments
	public Rags(String color, int damage, double cost) {
		super();
		this.damage = damage;
		this.cost = cost;
		this.color = color;		
	}
	
	
	//Create getters and setters 
	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override 
	public String toString() { 
		return String.format("cost: %.1f damage: %d color: %s", cost, damage, color);
	}
} //end of class
