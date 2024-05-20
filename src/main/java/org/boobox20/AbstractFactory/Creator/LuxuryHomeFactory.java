package org.boobox20.AbstractFactory.Creator;

import org.boobox20.AbstractFactory.Product.*;

public class LuxuryHomeFactory implements SmartHomeFactory {
    @Override
    public Light smartLight() {
        return new LuxuryHomeLight();
    }

    @Override
    public SecurityCamera smartCamera() {
        return new LuxurySecurityCamera();
    }

    @Override
    public Thermostat smartThermostat() {
        return new LuxuryThermostat();
    }
}
