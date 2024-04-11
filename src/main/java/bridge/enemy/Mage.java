package bridge.enemy;

import bridge.fighter.Fighter;
import bridge.fighter.MageFighterImpl;

public class Mage extends Enemy {

    public Mage(){
        setFighter(new MageFighterImpl());
    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public void setFighter(Fighter fighter) {
        super.setFighter(fighter);
    }

    public void attack() {
        System.out.println("Mage attack");
        getFighter().attack();
    }


    public void protect() {
        System.out.println("mage protect");
        getFighter().protect();
    }
}
