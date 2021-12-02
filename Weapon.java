/**
 * CMSY-166: CE - Object Inheritance 
 * Copyright 2021 Howard Community College
 * @Katie Proia 
 * @version 1.0
 */

public class Weapon {
	//Declare Instance variables 
		private int damage;
		private double cost = 0.0;
		
		
		//Generate zero-argument constructor 
		public Weapon() {
			damage = 0;
			cost = 0;
		}
		
		//Generate constructor with parameters		
		public Weapon(int damage, double cost) {
			this.damage = damage;
			this.cost = cost;
		}
		
		//Generate getters and setters 
		public int getDamage() {
			return damage;
		}

		public void setDamage(int damage) {
			this.damage = damage;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}
		
@Override 
		public String toString() { 
			return String.format("cost: %.1f, damage: %d", cost, damage);
		}
		
		
		
		

}
