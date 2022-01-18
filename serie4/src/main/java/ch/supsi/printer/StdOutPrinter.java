package ch.supsi.printer;

public class StdOutPrinter implements Printer{
    @Override
    public void print(String output) {
        System.out.print(output + System.lineSeparator());
    }
}
