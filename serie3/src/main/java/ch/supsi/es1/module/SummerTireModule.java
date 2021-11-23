package ch.supsi.es1.module;

import ch.supsi.es1.tire.ITire;
import ch.supsi.es1.tire.SummerTire;
import com.google.inject.AbstractModule;

public class SummerTireModule extends AbstractModule {

    @Override
    protected void configure(){
        bind(ITire.class).to(SummerTire.class);
    }
}
