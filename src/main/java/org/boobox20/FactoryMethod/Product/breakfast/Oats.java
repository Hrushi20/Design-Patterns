package org.boobox20.FactoryMethod.Product.breakfast;

import org.boobox20.FactoryMethod.Product.Food;

public class Oats implements Food {

    @Override
    public void eat() {
        System.out.println("I'm eating Oats meal");
    }
}
