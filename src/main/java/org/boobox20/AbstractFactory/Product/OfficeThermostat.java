package org.boobox20.AbstractFactory.Product;

public class OfficeThermostat implements Thermostat{
    @Override
    public void start() {
        System.out.println("Started Office Thermostat");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Office Thermostat");
    }
}
