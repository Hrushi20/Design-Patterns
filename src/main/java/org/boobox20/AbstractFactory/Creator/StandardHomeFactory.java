package org.boobox20.AbstractFactory.Creator;

import org.boobox20.AbstractFactory.Product.*;

public class StandardHomeFactory implements SmartHomeFactory {
    @Override
    public Light smartLight() {
        return new StandardHomeLight();
    }

    @Override
    public SecurityCamera smartCamera() {
        return new StandardCamera();
    }

    @Override
    public Thermostat smartThermostat() {
        return new StandardThermostat();
    }
}
