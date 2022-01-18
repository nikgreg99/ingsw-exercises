package ch.supsi.visitor;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Unit {

    private List<Unit> units;
    private final String name;

    public Composite(String name) {
        units = new ArrayList<>();
        this.name = name;
    }

    public void add(Unit child){
        units.add(child);
    }

    public void remove(Unit child){
        units.remove(child);
    }


    @Override
    public void printAll() {
        for(Unit unit: units){
            unit.printAll();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        for(Unit unit: units){
            unit.accept(visitor);
        }
    }
}
