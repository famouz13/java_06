package com.company.factoryMethod;

public class WebDialog extends Dialog {
    @Override
    public IButton createButton() {
        return new HTMLButton();
    }
}
