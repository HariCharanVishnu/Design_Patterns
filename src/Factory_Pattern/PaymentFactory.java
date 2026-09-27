package Factory_Pattern;

public class PaymentFactory {
    public static Payment getPaymentMethod(String type){
        if(type.equals("Card")){
            return new CardPayment();
        }
        else if(type.equals("UPI")){
            return new UPIPayment();
        }
        else {
            System.out.println("Invalid Payment");
            return null;
        }
    }
}
