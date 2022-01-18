package ch.supsi.composite;

import org.junit.Before;
import org.junit.Test;

public class CompositeTest {

    private Composite humanResourceComposite;
    private Composite dtiComposite;

    @Before
    public void init(){
        humanResourceComposite = new Composite("Human Resources Composite");
        humanResourceComposite.add(new Office("Human Resources"));
        humanResourceComposite.add(new Person("Andrea"));
        humanResourceComposite.add(new Person("Davide"));
    }

    @Test
    public void testOneComposite(){
        humanResourceComposite.printAll();
    }

    @Test
    public void testTwoComposite(){

        dtiComposite = new Composite("DTI Composite");
        dtiComposite.add(new Department("DTI"));
        dtiComposite.add(new Person("Nicolas"));
        dtiComposite.add(new Person("Tiziano"));

        dtiComposite.add(humanResourceComposite);
        dtiComposite.printAll();
    }

}
