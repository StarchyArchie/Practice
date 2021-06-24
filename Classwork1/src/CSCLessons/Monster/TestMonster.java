package CSCLessons.Monster;// TestMonster Class
//
// Author Mark Hoffman
// 6/24/14
//
// Tests a Monster class

public class TestMonster
{
	public static void main (String [] args)
	{
		//Create Monster object
		Monster harry = new Monster();

		//Print new object variables
		System.out.println ("\nHarry with default health and strength\n");
		System.out.println ("health = " + harry.getHealth()
				    + " strength = " + harry.getStrength());

		//Change strength and health
		System.out.println ("\nHarry with set health and strength\n");
		harry.setHealth(99.0);
		harry.setStrength (30.0);

		//Print updated object variables
		System.out.println ("health = " + harry.getHealth()
				    + " strength = " + harry.getStrength());


		//Get damage and inflict damage on Monster
		System.out.println ("\nTest takeDamage, attack and isAlive\n");
		double damageValue = harry.attack();
		harry.takeDamage(damageValue);

		//Print updated object variables
		System.out.println ("damage = " + damageValue
				    + " isAlive = " + harry.isAlive());
		System.out.println ("health = " + harry.getHealth()
				    + " strength = " + harry.getStrength());

		//Run battle (self-inflicted) until Monster is dead
		System.out.println ("\nHarry fights himself to the death\n");
		while (harry.isAlive())
		{
			//Get damage and inflict damage on Monster
			damageValue = harry.attack();
			harry.takeDamage(damageValue);

			//Print updated object variables
			System.out.println ("damage = " + damageValue
				    + " isAlive = " + harry.isAlive());
			System.out.println ("health = " + harry.getHealth()
				    + " strength = " + harry.getStrength());
		}
	}
}
