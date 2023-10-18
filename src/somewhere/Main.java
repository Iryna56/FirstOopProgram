package somewhere;

import car.Cabriolet;
import car.Car;

public class Main {

    public static void main(String[] args) {
        //Car a = new Car(1, "BMW E34", "black", 0);
        //Car b = new Car(2, "TESLA X", "red", 0);

        //b.color = "red";

        //b.setColor("red");

        //String color = b.getColor();


        //System.out.println(a.id);
        //System.out.println(b.id);

        //System.out.println(a.model);
        //System.out.println(b.model);

        //System.out.println(a.color);
        //System.out.println(b.color);

        //hello();
        //abc();
        //int c = abc();
        //System.out.println(c);

        //a.drift();
        //b.drift();
//
        //a.getInfo();
        //b.getInfo();

        //a.go(10);
        //a.go(20);
        //a.go(200);
        //a.go(150);

        //a.getInfo();
//
        //a.setColor("yellow");
        //a.getInfo();


        //System.out.println("--------------");
        //System.out.println(a.getColor());
        //System.out.println("--------------"); //эта строка выводит на экран
//
        //System.out.println("Текущая скорость: " + a.getCurrentSpeed());
        //a.setCurrentSpeed(250);
        //System.out.println("Текущая скорость: " + a.getCurrentSpeed());
        //a.setCurrentSpeed(1000);
        //System.out.println("Текущая скорость: " + a.getCurrentSpeed());
//
        //a.startEngine();

        //a.startAfterCheck();

        //javadoc

        //a.model = "123";

        //В класс Car добавить поле типа int,
        //которое будет хранить стоимость автомобиля

        //1) приватный доступ
        //2) выдать гетеры и сетеры на это поле
        //3) создать метод, который принимает, число
        //это число - скидка на машину, изменить цену

        //Пример: машина стоит 1000 долларов
        //a.findSale(15)

        //После вызова метода стоимость машины должны быть 850 долларов

        //@Tkach1380

        //Person daniil = new Person("Даниил", 78, 120, 199);
        //daniil.printInfo();
        //daniil.goToWork();
//
        //System.out.println(daniil);
//

        //Car car = new Car(1, "BMW E34", "black", 0);
        //Car car1 = new Car(1, "BMW E34", "black", 0);
        Cabriolet cabriolet = new Cabriolet(1, "tel ran", "moon", 0, true);

        //car.drift();
        cabriolet.drift();
        cabriolet.isOpened = true;
        cabriolet.isOpened = false;

        Object object = new Object();

        //System.out.println(car.hashCode());
        //System.out.println(car.hashCode());
        //System.out.println(car1.hashCode());
        System.out.println(cabriolet.hashCode());

        System.out.println("----------");

        String a = "a";
        String ab = "ab";
        String abc = "abc";
        String abc1 = "abc";

        System.out.println(a.hashCode());
        System.out.println(ab.hashCode());
        System.out.println(abc.hashCode());
        System.out.println(abc1.hashCode());

        //хэшкод - числовое отображение содержимого объекта

        //если объекты равны по содержанию (по всем своим полям), то хэшкод будет равный
        //если объекты не равны по содержанию (по всем своим полям), то хэшкода будет не-равный
        //НОООООО
        //существуют коллизии
        //колизия - это эффект, когда два разных объекта имееют (случайно) одинаковый хэшкод

        // если объекты равны, то их хэшкоды 100% равны
        // если объекты не равны, то ничего не ясно

        // Если хэшкоды равны, то ничего не ясно
        // Если хэшкоды не равны, то объекты 100% не равны


    }

}