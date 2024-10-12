package SimpleProducts;

import BundlePackage.IProduct;

public class Phone implements IProduct {
    private String description;
    private String name;
    private double price;

    public Phone(String name, String description, double price) {
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
        System.out.println("SimpleProducts.Phone: " + this.name + ", Description: " + this.description + ", Price: " + this.price);
    }
}
