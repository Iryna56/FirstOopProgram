package Lambda0910;

import car.Cabriolet;
import car.Car;
import car.Jeep;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MainLambda {
    public static void main(String[] args) {
        Jeep jeep = new Jeep();

        Car car = new Cabriolet(1, "", "", 1, true);

        int a = 4;
        int b = 5;

        if (a > 5) {
            Car volvo = new Car() {
                @Override
                public void drift() {
                    System.out.println(b);

                }
            };
            volvo.drift();

        } else {
            Car volvo = new Car() {
                @Override
                public void drift() {
                    System.out.println(a);

                }
            };
            volvo.drift();
        }


        Car bmw = new Car() {
            @Override
            public void drift() {
                System.out.println("Тут какой-то особенный дрифт");

            }
        };// запрещено создавать обьекты абстрактного класса

        Car volvo = new Car() {
            @Override
            public void drift() {

            }
        };
        /* анонимные классы применяются к примеру в библиотеке(например приложение занимается рисованием, и в нем
        есть абстрактные классы, то можно сделать следующее, взять абстрактный класс, унаследоваться от него, реализовать абстрактные методы,
        а можно создать обьект абстрактного класса, точнее создать анонимный класс.

         */
        System.out.println(bmw.getClass());
        System.out.println(volvo.getClass());
        List<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Как жизнь");
        list.add("Как дела");

        Consumer<String> stringConsumer = new Consumer<String>() {   // здесь сразу создается анонимный класс
            @Override
            public void accept(String s) {
                System.out.println(s);
                System.out.println("Вероятно, вы хотели написать вот эту строку");
            }
        };


        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            stringConsumer.accept(str);
        }

        // 50 строчек кода спустя

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            stringConsumer.accept(str);
        }


        stringConsumer.accept("Как дела");
        stringConsumer.accept("Привет, мир");

        Function<String, Jeep> jeepFunction = new Function<String, Jeep>() {
            @Override
            public Jeep apply(String s) {
                Jeep jeep1 = new Jeep();
                jeep1.setModel(s);
                return jeep1;
            }
        };

        Jeep jeepVolvo = jeepFunction.apply("volvo");
        System.out.println(jeepVolvo);

        for (int i = 0; i < list.size(); i++) {
            Jeep jeep1 = jeepFunction.apply(list.get(i));
            System.out.println(jeep1);

        }

        JeepFunction jeepFunction1 = new JeepFunction();
        Jeep jeep1 = jeepFunction1.apply("String");


    }

}
