package com.company.factoryMethod;

public class WindowsButton implements IButton {
    @Override
    public void render() {
        System.out.println("Windows Button render");
    }

    @Override
    public void onClick(String event) {
        System.out.println("Windows Button click");
    }
}
