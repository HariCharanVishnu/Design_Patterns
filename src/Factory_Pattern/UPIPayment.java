package Factory_Pattern;

public class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment "+amount);
    }
}
