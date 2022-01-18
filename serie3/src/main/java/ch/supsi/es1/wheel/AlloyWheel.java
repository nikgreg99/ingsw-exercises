package ch.supsi.es1.wheel;

import ch.supsi.es1.tire.ITire;
import com.google.inject.Inject;

public class AlloyWheel implements IWheel {

    @Inject
    private ITire tire;

    @Override
    public double getWeight() {
        return 10 + tire.getWeight();
    }
}
