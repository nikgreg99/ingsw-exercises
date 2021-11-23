package ch.supsi.es1.car;

import ch.supsi.es1.module.TestCarModule;
import ch.supsi.es1.module.WinterTireModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarTest {

    @Test
    public void testGetWeight(){
        double expectedCarWeight = 74.0;

        Injector testCarInjector = Guice.createInjector(new TestCarModule(new WinterTireModule()));
        Car testCar = testCarInjector.getInstance(Car.class);
        assertEquals(expectedCarWeight,testCar.getWeight());
    }
}
