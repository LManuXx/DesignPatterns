package factorymethod;

import factory.Enemy;
import factory.EnemyFactory;

public class TestFactory {
    public static void main(String[] args){
        Enemy warrior = new WarriorFactory().createEnemy();
        Enemy wizard = new WizardFactory().createEnemy();
        warrior.attack();
        wizard.attack();
    }
}
