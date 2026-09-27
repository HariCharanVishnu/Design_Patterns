package Factory_Pattern;

public class Client {
    public static void main(String[] args) {
        Payment upi = PaymentFactory.getPaymentMethod("UPI");
        upi.pay(500);

        Payment card = PaymentFactory.getPaymentMethod("Card");
        card.pay(500);
    }
}
