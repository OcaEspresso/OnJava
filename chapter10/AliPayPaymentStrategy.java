package chapter10;

/**
 * @description
 * @author: RicksonYu
 * @create: 2025年-02月-03日--15:09
 */
public class AliPayPaymentStrategy implements PaymentStrategy{

    private String allipayAccount;

    public AliPayPaymentStrategy(String allipayAccount){
        this.allipayAccount=allipayAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("paid " + amount+" Yuan with ali pay");
    }
}
