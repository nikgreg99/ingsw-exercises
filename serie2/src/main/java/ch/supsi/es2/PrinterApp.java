package ch.supsi.es2;

import ch.supsi.es1.converter.LowerCaseLineConverter;
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
        InputStream backwardLinesLocation = PrinterApp.class.getClassLoader().getResourceAsStream("lines");
        InputStream forwardLinesLocation = PrinterApp.class.getClassLoader().getResourceAsStream("lines");
        //Backward Printer
        IPrinter backwardLinePrinter = new MyBackwardPrinter(new InputStreamReader(backwardLinesLocation));
        //Display output to standard output
        backwardLinePrinter.addLineConverter(new UpperCaseLineConverter());
        backwardLinePrinter.addStream(new BufferedWriter(new OutputStreamWriter(System.out)));
        backwardLinePrinter.print();
        //Display the number of 'B' founded in the text
        List<Statistic> backwardStatisticList = new ArrayList<>();
        backwardStatisticList.add(new CharCounterStatistic('B'));
        backwardLinePrinter.displayStatistics(backwardStatisticList);

        System.out.println(System.lineSeparator());

        //Forward Printer
        IPrinter forwardLinePrinter = new MyForwardPrinter(new InputStreamReader(forwardLinesLocation));
        //Display output to standard output
        forwardLinePrinter.addLineConverter(new LowerCaseLineConverter());
        forwardLinePrinter.addStream(new BufferedWriter(new OutputStreamWriter(System.out)));
        forwardLinePrinter.print();

        List<Statistic> forwardStatisticList = new ArrayList<>();
        forwardStatisticList.add(new CharCounterStatistic('i'));
        forwardLinePrinter.displayStatistics(forwardStatisticList);


    }
}
