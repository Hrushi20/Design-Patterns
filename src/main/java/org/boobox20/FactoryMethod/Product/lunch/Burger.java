package org.boobox20.FactoryMethod.Product.lunch;

import org.boobox20.FactoryMethod.Product.Food;

public class Burger implements Food {
    @Override
    public void eat() {
        System.out.println("Tasty Burger. Time to eat");
    }
}
