package Builder_Pattern;

public class LaptopBuilder {
    private String brand;
    private int ram;
    private int rom;
    private String os;
    private int cost;

    public LaptopBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public LaptopBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public LaptopBuilder setRom(int rom) {
        this.rom = rom;
        return this;
    }

    public LaptopBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public LaptopBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public int getCost() {
        return cost;
    }

    public String getOs() {
        return os;
    }

    public int getRom() {
        return rom;
    }

    public int getRam() {
        return ram;
    }

    public String getBrand() {
        return brand;
    }

    public Laptop build() {
        return new Laptop(this);
    }
}
