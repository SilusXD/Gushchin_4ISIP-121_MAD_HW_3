public class Product1
{
    private String name;
    private double price;

    public Product1(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public void print()
    {
        System.out.printf("%s: %fр.\n", name, price);
    }
}
