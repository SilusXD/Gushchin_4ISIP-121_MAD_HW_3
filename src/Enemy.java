public class Enemy
{
    private String name;
    private double health;
    private double power;

    Enemy(String name, double health, double power)
    {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public void attack(Player player)
    {
        System.out.println("БАЦ-БАЦ!");
        player.setHealth(player.getHealth() - power);
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
