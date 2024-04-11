package bridge;

import bridge.enemy.Warrior;
import bridge.fighter.MageFighterImpl;

public class TestBridge{
    public static void main(String[] args) {
        System.out.println("Warrior");
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.protect();

        warrior.setFighter(new MageFighterImpl());
        warrior.attack();
        warrior.protect();

    }
}
