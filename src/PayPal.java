public class PayPal implements PaymentSystem
{
    @Override
    public void pay()
    {
        System.out.println("Заплачено PayPal");
    }

    @Override
    public void refund()
    {
        System.out.println("Возврат денег PayPal");
    }
}
