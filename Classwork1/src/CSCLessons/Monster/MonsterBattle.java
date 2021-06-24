package CSCLessons.Monster;

/**
 * Vishal Nigam
 * 2/6/18
 * Uses Monster class to generate a giant and ogre which fight to the death.
 */
public class MonsterBattle {
    public static void main(String[]args){
        Monster giant = new Monster(10000,150);
        Monster ogre = new Monster(6000,250);
        int round = 0;
        System.out.println("Displaying Health and Mana of Fighters.");
        System.out.println("Round, Giant, Ogre.");
        while (giant.isAlive()&&ogre.isAlive()){//executes battle while both parties are alive.
            System.out.println(round+" Giant Health: "+giant.getHealth()+" Giant Mana: "+
                 giant.mage.checkMana()+" Ogre Health: "+ogre.getHealth()+" Ogre Mana: "+ogre.mage.checkMana());
            //Prints health and mana of giant and ogre respectively
            if(giant.mage.getAttribute().equals(ogre.mage.getWeakness())){//checks for attribute alignment to decide attack.
                if(giant.canCast()){
                ogre.strongDamage(giant.spellAttack());
                }
                else {ogre.takeDamage(giant.attack());}
            }
            else if(giant.mage.getAttribute().equals(ogre.mage.getAttribute())){
                ogre.takeDamage(giant.attack());
            }
            else {
                if(giant.canCast()){
                    ogre.strongDamage(giant.spellAttack());
                }
                else {ogre.takeDamage(giant.attack());}
            }
            if(ogre.mage.getAttribute().equals(giant.mage.getWeakness())){//same but for the other monster.
                if(ogre.canCast()){
                    giant.strongDamage(ogre.spellAttack());
                }
                else giant.takeDamage(ogre.attack());
            }
            else if(ogre.mage.getAttribute().equals(giant.mage.getAttribute())){
                giant.takeDamage(ogre.attack());
            }
            else {
                if(ogre.canCast()){
                    giant.strongDamage(ogre.spellAttack());
                }
                else {giant.takeDamage(ogre.attack());}
            }
            round++;
        }
        if (ogre.isAlive()){
            System.out.println("Ogre Wins!");
            }
        else if (giant.isAlive()){
            System.out.println("Giant Wins!");
        }
        else System.out.println("Draw, both combatants are dead.");
    }
}
