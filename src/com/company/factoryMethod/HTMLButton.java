package com.company.factoryMethod;

public class HTMLButton implements IButton {
    @Override
    public void render() {
        System.out.println("HTML Button render");
    }

    @Override
    public void onClick(String event) {
        System.out.println("HTML Button click");
    }
}
