package ch.supsi.module;

import ch.supsi.tracer.TraceDurationCall;
import ch.supsi.tracer.TracingInterceptor;
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;


public class TracingModule extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(Matchers.any(),
                Matchers.annotatedWith(TraceDurationCall.class),
                new TracingInterceptor());
    }
}
