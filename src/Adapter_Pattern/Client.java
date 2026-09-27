package Adapter_Pattern;

public class Client {
    public static void main(String[] args) {
        MicroUSBCable  microUSBCable = new MicroUSBCable();
        TypeCCharger adapter = new Adapter(microUSBCable);
        adapter.charge();
    }
}
