package ch.supsi.visitor;


import ch.supsi.module.TracingModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;


import java.util.List;

public class VisitorTest {

    @Test
    public void testVisitor(){
        Visitor printVisitor = new PrintVisitor();
        Composite humanResourceComposite = new Composite("Composite");

    }

    @Test
    public void testVisitorWithInterceptor(){
        Injector injector = Guice.createInjector(new TracingModule());
        Visitor printVisitor = injector.getInstance(PrintVisitor.class);


        printVisitor.visitOffice(new Office("Human Resources"));
    }
}
