package ch.supsi.tracer;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TracingInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        long start = System.nanoTime();
        Object invokedObject = methodInvocation.proceed();

        long end = System.nanoTime();
        System.out.println("Duration time: " + (end - start));

        return invokedObject;
    }
}
