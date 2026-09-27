package Stratergy_Pattern;

public class UPIPaymentStratergy implements PaymentStratergy {
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment "+amount);
    }
}
