package ch.supsi.composite;

public class Office implements Unit{

    private final String name;

    public Office(String name) {
        this.name = name;
    }

    @Override
    public void printAll() {
        System.out.println(String.format("Office: %s",name));
    }
}
