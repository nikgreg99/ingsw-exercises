package ch.supsi.composite;

public class Person implements Unit {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void printAll() {
        System.out.println(String.format("Person: %s",name));
    }
}
