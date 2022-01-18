package ch.supsi.es1;

import ch.supsi.es1.car.Car;
import ch.supsi.es1.module.CarModule;
import ch.supsi.es1.module.SummerTireModule;
import ch.supsi.es1.module.WinterTireModule;
import com.google.inject.Guice;
import com.google.inject.Injector;


public class CarApp {
    public static void main(String[] args) {
        Injector winterCarInjector = Guice.createInjector(new CarModule(new SummerTireModule()));
        Car winterCar = winterCarInjector.getInstance(Car.class);
        System.out.println("Winter Car weight: " + winterCar.getWeight());

        Injector summerCarInjector = Guice.createInjector(new CarModule(new WinterTireModule()));
        Car summerCar = summerCarInjector.getInstance(Car.class);
        System.out.println("Summer Car weight: " + summerCar.getWeight());
    }
}
