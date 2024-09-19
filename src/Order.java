import java.util.ArrayList;

class Order
{
    private ArrayList<Product1> products = new ArrayList<>();
    private double totalCost = 0.0;


    public void addProduct(Product1 product)
    {
        products.add(product);
        totalCost += product.getPrice();
        System.out.println(product.getName() + " добавлено в заказ");
    }

    public double calculateTotalCost()
    {
        return totalCost;
    }

    public void print()
    {
        System.out.println("Детали заказа:");
        for (Product1 product : products) {
            product.print();
        }
        System.out.println("Итого: " + totalCost);
    }
}