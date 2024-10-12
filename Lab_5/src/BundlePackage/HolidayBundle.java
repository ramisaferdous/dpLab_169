package BundlePackage;

import SimpleProducts.Phone;
import SimpleProducts.Laptop;

public class HolidayBundle extends BundleProduct {
    public HolidayBundle(String name) {
        super(name);

        this.addProduct(new Phone("SimpleProducts.Phone", "A smartphone", 800));
        this.addProduct(new Laptop("SimpleProducts.Laptop", "A high-performance laptop", 1200));
    }



}
