package org.boobox20.AbstractFactory.Product;

public class LuxurySecurityCamera implements SecurityCamera {
    @Override
    public void startRecord() {
        System.out.println("Started recording using Luxury Security Camera");
    }

    @Override
    public void stopRecord() {
        System.out.println("Stopped recording using Luxury Security Camera");
    }
}
