package ch.supsi.es1.converter;

public class UpperCaseLineConverter implements LineConverter {

    @Override
    public String convert(String line) {
        return line.toUpperCase();
    }
}
