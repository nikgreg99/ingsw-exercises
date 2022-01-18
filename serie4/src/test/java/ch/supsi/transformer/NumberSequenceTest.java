package ch.supsi.transformer;

import ch.supsi.NumberSequencer;
import ch.supsi.printer.Printer;
import ch.supsi.printer.StdOutPrinter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;

import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class NumberSequenceTest {

    @InjectMocks
    private NumberSequencer numberSequencer;

    @Spy
    private FizzBuzzNumberTransformer numberTransformer;

    @Spy
    private StdOutPrinter printer;

    @Test
    public void testPrintNumbers(){
        ArgumentCaptor<String> stringArgument = ArgumentCaptor.forClass(String.class);

        numberSequencer.printNumbers(100);

        verify(numberTransformer,times(100)).transform(anyInt());
        verify(printer,times(100)).print(stringArgument.capture());

    }

    @Test(expected = RuntimeException.class)
    public void testNumberWithRuntimeException(){
        numberSequencer.printNumbers(-1);
        verify(numberTransformer,times(0)).transform(anyInt());
    }
}
