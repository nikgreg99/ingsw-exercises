package ch.supsi.es1.printer;

import ch.supsi.es1.iterator.ForwardIterator;
import ch.supsi.es1.iterator.IMyIterator;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyForwardPrinter extends MyPrinter {

    public MyForwardPrinter(String filePath) throws IOException {
        super(new FileReader(filePath));
    }

    public MyForwardPrinter(InputStreamReader inputStreamReader) throws IOException {
        super(inputStreamReader);
    }

    @Override
    IMyIterator<String> getIterator() {
        return new ForwardIterator<>(list);
    }
}
