package ch.supsi.es1.converter;

public class LowerCaseLineConverter implements LineConverter {

    @Override
    public String convert(String line) {
        return line.toLowerCase();
    }
}
