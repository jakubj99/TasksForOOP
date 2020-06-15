package pl.wsb.devices;

public class CompareCars{

    public void compareCars(Car car1, Car car2){
        if (car1.equals(car2)){
            System.out.println("cars are the same");
        }else{
            System.out.println("cars are different \n" + "Car no 1: " + car1 + "\nCar no 2: " + car2 );
        }
    }
}
