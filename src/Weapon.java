public abstract class Weapon
{
    protected String name;
    protected double power;

    Weapon(String name, double power)
    {
        this.name = name;
        this.power = power;
    }

    public abstract void use(Enemy enemy);
}

