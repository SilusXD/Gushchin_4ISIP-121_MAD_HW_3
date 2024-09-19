public class Laptop extends Device
{
    Laptop(String brand)
    {
        super(brand);
    }

    public void turnOnKeyboardLed()
    {
        System.out.println("Подсветил клавиатуру.");
    }
}
