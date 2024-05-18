package org.boobox20.FactoryMethod.Creator;

import org.boobox20.FactoryMethod.Product.Food;
import org.boobox20.FactoryMethod.Product.dinner.Biryani;

public class DinnerFactory extends MealFactory{
    @Override
    protected Food getFood(String type) {
        return new Biryani();
    }
}
