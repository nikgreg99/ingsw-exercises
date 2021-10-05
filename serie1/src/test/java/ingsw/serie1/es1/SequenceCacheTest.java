package ingsw.serie1.es1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceCacheTest {

    private SequenceCache sequenceCacheTest;

    @Before
    public void setUp(){
        sequenceCacheTest = new SequenceCache();
    }

    @Test
    public void testLength(){
        assertEquals(6,sequenceCacheTest.length(10));
    }

    @Test
    public void testLengthException(){
        assertThrows(IllegalArgumentException.class,() -> sequenceCacheTest.length(-2));
    }
}
