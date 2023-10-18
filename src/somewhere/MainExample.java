package somewhere;

import car.*;

import java.io.Closeable;
import java.util.Arrays;
import java.util.Scanner;

public class MainExample {

    public static void main(String[] args) {

        //Scanner scanner = new Jeep();
        //Car car = new Car();
        Car a = new Jeep();
        Car b = new Cabriolet(1, "", "", 0, true);
        Jeep secondLandrover = new Jeep();
        Cabriolet secondCabrio = new Cabriolet(1, "", "", 0, true);

        test(a);
        test(b);

        //Jeep[] jeeps = new Jeep[5];
        //Cabriolet[] cabriolets = new Cabriolet[5];
        //jeeps[0] = secondLandrover;
        //cabriolets[0] = secondCabrio;

        Car[] cars = new Car[2];
        cars[0] = a;
        cars[1] = b;

        for (Car car : cars) { //for each
            car.startEngine();
        }

        Airplane airplane = new Airplane();
        Refuelable transport = new Airplane();
        Refuelable transportSecond = new Jeep();
        Refuelable transportThird = new Cabriolet(1, "", "", 0, true);


        Refuelable[] refuelables = new Refuelable[3];
        refuelables[0] = transport;
        refuelables[1] = transportSecond;
        refuelables[2] = transportThird;

        for (Refuelable refuelable : refuelables) {
            refuelable.refuel();
        }


        Jeep landcruiser = new Jeep();
        Jeep landcruiserSecond = new Jeep();

        //landcruiser.id = 1;
        //landcruiserSecond.id = 2;
        //System.out.println(landcruiser.id);
        //System.out.println(landcruiserSecond.id);


        System.out.println(Jeep.MAX_SPEED);
        System.out.println(Math.E);
        System.out.println(Math.PI);

        System.out.println(Jeep.getRecomendedSpeed());

        System.out.println(Math.sqrt(16));



    }

    public static void test(Car car) {
        car.drift();
    }

}