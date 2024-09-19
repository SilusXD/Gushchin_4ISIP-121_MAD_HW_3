public class Sword extends Weapon
{
    Sword(String name, double power)
    {
        super(name, power);
    }

    @Override
    public void use(Enemy enemy)
    {
        System.out.println("Вжух!");
        enemy.setHealth(enemy.getHealth() - power);
    }
}
