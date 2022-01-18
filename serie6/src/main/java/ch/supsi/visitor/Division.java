package ch.supsi.visitor;

public class Division implements Unit {

    private final String name;

    public Division(String name) {
        this.name = name;
    }

    @Override
    public void printAll() {
        System.out.println(String.format("Division: %s",name));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDivision(this);
    }
}
