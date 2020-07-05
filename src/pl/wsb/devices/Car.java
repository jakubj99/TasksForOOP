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
        System.out.println("Car has been refueled");
    };

    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if(!seller.hasACarInGarage(this)){
            throw new Exception("You dont have this car");
        }
        if(!buyer.hasAFreePlaceInGarage()){
            throw new Exception("You don't have free space in garage");
        }
        if(buyer.getCash() < price){
            throw new Exception("No money, no game");
        }
        buyer.removeCarFromGarage(this);
        seller.setCarInGarage(this, 0);
        buyer.minusCash(price);
        seller.minusCash(price);
    }


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
