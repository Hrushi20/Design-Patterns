package org.boobox20.FactoryMethod.Creator;

import org.boobox20.FactoryMethod.Product.Food;

public abstract class MealFactory {

    // Hence Pattern is called FactoryMethod.
    // Abstract method ensure that concrete class is responsible
    // for returning the Item. We bind the item with Interface for extensibility.
    abstract protected Food getFood(String type);

    public void timeToEat(String type){
       Food food = getFood(type);
       if(food == null){
           System.out.println("Invalid Food Name: " + type);
           return;
       }
       food.eat();
    }
}
