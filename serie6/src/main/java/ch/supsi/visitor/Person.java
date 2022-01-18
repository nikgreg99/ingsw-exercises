package ch.supsi.visitor;

public class Person implements Unit {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void printAll() {
        System.out.println(String.format("Person: %s",name));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPerson(this);
    }
}
