package org.boobox20.AbstractFactory.Creator;

import org.boobox20.AbstractFactory.Product.Light;
import org.boobox20.AbstractFactory.Product.SecurityCamera;
import org.boobox20.AbstractFactory.Product.Thermostat;

public interface SmartHomeFactory {
    Light smartLight();

    SecurityCamera smartCamera();

    Thermostat smartThermostat();
}
