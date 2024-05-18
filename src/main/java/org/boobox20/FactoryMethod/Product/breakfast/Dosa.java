package org.boobox20.FactoryMethod.Product.breakfast;

import org.boobox20.FactoryMethod.Product.Food;

public class Dosa implements Food {

    @Override
    public void eat() {
        System.out.println("I am eating Dosa");
    }
}
