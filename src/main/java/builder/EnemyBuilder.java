package builder;

public class EnemyBuilder {
    private String nombre;
    private String type;
    private int health;
    private int damage;
    private int endurance;

    public String getNombre() {
        return nombre;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getEndurance() {
        return endurance;
    }

    public EnemyBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public EnemyBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public EnemyBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    public EnemyBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    public EnemyBuilder setEndurance(int endurance) {
        this.endurance = endurance;
        return this;
    }

    public Enemy build(){
        Enemy enemy = new Enemy();
        enemy.setDamage(getDamage());
        enemy.setEndurance(getEndurance());
        enemy.setDamage(getDamage());
        enemy.setHealth(getHealth());
        enemy.setNombre(getNombre());
        enemy.setType(getType());
        return enemy;
    }

}
