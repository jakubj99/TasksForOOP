package pl.wsb.creatures;

import pl.wsb.creatures.Animal;
import pl.wsb.devices.Car;
import pl.wsb.devices.Phone;


public class Human {

    String firstName;
    String lastName;
    double weight;
    Animal pet;
    private Car vehicle;
    private Car[] garage;
    private Phone mobile;
    private double salary;
    private static String PASS = "mypass";
    protected Double cash;

    public Human(String firstName, String lastName, double weight, Animal pet, Car vehicle, Phone mobile, double salary, Double cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.pet = pet;
        this.vehicle = vehicle;
        this.mobile = mobile;
        this.salary = salary;
        this.cash = cash;
    }

    public Human(String firstName, String lastName, double weight, Animal pet, Car[] garage, Phone mobile, double salary, Double cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.pet = pet;
        this.garage = garage;
        this.mobile = mobile;
        this.salary = salary;
        this.cash = cash;
    }

    public Human() {
        int DEFAULT_GARAGE = 5;
        this.garage = new Car[DEFAULT_GARAGE];
    }

    public Phone getMobile() {
        return mobile;
    }

    public void setMobile(Phone mobile) {
        this.mobile = mobile;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public void plusCash(Double cash) {
        this.cash += cash;
    }

    public void minusCash(Double cash) {
        this.cash += cash;
    }

    public double getSalary(String pass) {
        if (pass ==  PASS){
            return salary;
        }else{
            return Double.parseDouble(null);
        }
    }

    public void setSalary(Double salary, String pass) {
        if (pass.equals(PASS) && salary > 0) {
            this.salary = salary;
            System.out.println("New salary: " + salary);
            System.out.println("Remember to update your TAX info...");
        } else
            System.out.println("Salary has not been changed.");
    }

    public Car getVehicle() {
        return vehicle;
    }

    public void setVehicle(Car vehicle) {
        if (salary > getVehicle().price){
            System.out.println("congratz you can buy this car");
        }else if (salary > (getVehicle().price / 12)){
            System.out.println("you can lease this car");
        }else{
            System.out.println("go to college and find new work or ask to the rise");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weight=" + weight +
                ", pet=" + pet +
                ", vehicle=" + vehicle +
                ", mobile=" + mobile +
                ", salary=" + salary +
                ", cash=" + cash +
                '}';
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Double valueOfCars() {
        Double value = 0.0;
        for (Car car : garage) {
            if (car != null) {
                value += car.price;
            }
        }
        return value;
    }

    public Car getCarFromGarage(Integer index) {
        return this.garage[index];
    }

    public void setCarInGarage(Car car, Integer index) {
        this.garage[index] = car;
    }

    public boolean hasACarInGarage(Car newCar) {
        for(Car car : garage){
            if(car == newCar){
                return true;
            }
        }
        return false;
    }

    public boolean hasAFreePlaceInGarage() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCarFromGarage(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == car) {
                garage[i] = null;
            }
        }
    }

}
