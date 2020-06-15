package pl.wsb.human;

import pl.wsb.animal.Animal;
import pl.wsb.car.Car;



public class Human {

    String firstName;
    String lastName;
    double weight;
    Animal pet;
    private Car vehicle;
    private double salary;
    private static String PASS = "mypass";

    public Human(String firstName, String lastName, double weight, Animal pet, Car vehicle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.pet = pet;
        this.vehicle = vehicle;
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
}
