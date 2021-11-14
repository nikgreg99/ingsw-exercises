package ch.supsi.es1.list;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyListTest {

    private IMyList<String> testMyList;

    @Before
    public void intiList(){
        testMyList = new MyList<>();
        testMyList.addElement("Try 1");
        testMyList.addElement("Try 2");
    }

    @Test
    public void testGetElement(){
        assertEquals("Try 1",testMyList.getElement(0));
        assertEquals("Try 2",testMyList.getElement(1));
    }

    @Test
    public void testLength(){
        assertEquals(2,testMyList.length());
    }

}
