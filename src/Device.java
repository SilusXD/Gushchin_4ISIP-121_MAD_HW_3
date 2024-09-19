public class Device
{
    protected String brand;

    Device(String brand)
    {
        this.brand = brand;
    }

    public void turnOn()
    {
        System.out.println("Вкл.");
    }

    public void turnOff()
    {
        System.out.println("Выкл.");
    }
}
