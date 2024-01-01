package Strategy.Bank;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private  String name;
    public CreditCardPayment(String cardNumber, String name){
        this.cardNumber = cardNumber;
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card " + cardNumber);
    }
}

class PayPalPayment implements PaymentStrategy{
    private String email;
    public PayPalPayment(String email){
        this.email = email;
    }


    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal account " + email);
    }
}
