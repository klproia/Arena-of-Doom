/**
 * CMSY-166: CE - More Composition 
 * Copyright 2021 Howard Community College
 * @Katie Proia 
 * @version 1.0
 */

public class Leather {
	//Declare instance variables 
		private double cost; 
		private int damage; 
		private double thickness;
		
		//generate zero-argument constructor
		public Leather() {
			cost = 4.5;
			damage = 3;
			thickness = 2.0;
		}
		
		//generate constructor with parameters
		public Leather(double cost, int damage, double thickness) {
			super();
			this.cost = cost;
			this.damage = damage;
			this.thickness = thickness;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		public int getDamage() {
			return damage;
		}

		public void setDamage(int damage) {
			this.damage = damage;
		}

		public double getThickness() {
			return thickness;
		}

		public void setThickness(double thickness) {
			this.thickness = thickness;
		}
		
@Override 
		public String toString() { 
			return String.format("cost: %.1f, damage: %d, thickness: %.1f", cost, damage, thickness);
		}	
} //end of class 
