public class Product
{
    private String name;
    private double price;
    private int quantity;

    Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void print()
    {
        System.out.printf("Название: %s\nЦена: %fр\nКоличество: %d\n\n", name, price, quantity);
    }
}
