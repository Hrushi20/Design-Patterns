package org.boobox20.AbstractFactory.Product;

public class LuxuryHomeLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("Luxury Home Light turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Luxury Home Light turned off");
    }
}
