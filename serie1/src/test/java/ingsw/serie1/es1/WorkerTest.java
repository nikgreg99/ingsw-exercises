package ingsw.serie1.es1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class WorkerTest {

   private Worker workerTest;
   private Worker workerTestException;

    @Before
    public void setUp(){
        workerTest = new Worker(10);
        workerTestException = new Worker(-2);
    }

    @Test
    public void testConversion(){
        assertEquals(4,Worker.conversion(8));
        assertEquals(16,Worker.conversion(5));
        assertEquals(-4,Worker.conversion(-8));
        assertEquals(-14,Worker.conversion(-5));
    }

    @Test
    public void testSequence() throws IllegalAccessException {
        assertEquals(6,workerTest.sequence());
    }

    @Test
    public void testSequenceException(){
        try{
            workerTestException.sequence();
            fail();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
