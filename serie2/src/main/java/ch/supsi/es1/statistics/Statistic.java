package ch.supsi.es1.statistics;

import ch.supsi.es1.iterator.IMyIterator;

import java.io.IOException;

public interface Statistic {

    void setIterator(IMyIterator<String> reader);
    String report(int number) throws IOException;
}
