package org.boobox20.FactoryMethod.Creator;

import org.boobox20.FactoryMethod.Product.Food;
import org.boobox20.FactoryMethod.Product.breakfast.Dosa;
import org.boobox20.FactoryMethod.Product.breakfast.Idly;
import org.boobox20.FactoryMethod.Product.breakfast.Oats;

public class BreakfastFactory extends MealFactory {

    // Responsible creation of 3 Products.
    @Override
    protected Food getFood(String type) {
        return switch (type.toLowerCase()) {
            case "dosa" -> new Dosa();
            case "idly" -> new Idly();
            case "oats" -> new Oats();
            default -> null;
        };
    }
}
