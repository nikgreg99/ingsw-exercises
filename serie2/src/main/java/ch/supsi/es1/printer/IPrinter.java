package ch.supsi.es1.printer;

import ch.supsi.es1.converter.LineConverter;
import ch.supsi.es1.statistics.Statistic;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public interface IPrinter {

    void print() throws IOException;
    void addLineConverter(LineConverter lineConverter);
    void addStream(Writer printFormat);
    void displayStatistics(List<Statistic> statistics) throws IOException;
}
