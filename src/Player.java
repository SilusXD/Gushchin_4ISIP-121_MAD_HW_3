public class Player
{
    private String name;
    private Weapon weapon;
    private double health;


    Player(String name, Weapon weapon, double health)
    {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public void attack(Enemy enemy)
    {
        weapon.use(enemy);
    }

    public double getHealth()
    {
        return health;
    }

    public String getName()
    {
        return name;
    }

    public void setHealth(double health)
    {
        this.health = health;
    }
}
