package ch.supsi.es1.converter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpperCaseLineConverterTest {

    LineConverter upperCaseLineConverter = new UpperCaseLineConverter();

    @Test
    public void convertToUpperCaseTest(){
        String input = "ciao";
        String outputExpected = "CIAO";

        assertEquals(outputExpected, upperCaseLineConverter.convert(input));
    }

}
