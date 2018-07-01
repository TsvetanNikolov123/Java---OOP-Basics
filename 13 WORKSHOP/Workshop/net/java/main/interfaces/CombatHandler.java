package Workshop.net.java.main.interfaces;

import Workshop.net.java.main.exceptions.NotEnoughEnergyException;

import java.util.List;

public interface CombatHandler {

    void setUnit(Unit unit);

    Unit pickNextTarget(List<Unit> targetCandidates);

    Spell generateAttack() throws NotEnoughEnergyException;
}
