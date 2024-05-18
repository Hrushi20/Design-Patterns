package org.boobox20.FactoryMethod.Product.dinner;

import org.boobox20.FactoryMethod.Product.Food;

public class Biryani implements Food {
    @Override
    public void eat() {
        System.out.println("Yummy Biryani");
    }
}
