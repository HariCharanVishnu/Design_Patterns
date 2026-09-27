package Stratergy_Pattern;

public class CardPaymentStratergy implements PaymentStratergy {
    @Override
    public void pay(double amount) {
        System.out.println("Card Payment "+amount);
    }
}
