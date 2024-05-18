package org.boobox20.FactoryMethod.Creator;

import org.boobox20.FactoryMethod.Product.Food;
import org.boobox20.FactoryMethod.Product.lunch.Burger;
import org.boobox20.FactoryMethod.Product.lunch.Pizza;

public class LunchFactory extends MealFactory {
    @Override
    protected Food getFood(String type) {
        return switch (type) {
            case "pizza" -> new Pizza();
            case "burger" -> new Burger();
            default -> null;
        };
    }
}
