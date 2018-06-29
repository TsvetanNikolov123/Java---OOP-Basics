package p08_01_MilitaryElite.impl;

import p08_01_MilitaryElite.contracts.Private;

public class PrivateImpl extends SoldierImpl implements Private {

    private double salary;

    public PrivateImpl(String id, String fistName, String lastName, double salary) {
        super(id, fistName, lastName);
        this.salary = salary;
     }

    @Override
    public String toString() {
        return String.format("%s Salary: %.2f", super.toString(), this.salary);
    }
}
