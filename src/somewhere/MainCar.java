package somewhere;

import car.Cabriolet;
import car.Car;
import car.Jeep;

public class MainCar {

    public static void main(String[] args) {
        //Car car = new Car();
        Cabriolet cabriolet = new Cabriolet(1, "cabrio", "black", 0, true);
        Jeep jeep = new Jeep();

        //car.drift();
        cabriolet.drift();
        jeep.drift();

    }


}