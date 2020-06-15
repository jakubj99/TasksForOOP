package pl.wsb.devices;

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
}
