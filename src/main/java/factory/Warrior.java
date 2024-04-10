package factory;

public class Warrior implements Enemy{
    @Override
    public void attack() {
        System.out.printf("Warrior attack");
    }
}
