package ch.supsi.visitor;

public class Department implements Unit {

    private final String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void printAll() {
        System.out.println(String.format("Department: %s",name));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDepartment(this);
    }
}
