public class Manager extends Worker
{
    private Worker[] workers;
    Manager(String name, int age, Gender gender, float salary, Worker[] workers)
    {
        super(name, age, gender, salary);
        this.workers = workers;
    }
}
