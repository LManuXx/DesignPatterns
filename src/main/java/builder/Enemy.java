package builder;

public class Enemy {
    private String nombre;
    private String type;
    private int health;
    private int damage;
    private int endurance;

    @Override
    public String toString() {
        return "Enemy{" +
                "nombre='" + nombre + '\'' +
                ", type='" + type + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", endurance=" + endurance +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public static EnemyBuilder builder(){
        return new EnemyBuilder();
    }

}
