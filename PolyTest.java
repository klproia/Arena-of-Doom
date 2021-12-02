/**
 * CMSY 166 - CE: Polymorphism 
 * Copyright 2021 Howard Community College
 * Katie Proia 
 * version 1.0
 *
 */
public class PolyTest {
	public static void main (String[] args) { 
		System.out.println("Copyright 2021 Howard Community College"); 
		Combatant[] Combatants = new Combatant[4]; 
		
		Combatant Goblin = new Goblin(); 
		Combatant Ogre = new Ogre(); 
		Combatant Gladiator = new Gladiator();
		Combatant Monster = new Ogre(); 
		
		Combatants[0] = Goblin; 
		Combatants[1] = Ogre; 
		Combatants[2] = Gladiator; 
		Combatants[3] = Monster; 
		
		for (Combatant m : Combatants) { 
			Combatants.toString();			
		}
		
		for (int i = 20;;) { 
		  	Combatant.Goblin(setCurrentHealth(i));			
		}
		
		
		
		
	}

}
