package ch.supsi.es1.car;

import ch.supsi.es1.body.IBody;
import ch.supsi.es1.engine.IEngine;
import ch.supsi.es1.frame.Frame;
import ch.supsi.es1.interior.Interior;
import ch.supsi.es1.wheel.IWheel;

import com.google.inject.Inject;

public class Car {

    @Inject
    private IEngine engine;
    @Inject
    private IBody body;
    @Inject
    private Frame frame;
    @Inject
    private Interior interior;
    @Inject
    private IWheel[] wheels;

    public double getWeight(){
        double totalWeight = engine.getWeight() + body.getWeight() + frame.getWeight() + interior.getWeight();
        for(IWheel wheel: wheels){
            totalWeight+= wheel.getWeight();
        }
        return totalWeight;
    }
}
