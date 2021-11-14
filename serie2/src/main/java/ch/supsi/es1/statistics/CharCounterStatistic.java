package ch.supsi.es1.statistics;

import ch.supsi.es1.iterator.IMyIterator;

import java.io.IOException;

public class CharCounterStatistic implements Statistic{

    private IMyIterator<String> iterator;
    private final char targetChar;

    public CharCounterStatistic(char ch)  {
        this.targetChar = ch;
    }

    private int computeCharFrequency() throws IOException {
        int charCounter = 0;
        while (iterator.hasMoreElements()){
            String currentLine = iterator.nextElement();
            for(char character: currentLine.toCharArray()){
                if(character == targetChar){
                    charCounter++;
                }
            }
        }
        return charCounter;
    }

    @Override
    public void setIterator(IMyIterator<String> iterator) {
        this.iterator = iterator;
    }

    @Override
    public String report(int number) throws IOException {
        return String.format("Statistic number %d: found %d '%c' occurrences",number, computeCharFrequency(), targetChar);
    }
}
