package pl.wsb.devices;

public class Car {

    String producer, model;
    Double engineCapacity;
    int horsePower;
    public double price;

    public Car(String producer, String model, Double engineCapacity, int horsePower, double price) {
        this.producer = producer;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.horsePower = horsePower;
        this.price = price;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", horsePower=" + horsePower +
                ", price=" + price +
                '}';
    }
}
