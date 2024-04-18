package day08.static_.practice2;

public class Product {
    private String productName;
    private int price;
    
    Product(String productName, int price){
        this.productName = productName;
        this.price = price;
    }

    public void sellProduct() {
        Store.addSale(this.price);
    }
}
