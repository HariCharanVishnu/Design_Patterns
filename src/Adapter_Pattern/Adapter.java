package Adapter_Pattern;

public class Adapter implements TypeCCharger{
    private MicroUSBCable microUSBCable;

    public Adapter(MicroUSBCable microUSBCable) {
        this.microUSBCable = microUSBCable;
    }
    @Override
    public void charge() {
        System.out.println("Adapter Convert Micro USBCable to Type C");
        microUSBCable.charge();
    }
}
