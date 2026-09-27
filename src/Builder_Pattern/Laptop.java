package Builder_Pattern;

public class Laptop {

    private String brand;
    private int ram;
    private int rom;
    private String os;
    private int cost;

    Laptop(LaptopBuilder builder) {
        this.brand = builder.getBrand();
        this.ram = builder.getRam();
        this.rom = builder.getRom();
        this.os = builder.getOs();
        this.cost = builder.getCost();
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getOs() {
        return os;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                ", os='" + os + '\'' +
                ", cost=" + cost +
                '}';
    }
}
