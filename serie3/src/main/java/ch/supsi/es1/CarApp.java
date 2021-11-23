package ch.supsi.es1;

import ch.supsi.es1.car.Car;
import ch.supsi.es1.module.CarModule;
import ch.supsi.es1.module.SummerTireModule;
import com.google.inject.Guice;
import com.google.inject.Injector;


public class CarApp {
    public static void main(String[] args) {
        Injector carInjector = Guice.createInjector(new CarModule(new SummerTireModule()));
        Car car = carInjector.getInstance(Car.class);
        System.out.println("Car weight: " + car.getWeight());
    }
}
