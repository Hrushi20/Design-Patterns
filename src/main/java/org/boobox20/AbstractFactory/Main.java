package org.boobox20.AbstractFactory;

import org.boobox20.AbstractFactory.Creator.HomeType;
import org.boobox20.AbstractFactory.Creator.SmartHome;
import org.boobox20.AbstractFactory.Creator.SmartHomeFactory;

public class Main {

    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();

        SmartHomeFactory smartHomeFactory = smartHome.createSmartHome(HomeType.LUXURY);

        smartHomeFactory.smartCamera().startRecord();
        smartHomeFactory.smartLight().turnOn();
        smartHomeFactory.smartThermostat().start();

        smartHomeFactory.smartCamera().stopRecord();
        smartHomeFactory.smartLight().turnOff();
        smartHomeFactory.smartThermostat().stop();

        System.out.println("===============================================");
        smartHomeFactory = smartHome.createSmartHome(HomeType.STANDARD_HOME);
        smartHomeFactory.smartCamera().startRecord();
        smartHomeFactory.smartLight().turnOn();
        smartHomeFactory.smartThermostat().start();

        smartHomeFactory.smartCamera().stopRecord();
        smartHomeFactory.smartLight().turnOff();
        smartHomeFactory.smartThermostat().stop();
    }
}
