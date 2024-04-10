package builder;

public class TestBuilder {
    public static void main(String[] args) {
        Enemy enemy = Enemy.builder()
                .setNombre("Pepe")
                .setType("Mago")
                .build();

        System.out.println(enemy.toString());
    }
}
