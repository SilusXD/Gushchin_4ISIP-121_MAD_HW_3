public class Rectangle1
{
    private Point topLeft;
    private Point bottomRight;

    Rectangle1(Point topLeft, Point bottomRight)
    {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double area()
    {
        return Math.abs(bottomRight.x - topLeft.x) * Math.abs(topLeft.y - bottomRight.y);
    }
}
