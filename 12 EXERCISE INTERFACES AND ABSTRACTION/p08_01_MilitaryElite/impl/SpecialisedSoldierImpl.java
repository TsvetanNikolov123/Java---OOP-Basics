package p08_01_MilitaryElite.impl;

import p08_01_MilitaryElite.contracts.SpecialisedSoldier;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private static final String AIR_FORCES_CORPS_TYPE = "Airforces";
    private static final String MARINES_CORPS_TYPE = "Marines";

    private String corps;

    protected SpecialisedSoldierImpl(String id, String fistName, String lastName, double salary, String corps) {
        super(id, fistName, lastName, salary);
        this.setCorps(corps);
    }

    private void setCorps(String corps) {
        if (!AIR_FORCES_CORPS_TYPE.equals(corps) && !MARINES_CORPS_TYPE.equals(corps)){
            throw new IllegalArgumentException();
        }

        this.corps = corps;
    }

    @Override
    public String toString() {
        StringBuilder specialisedSoldier = new StringBuilder(super.toString())
                .append(System.lineSeparator());

        specialisedSoldier.append(String.format("Corps: %s", this.corps));

        return specialisedSoldier.toString();
    }
}
