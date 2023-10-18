package somewhere;

import car.Cabriolet;
import car.Car;
import car.GasStation;
import car.Jeep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MainArrayList {

    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        List<Cabriolet> cabriolets = new Vector<>();



        Cabriolet firstCabriolet = new Cabriolet(1, "BMW", "black", 0, false);
        Cabriolet secondCabriolet = new Cabriolet(2, "Volvo", "yellow", 0, true);

        cabriolets.add(firstCabriolet);
        cabriolets.add(secondCabriolet);

        gasStation.setCabriolets(cabriolets);

        gasStation.printInfoAboutQueue();

        gasStation.refuelAll();

        gasStation.printInfoAboutQueue();

        gasStation.refuelAll();

    }
}

