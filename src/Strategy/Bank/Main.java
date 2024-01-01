package Strategy.Bank;

public class Main {
    public static void main(String[] args) {
        ShopCard card = new ShopCard();

        PaymentStrategy creditCardPayment = new CreditCardPayment("4410", "Rozi Mirpulatov");
        PaymentStrategy payPalPayment = new PayPalPayment("rozi11@email.com");

        card.setPaymentStrategy(creditCardPayment);
        card.checkout(100);

        card.setPaymentStrategy(payPalPayment);
        card.checkout(20);

    }
}
