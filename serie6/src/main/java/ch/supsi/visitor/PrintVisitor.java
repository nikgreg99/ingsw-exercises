package ch.supsi.visitor;

import ch.supsi.tracer.TraceDurationCall;

public class PrintVisitor implements Visitor {



    @Override
    @TraceDurationCall
    public void visitDepartment(Department department) {
        department.printAll();
    }

    @Override
    @TraceDurationCall
    public void visitDivision(Division division) {
        division.printAll();
    }

    @Override
    @TraceDurationCall
    public void visitOffice(Office office) {
        office.printAll();
    }

    @Override
    @TraceDurationCall
    public void visitPerson(Person person) {
        person.printAll();
    }

    @Override
    @TraceDurationCall
    public void visitSection(Section section) {
        section.printAll();
    }
}
