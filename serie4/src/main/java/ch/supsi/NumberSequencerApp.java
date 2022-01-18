package ch.supsi;

import ch.supsi.printer.StdOutPrinter;
import ch.supsi.transformer.FizzBuzzNumberTransformer;

public class NumberSequencerApp {
    public static void main(String[] args) {
        NumberSequencer numberSequencer = new NumberSequencer(new FizzBuzzNumberTransformer(), new StdOutPrinter());
        numberSequencer.printNumbers(100);
    }
}
