package Workshop.net.java.main.handlers;

import Workshop.net.java.main.constants.ExceptionMessagesConstants;
import Workshop.net.java.main.enums.SpellType;
import Workshop.net.java.main.exceptions.NotEnoughEnergyException;
import Workshop.net.java.main.factories.SpellFactory;
import Workshop.net.java.main.interfaces.Spell;
import Workshop.net.java.main.interfaces.Unit;

public class CarrierCombatHandler extends BaseCombatHandler {
    private int spellCount;

    @Override
    public Spell generateAttack() throws NotEnoughEnergyException {
        Unit unit = super.getUnit();
        Spell spell = SpellFactory.createSpell(SpellType.BULLET_RAIN, unit.getAttackPoints());

        this.spellCount++;

        if (this.spellCount % 3 == 0) {
            return spell;
        } else {
            if (unit.getEnergyPoints() <= spell.getEnergyCost()) {
                throw new NotEnoughEnergyException(ExceptionMessagesConstants.NOT_ENOUGH_ENERGY_EXCEPTION_MESSAGE);
            }
        }

        unit.setEnergyPoints(unit.getEnergyPoints() - spell.getEnergyCost());

        return spell;
    }
}
