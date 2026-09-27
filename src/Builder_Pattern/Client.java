package Builder_Pattern;

public class Client {
    public static void main(String[] args) {
        Laptop topModel = new LaptopBuilder().
                setBrand("Apple").
                setOs("Mac OS").
                setRam(16).
                setRom(512).setCost(100000).build();
        System.out.println(topModel);
        Laptop basicModel = new LaptopBuilder().
                setBrand("Lenovo").
                setOs("Windows").
                setRam(8).
                setRom(128).setCost(60000).build();
        System.out.println(basicModel);
    }
}
