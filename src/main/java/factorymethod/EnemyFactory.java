package factorymethod;

import factory.Enemy;
import factory.Warrior;
import factory.Wizard;

public abstract class EnemyFactory {
    public abstract Enemy createEnemy();

}
