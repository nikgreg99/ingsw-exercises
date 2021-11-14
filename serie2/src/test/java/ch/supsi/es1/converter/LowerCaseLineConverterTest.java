package ch.supsi.es1.converter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowerCaseLineConverterTest {

    LineConverter lowerCaseLineConverter = new LowerCaseLineConverter();

    @Test
    public void convertToLowerCaseTest() {
        String input = "CIAO";
        String outputExpected = "ciao";

        assertEquals(outputExpected, lowerCaseLineConverter.convert(input));
    }
}
