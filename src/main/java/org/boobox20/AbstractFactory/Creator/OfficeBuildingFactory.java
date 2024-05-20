package org.boobox20.AbstractFactory.Creator;

import org.boobox20.AbstractFactory.Product.Light;
import org.boobox20.AbstractFactory.Product.SecurityCamera;
import org.boobox20.AbstractFactory.Product.Thermostat;

public class OfficeBuildingFactory implements SmartHomeFactory {
    @Override
    public Light smartLight() {
        return null;
    }

    @Override
    public SecurityCamera smartCamera() {
        return null;
    }

    @Override
    public Thermostat smartThermostat() {
        return null;
    }
}
