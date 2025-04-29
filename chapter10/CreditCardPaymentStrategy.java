package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-02月-03日--15:06
 */
public class CreditCardPaymentStrategy implements PaymentStrategy{

    //这里的实体类应该独立出来为一个card 在entity中
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCardPaymentStrategy(String cardNumber, String expiryDate, String cvv)
    {

        this.cardNumber = cardNumber;
        this.expirationDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        //使用信用卡支付
        System.out.println("paid " + amount+" Yuan with credit card");
    }
}
