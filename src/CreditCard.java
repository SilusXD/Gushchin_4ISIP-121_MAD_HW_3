public class CreditCard implements PaymentSystem
{
    @Override
    public void pay()
    {
        System.out.println("Заплачено CreditCard");
    }

    @Override
    public void refund()
    {
        System.out.println("Возврат денег CreditCard");
    }
}
