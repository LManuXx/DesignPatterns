package prototype;

public class TestPrototype {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior(100,100,100);
        Warrior warrior2 = (Warrior) warrior1.clone();
        System.out.println(warrior1);
        System.out.println(warrior2);
        warrior2.setHealth(0);
        System.out.println(warrior1);
        System.out.println(warrior2);
    }
}
