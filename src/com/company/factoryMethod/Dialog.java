package com.company.factoryMethod;

public abstract class Dialog {

    public void render() {
        IButton okBtn = createButton();
        okBtn.onClick("close dialog");
        okBtn.render();
    }

    abstract public IButton createButton();
}
