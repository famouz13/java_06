package com.company.factoryMethod;

public class Application {
    private Dialog dialog;

    public void initialize() throws Exception {
        var OS = "WINDOWS";

        if (OS == "WINDOWS")
            this.dialog = new WindowsDialog();
        else if (OS == "WEB")
            this.dialog = new WebDialog();
        else
            throw new Exception("Unknown operating system!");
    }

    public void main() {
        try {
            this.initialize();
            this.dialog.render();
        } catch (Exception e) {

        }

    }

}
