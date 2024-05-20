package org.boobox20.AbstractFactory.Product;

public class OfficeHomeLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("Turned on Office Home Light");
    }

    @Override
    public void turnOff() {
        System.out.println("Turned off Office Home Light");
    }
}
