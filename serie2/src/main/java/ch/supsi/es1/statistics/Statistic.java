package ch.supsi.es1.statistics;

import ch.supsi.es1.iterator.IMyIterator;

import java.io.IOException;

public interface Statistic {

    void setIterator(IMyIterator<String> reader);
    //number specifies the number of statistics to print
    String report(int number) throws IOException;
}
