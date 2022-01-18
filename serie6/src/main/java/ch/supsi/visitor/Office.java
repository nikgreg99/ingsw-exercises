package ch.supsi.visitor;

public class Office implements Unit {

    private final String name;

    public Office(String name) {
        this.name = name;
    }

    @Override
    public void printAll() {
        System.out.println(String.format("Office: %s",name));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitOffice(this);
    }
}
