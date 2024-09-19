public class BankAccount
{
    private int accountNumber;
    private float balance;

    BankAccount(int accountNumber, float balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void addMoney(float money)
    {
        balance += money;
        System.out.printf("Вы внесли %fр.\n", money);
    }

    public void takeMoney(float money)
    {
        if(balance >= money)
        {
            balance -= money;
            System.out.printf("Вы сняли %fр.\n", money);
        }
        else
        {
            System.out.println("На счете недостаточно средств.");
        }
    }
}
