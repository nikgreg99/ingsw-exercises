package ch.supsi.visitor;

public class Section implements Unit {

    private final String name;

    public Section(String name) {
        this.name = name;
    }

    @Override
    public void printAll() {
        System.out.println(String.format("Section: %n",name));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }
}
