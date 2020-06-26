package pl.wsb.devices;

import pl.wsb.human.Human;

public class Phone extends Device {

    public Phone(String producer, String model, int yearOfProduction, double price) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("TURU TU TUU TUUUuuu, phone is switched on.");
    }


    @Override
    public boolean sell(Human buyer, Human seller) throws Exception {
        if (seller.getMobile().price<= buyer.getCash()) {
            buyer.minusCash(seller.getMobile().price);
            seller.plusCash(seller.getMobile().price);
            buyer.setMobile(seller.getMobile());
            seller.setMobile(null);
            System.out.println("Success, you have sold your phone to" + seller.toString());
            return true;
        } else {
            System.out.println("Not enough cash");
            return false;
        }
    }


}
