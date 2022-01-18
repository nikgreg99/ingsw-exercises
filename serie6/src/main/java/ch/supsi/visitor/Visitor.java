package ch.supsi.visitor;

import ch.supsi.composite.*;

public interface Visitor {

    void visitDepartment(Department department);
    void visitDivision(Division division);
    void visitOffice(Office office);
    void visitPerson(Person person);
    void visitSection(Section section);

}
