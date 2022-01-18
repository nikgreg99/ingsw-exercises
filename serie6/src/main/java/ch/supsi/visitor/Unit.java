package ch.supsi.visitor;

public interface Unit {
    void printAll();
    void accept(Visitor visitor);
}
