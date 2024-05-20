package org.boobox20.AbstractFactory.Product;

public class StandardThermostat implements Thermostat {
    @Override
    public void start() {
        System.out.println("StandardThermostat started");
    }

    @Override
    public void stop() {
        System.out.println("StandardThermostat stopped");
    }
}
