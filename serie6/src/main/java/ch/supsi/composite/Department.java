package ch.supsi.composite;

public class Department implements Unit{

    private final String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void printAll() {
        System.out.println(String.format("Department: %s",name));
    }
}
