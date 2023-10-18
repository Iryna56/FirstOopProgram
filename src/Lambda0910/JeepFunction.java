package Lambda0910;

import car.Jeep;

import java.util.function.Function;

public class JeepFunction implements Function<String, Jeep> {
    @Override
    public Jeep apply(String s) {
        Jeep jeep = new Jeep();
        jeep.setModel(s);
        return jeep;
    }
}
