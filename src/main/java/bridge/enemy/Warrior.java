package bridge.enemy;

import bridge.fighter.Fighter;
import bridge.fighter.WarriorFighterImpl;

public class Warrior extends Enemy  {

    public Warrior(){
        setFighter(new WarriorFighterImpl());

    }

    public void attack() {
        System.out.println("Warrior:");
        getFighter().attack();
    }


    public void protect() {
        System.out.println("Warrior:");
        getFighter().protect();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public void setFighter(Fighter fighter) {
        super.setFighter(fighter);
    }
}
