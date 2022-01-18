package ch.supsi.transformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzNumberTransformerTest {

    private FizzBuzzNumberTransformer fizzBuzzNumberTransformer = new FizzBuzzNumberTransformer();

    @Test
    public void testTransform(){
        assertEquals("Fizz",fizzBuzzNumberTransformer.transform(3));
        assertEquals("Buzz",fizzBuzzNumberTransformer.transform(5));
        assertEquals("FizzBuzz",fizzBuzzNumberTransformer.transform(15));
    }
}
