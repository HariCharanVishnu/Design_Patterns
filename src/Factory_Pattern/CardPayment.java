package Factory_Pattern;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Card Payment "+amount);
    }
}
