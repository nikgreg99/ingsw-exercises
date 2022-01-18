package ingsw.serie1.es1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SequenceCacheTest {

    @Spy
    private HashMap<Integer,Worker> cache;

    @InjectMocks
    private SequenceCache sequenceCacheTest;

    @Test
    public void testLength(){
        assertEquals(6,sequenceCacheTest.length(10));
    }

    @Test
    public void testLengthException(){
        assertThrows(IllegalArgumentException.class,() -> sequenceCacheTest.length(-2));
    }

    @Test
    public void testLengthBehaviour(){
        int value = 10;

        assertEquals(6, sequenceCacheTest.length(value));

        //Test case when the object is not in the cache
        verify(cache,times(1)).containsKey(any());
        verify(cache,times(1)).put(anyInt(),any());
        verify(cache,times(1)).get(any());

        //Clear register invocations on cache
        Mockito.clearInvocations(cache);

        //Test case when the object is already in the cache
        assertEquals(6, sequenceCacheTest.length(value));
        verify(cache,times(1)).containsKey(any());
        verify(cache,times(0)).put(anyInt(),any());
        verify(cache,times(1)).get(any());
    }
}
