public class TestObject
{
    private static int counter;

    TestObject()
    {
        counter++;
    }

    public static int getCounter() { return counter; }
}
