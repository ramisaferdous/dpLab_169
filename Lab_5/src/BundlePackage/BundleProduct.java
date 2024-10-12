package BundlePackage;

import java.util.ArrayList;
import java.util.List;

public  abstract class BundleProduct implements IProduct {
    public String  name;
    List<IProduct> products;

    public BundleProduct(String name) {
        this.name = name;
        this.products=new ArrayList<>();
    }



    public BundleProduct addProduct(IProduct product) {
        products.add(product);
        return this;
    }
    @Override
    public double get_price() {
        double total = 0;
        for (IProduct product :products) {
            total += product.get_price();
        }
        return total;
    }


    @Override
    public void displayDetails() {
        System.out.println("Bundle: " + this.name);
        for (IProduct product : products) {
            product.displayDetails();
        }
    }

}
