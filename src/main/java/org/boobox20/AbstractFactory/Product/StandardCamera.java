package org.boobox20.AbstractFactory.Product;

public class StandardCamera implements SecurityCamera {
    @Override
    public void startRecord() {
        System.out.println("Started recording using Standard Camera");
    }

    @Override
    public void stopRecord() {
        System.out.println("Stopped recording using Standard Camera");
    }
}
