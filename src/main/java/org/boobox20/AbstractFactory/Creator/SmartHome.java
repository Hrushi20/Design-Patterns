package org.boobox20.AbstractFactory.Creator;

public class SmartHome {

    public SmartHomeFactory createSmartHome(HomeType homeType){
        return switch (homeType){
            case LUXURY -> new LuxuryHomeFactory();
            case STANDARD_HOME -> new StandardHomeFactory();
            default -> new OfficeBuildingFactory();
        };
    }
}
