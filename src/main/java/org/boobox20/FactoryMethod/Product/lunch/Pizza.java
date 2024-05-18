package org.boobox20.FactoryMethod.Product.lunch;

import org.boobox20.FactoryMethod.Product.Food;

public class Pizza implements Food {
    @Override
    public void eat() {
        System.out.println("Delicious Thin Crust Pizza");
    }
}
