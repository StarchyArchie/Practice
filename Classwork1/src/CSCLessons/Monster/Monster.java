package CSCLessons.Monster;

/**
 * Vishal Nigam
 * 2/5/2018
 * Creates Monster with health, strength, and magical attributes from the MonsterMagic class.
 */

public class Monster
{
    //Instance variables

    private double health;
    private double strength;
    MonsterMagic mage;
    private double mana;

    //Constructors
    
    public Monster()
    {
        this(0.0,0.0);
    }

    public Monster(double newHealth, double str)
    {
        mage = new MonsterMagic();
        health = newHealth;
        strength = str;
        mana = mage.checkMana();
    }

    //Instance methods

    public double getHealth()
    {
        return health;
    }

    public void setHealth(double newHealth)
    {
        health = newHealth;
    }

    public double getStrength(){
        return strength;
    }
    public void setStrength(double str){
        strength = str;
    }
    public boolean isAlive(){
        double x = getHealth();
        return (x>0);
    }
    public boolean canCast(){//checks if monster has sufficient mana for a magical attack
        double x = mage.checkMana();
        double y = mage.getManaCost();
        return x>y;
    }
    public double attack(){
        return Math.random()*strength;
    }
    public double spellAttack(){
        mage.setMana(mage.checkMana() - mage.getManaCost());
        return Math.random()*mage.spellDamage();
    }
    public void takeDamage(double damage){//calculates damage after resistance
        double x = mage.getResistance();
        double y = x/100;
        double total = damage - damage*y;
        double h = getHealth();
        double remainder = h-total;
        setHealth(remainder);
    }
    public void strongDamage(double damage){//calculates damage after resistance for weakest resistance
        double x = mage.getWeakResistance();
        if (x<0){
            double z=x*-1;//ensures that negative resistance increases damage
            double y = z/100;
            double total = damage + damage*y;
            double h = getHealth();
            double remainder = h-total;
            setHealth(remainder);
        }
        else {
            double y = x/100;
            double total = damage - damage*y;
            double h = getHealth();
            double remainder = h-total;
            setHealth(remainder);
        }

    }
}
