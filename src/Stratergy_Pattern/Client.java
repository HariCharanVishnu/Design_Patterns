package Stratergy_Pattern;

public class Client {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStratergy(new CardPaymentStratergy());
        context.executePayment(10000);

        context.setStratergy(new UPIPaymentStratergy());
        context.executePayment(5000);

    }
}
