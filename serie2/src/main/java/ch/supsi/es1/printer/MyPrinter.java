package ch.supsi.es1.printer;

import ch.supsi.es1.converter.LineConverter;
import ch.supsi.es1.iterator.IMyIterator;
import ch.supsi.es1.list.IMyList;
import ch.supsi.es1.list.MyList;
import ch.supsi.es1.statistics.Statistic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class MyPrinter implements IPrinter{

    protected IMyList<String> list;
    private Reader streamReader;
    private List<LineConverter> lineConvertersList;
    private List<Writer> writerList;
    private List<Statistic> statisticList;

    public MyPrinter(Reader streamReader) throws IOException {
        this.streamReader = streamReader;
        loadLines(this.streamReader);
        lineConvertersList = new ArrayList<>();
        writerList = new ArrayList<>();
        statisticList = new ArrayList<>();
    }

    abstract IMyIterator<String> getIterator();

    @Override
    public void print() throws IOException {
        IMyIterator<String> iterator = getIterator();
        while(iterator.hasMoreElements()){
                String currentLine = iterator.nextElement();
                //Apply all transform to currentString
                for(LineConverter converter: lineConvertersList){
                    currentLine = converter.convert(currentLine);
                }
                for(Writer writer: writerList){
                    writer.write(currentLine + System.lineSeparator());
                    writer.flush();
                }
        }
    }

    @Override
    public void addLineConverter(LineConverter lineConverter){
        lineConvertersList.add(lineConverter);
    }

    @Override
    public void addStream(Writer printStream){
       writerList.add(printStream);
    }


    private void loadLines(Reader streamReader) throws IOException {
        list = new MyList<>();
        BufferedReader lineBufferReader = new BufferedReader(streamReader);
        String line;
        while((line = lineBufferReader.readLine()) != null){
            list.addElement(line);
        }
    }

    @Override
    public void displayStatistics(List<Statistic> statistics) throws IOException {
        getIterator().rewind();
        for(Statistic statistic: statistics){
            statistic.setIterator(getIterator());
        }
        int statCounter = 0;
        if(!statistics.isEmpty()){
            for(Statistic statistic: statistics){
                System.out.println(statistic.report(++statCounter));
            }
        }
    }
    
}

