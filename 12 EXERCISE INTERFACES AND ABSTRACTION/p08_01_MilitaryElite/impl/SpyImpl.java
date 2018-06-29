package p08_01_MilitaryElite.impl;

import p08_01_MilitaryElite.contracts.Spy;

public class SpyImpl extends SoldierImpl implements Spy {

    private String codeNumber;

    public SpyImpl(String id, String fistName, String lastName, String codeNumber) {
        super(id, fistName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        StringBuilder spy = new StringBuilder(super.toString())
                .append(System.lineSeparator());

        spy.append(String.format("Code Number: %s", this.codeNumber));

        return spy.toString();
    }
}
