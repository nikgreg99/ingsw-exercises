package ch.supsi.es2;


import ch.supsi.es1.converter.UpperCaseLineConverter;
import ch.supsi.es1.printer.IPrinter;
import ch.supsi.es1.printer.MyBackwardPrinter;
import ch.supsi.es1.printer.MyForwardPrinter;
import ch.supsi.es1.statistics.CharCounterStatistic;
import ch.supsi.es1.statistics.Statistic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PrinterApp {
    public static void main(String[] args) throws IOException {
        InputStream linesLocation = PrinterApp.class.getClassLoader().getResourceAsStream("lines");
        IPrinter linePrinter = new MyBackwardPrinter(new InputStreamReader(linesLocation));

        linePrinter.addLineConverter(new UpperCaseLineConverter());
        linePrinter.addStream(new BufferedWriter(new OutputStreamWriter(System.out)));
        linePrinter.print();

        List<Statistic> statisticList = new ArrayList<>();
        statisticList.add(new CharCounterStatistic('B'));
        linePrinter.displayStatistics(statisticList);
    }
}
