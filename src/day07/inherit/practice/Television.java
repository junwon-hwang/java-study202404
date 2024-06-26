package day07.inherit.practice;

public class Television extends ElectronicProduct {

    int screenSize;

    public Television(String productName, double price, String manufacturer, int screenSize) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Screen Size: %d inches\n", this.screenSize);
    }
}
