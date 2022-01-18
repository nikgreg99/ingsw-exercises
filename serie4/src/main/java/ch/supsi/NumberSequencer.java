package ch.supsi;

import ch.supsi.printer.Printer;
import ch.supsi.transformer.NumberTransformer;

public class NumberSequencer {
    private NumberTransformer numberTransformer;
    private Printer printer;

    public NumberSequencer(NumberTransformer numberTransformer, Printer printer) {
        this.numberTransformer = numberTransformer;
        this.printer = printer;

    }
    public void printNumbers(int limit) {
        if (limit < 1) {
         throw new RuntimeException("limit must be >= 1");
        }
        for (int i = 1; i <= limit; i++)
        {
            try {
                printer.print(numberTransformer.transform(i));
        } catch (Exception e) {

            }
        }
    }
}

