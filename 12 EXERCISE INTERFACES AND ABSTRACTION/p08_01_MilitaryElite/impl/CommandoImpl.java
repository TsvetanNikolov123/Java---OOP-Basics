package p08_01_MilitaryElite.impl;

import p08_01_MilitaryElite.contracts.Commando;
import p08_01_MilitaryElite.contracts.Mission;

import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {

    private Set<Mission> missions;

    public CommandoImpl(String id, String fistName, String lastName, double salary, String corps, Set<Mission> missions) {
        super(id, fistName, lastName, salary, corps);
        this.missions = missions;
    }

    @Override
    public String toString() {
        StringBuilder   commando = new StringBuilder(super.toString()).append(System.lineSeparator());

        commando
                .append("Missions:");

        for (Mission mission : this.missions) {
            commando
                    .append(System.lineSeparator())
                    .append("  ")
                    .append(mission);
        }

        return commando.toString();
    }
}
