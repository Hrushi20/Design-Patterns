package org.boobox20.AbstractFactory.Product;

public class OfficeSecurityCamera implements SecurityCamera {
    @Override
    public void startRecord() {
        System.out.println("Started Recording via Office Security Camera");
    }

    @Override
    public void stopRecord() {
        System.out.println("Stooped Recording on Office Security Camera");
    }
}
