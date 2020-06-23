package pl.wsb.devices;

import pl.wsb.interfaces.Sellable;

public abstract class Device implements Sellable {

    String producer, model;
    int yearOfProduction;
    double price;

    void turnOn(){
    }

}
