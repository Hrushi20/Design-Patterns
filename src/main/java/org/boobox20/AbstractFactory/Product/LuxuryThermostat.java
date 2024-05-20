package org.boobox20.AbstractFactory.Product;

public class LuxuryThermostat implements Thermostat {
    @Override
    public void start() {
        System.out.println("Started LuxuryThermostat");
    }

    @Override
    public void stop() {
        System.out.println("Stopped LuxuryThermostat");
    }
}
