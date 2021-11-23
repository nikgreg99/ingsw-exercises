package ch.supsi.es1.module;

import ch.supsi.es1.tire.ITire;
import ch.supsi.es1.tire.WinterTire;
import com.google.inject.AbstractModule;

public class WinterTireModule extends AbstractModule {

    @Override
    protected void configure(){
        bind(ITire.class).to(WinterTire.class);
    }
}
