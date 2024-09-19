public class Worker extends Person
{
    protected float salary;

    Worker(String name, int age, Gender gender, float salary)
    {
        super(name, age, gender);
        this.salary = salary;
    }
}
