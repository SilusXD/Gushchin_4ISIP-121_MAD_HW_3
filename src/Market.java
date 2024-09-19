import java.util.ArrayList;
import java.util.Objects;

public class Market
{
    private ArrayList<Product> products = new ArrayList<Product>();

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public void removeProduct(Product product)
    {
        products.remove(product);
    }

    public Product findProduct(String name)
    {
        for (Product product : products)
        {
            if(Objects.equals(product.getName(), name))
            {
                return product;
            }
        }

        return new Product("",-1,-1);
    }
}
