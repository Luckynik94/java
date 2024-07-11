package notebooks;

public class Notebook {
    private String brand;
    private int ram; // ОЗУ
    private int hdd; // Объем ЖД
    private String os; // Операционная система
    private String color; // Цвет

    public Notebook(String brand, int ram, int hdd, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook [brand=" + brand + ", ram=" + ram + "GB, hdd=" + hdd + "GB, os=" + os + ", color=" + color + "]";
    }
}