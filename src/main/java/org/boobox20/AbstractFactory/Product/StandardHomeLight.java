package org.boobox20.AbstractFactory.Product;

public class StandardHomeLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("Turned on Standard home light");
    }

    @Override
    public void turnOff() {
        System.out.println("Turned off Standard home light");
    }
}
