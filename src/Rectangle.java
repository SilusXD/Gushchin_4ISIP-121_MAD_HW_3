public class Rectangle extends Shape
{
    private double a;
    private double b;

    Rectangle(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea()
    {
        return a * b;
    }
}
