package org.boobox20.FactoryMethod;

import org.boobox20.FactoryMethod.Creator.BreakfastFactory;
import org.boobox20.FactoryMethod.Creator.DinnerFactory;
import org.boobox20.FactoryMethod.Creator.LunchFactory;
import org.boobox20.FactoryMethod.Creator.MealFactory;

public class Main {

    public static void main(String[] args) {
        MealFactory meal = new BreakfastFactory();

        meal.timeToEat("dosa");
        meal.timeToEat("idly");
        meal.timeToEat("oats");

        meal = new LunchFactory();
        meal.timeToEat("pizza");
        meal.timeToEat("burger");

        meal = new DinnerFactory();
        meal.timeToEat("biryani");
    }
}