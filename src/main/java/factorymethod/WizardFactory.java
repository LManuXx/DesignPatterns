package factorymethod;

import factory.Enemy;
import factory.Wizard;

public class WizardFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Wizard();
    }
}
