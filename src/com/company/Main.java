package com.company;

import com.company.builder.App;
import com.company.factoryMethod.Application;
import com.company.singleton.Database;

public class Main {

    public static void main(String[] args) {

        //singleton
        var db = Database.getInstance();
        var db2 = Database.getInstance();
        System.out.println(db);
        System.out.println(db2);

        //factory method
        var application = new Application();
        application.main();

        //builder
        new App().makeCar();

    }
}
