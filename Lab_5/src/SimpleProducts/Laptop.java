package SimpleProducts;

import BundlePackage.IProduct;

public class Laptop implements IProduct {
    private String description;
    private String name;
    private double price;

    public Laptop(String name, String description, double price) {
        this.name=name;
        this.description=description;
        this.price = price;
    }

    @Override
    public double get_price() {
        return this.price;
    }



    @Override
    public void displayDetails() {
        System.out.println("SimpleProducts.Laptop: " + this.name + ", Description: " + this.description + ", Price: " + this.price);
    }
}
