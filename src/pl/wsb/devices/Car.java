package pl.wsb.devices;

import pl.wsb.creatures.Human;

public class Car extends Device {

    Double engineCapacity;
    int horsePower;
    public double price;

    public Car(String producer, String model, Double engineCapacity, int horsePower, double price, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    void refuel() {

    };


    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity=" + engineCapacity +
                ", horsePower=" + horsePower +
                ", price=" + price +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("wzium wzium prypypypypypy");
    }


    @Override
    public boolean sell(Human buyer, Human seller) throws Exception{
        if (seller.getVehicle().price <= buyer.getCash()) {
            buyer.minusCash(seller.getVehicle().price);
            seller.plusCash(seller.getVehicle().price);
            buyer.setVehicle(seller.getVehicle());
            seller.setVehicle(null);
            System.out.println("Your" + buyer.getVehicle().producer + " " + buyer.getVehicle().model + " has new owner.");
            return true;
        } else {
            System.out.println("Not enough cash");
            return false;
        }
    }
}
