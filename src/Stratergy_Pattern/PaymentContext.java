package Stratergy_Pattern;

public class PaymentContext {
    private PaymentStratergy paymentStratergy;

    public void setStratergy(PaymentStratergy paymentStratergy) {
        this.paymentStratergy = paymentStratergy;
    }

    public void executePayment(double amount) {
        paymentStratergy.pay(amount);
    }
}