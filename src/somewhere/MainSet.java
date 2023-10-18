package somewhere;

import car.Cabriolet;
import car.EngineType;
import car.GasStation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
        //Set<String> children = new HashSet<>();
        //
        //children.add("Иван");
        //children.add("Андрей");
        //children.add("Петр");
        //children.add("Елена");
        //children.add("Егор");
        //
        //Set<Integer> numbers = new HashSet<>();
        //numbers.add(5);
        //numbers.add(3);
        //numbers.add(2);
        //numbers.add(6);
        //numbers.add(10);
        //numbers.add(1000000000);
        //numbers.add(100000000);
        //numbers.add(10000000);
        //numbers.add(1000000);
        //numbers.add(100000);
        //numbers.add(10000);
        //
        //
        //System.out.println(children);
        //System.out.println(numbers);

        GasStation gasStation = new GasStation();

        List<Cabriolet> cabriolets = new ArrayList<>();
        Cabriolet cabrioletFirst = new Cabriolet(1, "BMW", "black", 0, true);
        cabrioletFirst.setEngineType(EngineType.GAS);
        Cabriolet cabrioletSecond = new Cabriolet(1, "BMW", "black", 0, true);
        cabrioletSecond.setEngineType(EngineType.ELECTRO);
        cabriolets.add(cabrioletFirst);
        cabriolets.add(cabrioletSecond);

        gasStation.setCabriolets(cabriolets);

        Set<EngineType> engineTypes = new HashSet<>();
        engineTypes.add(EngineType.DIESEL);
        engineTypes.add(EngineType.GAS);
        engineTypes.add(EngineType.MECHANIC);

        gasStation.setAvailableEngineTypes(engineTypes);

        gasStation.refuelAll();
    }
}
