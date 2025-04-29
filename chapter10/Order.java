package chapter10;

// Order.java
public class Order {
    private double totalAmount;
    private PaymentStrategy paymentStrategy;

    public Order(double totalAmount, PaymentStrategy paymentStrategy) {
        this.totalAmount = totalAmount;
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment() {
        paymentStrategy.pay(totalAmount);
    }
}
