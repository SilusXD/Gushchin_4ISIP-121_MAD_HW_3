public class UniqueID
{
    private int id;
    private static int countId = 0;

    UniqueID()
    {
        id = countId;
        countId++;
    }

    public int getId()
    {
        return id;
    }
}
