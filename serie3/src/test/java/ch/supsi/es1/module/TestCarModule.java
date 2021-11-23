package ch.supsi.es1.module;

import ch.supsi.es1.body.FakeBody;
import ch.supsi.es1.body.IBody;
import ch.supsi.es1.engine.FakeEngine;
import ch.supsi.es1.engine.IEngine;
import ch.supsi.es1.frame.CarbonFrame;
import ch.supsi.es1.frame.Frame;
import ch.supsi.es1.interior.Interior;
import ch.supsi.es1.interior.LeatherInterior;
import ch.supsi.es1.wheel.AlloyWheel;
import ch.supsi.es1.wheel.Wheel;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;

public class TestCarModule extends AbstractModule {

    private AbstractModule tireModule;

    public TestCarModule(AbstractModule tireModule) {
        this.tireModule = tireModule;
    }

    protected void configure(){
        bind(IEngine.class).to(FakeEngine.class);
        bind(IBody.class).to(FakeBody.class);
        bind(Frame.class).to(CarbonFrame.class);
        bind(Interior.class).to(LeatherInterior.class);
    }

    @Provides
    Wheel[] provideWheels(){
        Injector tireInjector = Guice.createInjector(tireModule);
        Wheel[] wheel = new Wheel[4];
        for(int i = 0; i < wheel.length; i++){
            wheel[i] = tireInjector.getInstance(AlloyWheel.class);
        }
        return wheel;
    }

}
