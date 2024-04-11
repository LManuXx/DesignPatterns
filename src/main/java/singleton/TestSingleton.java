package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Player player = Player.getPlayer("Pepe");
        System.out.println(player);
        player = Player.getPlayer("manolo");
        System.out.println(player);
        Player player2 = Player.getPlayer("juan");
        System.out.println(player2);
    }
}
