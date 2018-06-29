package p08_01_MilitaryElite.impl;

import p08_01_MilitaryElite.contracts.Engineer;
import p08_01_MilitaryElite.contracts.Repair;

import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl  implements Engineer {

    private Set<Repair> repairs;

    public EngineerImpl(String id, String fistName, String lastName, double salary, String corps, Set<Repair> repairs) {
        super(id, fistName, lastName, salary, corps);
        this.repairs = repairs;
    }

    @Override
    public String toString() {
        StringBuilder   engineer = new StringBuilder(super.toString()).append(System.lineSeparator());

        engineer
                .append("Repairs:");

        for (Repair repair : this.repairs) {
            engineer
                    .append(System.lineSeparator())
                    .append("  ")
                    .append(repair);
        }

        return engineer.toString();
    }
}
