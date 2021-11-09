package ch.supsi.es1.printer;

import ch.supsi.es1.iterator.BackwardIterator;
import ch.supsi.es1.iterator.IMyIterator;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyBackwardPrinter extends MyPrinter {

    public MyBackwardPrinter(String filePath) throws IOException {
        super(new FileReader(filePath));
    }

    public MyBackwardPrinter(InputStreamReader inputStreamReader) throws IOException {
        super(inputStreamReader);
    }

    @Override
    IMyIterator<String> getIterator() {
        return new BackwardIterator<>(list);
    }
}
