package CSCLessons.Monster;

/**
 * Vishal Nigam
 * 2/8/18
 * Sets up attributes, resistances,spell configuration, and mana pool for an entity.
 */
public class MonsterMagic {

//instance variables

    private String attribute;
    private String weakness;
    private int intensity;
    private double maxmana;
    private double mana;
    private double manaCost;
    private double primResistance,resistance,weakResistance;

//constructors

    public MonsterMagic(){
        magCon();
        spellCon();
        setResistance();
    }

    //methods

    private void magCon(){//Generates base mana pool
        double x = Math.random()*10;
        if(x<3){
            maxmana = Math.random()*10;
        }
        else if(x<5){
            maxmana = Math.random()*50;
        }
        else if(x<7){
            maxmana = Math.random()*200;
        }
        else maxmana = Math.random()*500;
        mana = maxmana;
        }
    public void setResistance(){//Generates resistance variables
        primResistance = Math.random()*100+50;
        resistance = Math.random()*100;
        weakResistance = (Math.random()*100)-50;
    }
    public void spellCon() {//Generates primary attribute and intensity
        double y = Math.random() * 50;

        intensity = (int) maxmana / 10;
        manaCost = maxmana / 5;//Sets amount of mana per cast

        if (y < 10) {
            attribute = "Fire";
            weakness = "Shadow";
            intensity = intensity + 10;
            manaCost = manaCost + 5;
        } else if (y < 20) {
            attribute = "Ice";
            weakness = "Fire";
            intensity = intensity + 5;
        } else if (y < 30) {
            attribute = "Light";
            weakness = "Ice";
            intensity = intensity - 10;
            manaCost = manaCost / 2;
        } else if (y < 40) {
            attribute = "Shadow";
            weakness = "Light";
            intensity = intensity + 20;
        } else {
            attribute = "Arcane";
            weakness = "Arcane";
            intensity = intensity + 50;
            manaCost = manaCost * 2;
        }
        if(intensity<0){
            intensity = 0;//Ensures that spells do not heal opponent.
        }
    }
    public double checkMana(){
        return mana;
    }//returns current mana
    private void spellCheck(){
        System.out.println(attribute+" spell "+manaCost+" mana per use, Intensity: "+intensity);//mostly debugging
    }
    public double spellDamage(){
        return manaCost * (double) intensity;
    }
    public void checkResistance(){
        System.out.println("Primary resistance: "+primResistance+" Basic resistance: "+resistance+" Weakness resistance: "+weakResistance);
    }
    public void checkAttributes(){
        System.out.println("Primary attribute: "+attribute+" Weakness: "+weakness);
    }
    public String getAttribute(){
        return attribute;
    }
    public String getWeakness(){
        return weakness;
    }
    public double getWeakResistance(){
        return weakResistance;
    }
    public double getResistance(){
        return resistance;
    }
    public double getPrimResistance(){
        return primResistance;
    }//returns primary resistance
    public double getManaCost(){
        return manaCost;
    }//returns mana cost per spell cast
    public void setMana(double m){
        mana = m;
    }//sets mana to new value
    public double getManaCap(){
        return maxmana;
    }//returns maximum mana
}
