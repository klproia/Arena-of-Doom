
public interface Combatant {
	// For when this creature is attacking a target creature, doing damage to its health
	public abstract void attack( Combatant target, int damage );
	

	// For when this creature is getting attacked by a target creature, taking damage to its health
	public abstract void getAttacked( Combatant target, int damage);


}
