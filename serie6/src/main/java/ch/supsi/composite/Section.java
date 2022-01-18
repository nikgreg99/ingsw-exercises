package ch.supsi.composite;

public class Section implements Unit{

    private final String name;

    public Section(String name) {
        this.name = name;
    }

    @Override
    public void printAll() {
        System.out.println(String.format("Section: %n",name));
    }
}
