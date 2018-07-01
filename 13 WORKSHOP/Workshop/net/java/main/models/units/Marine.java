package Workshop.net.java.main.models.units;

import Workshop.net.java.main.constants.GameConstants;
import Workshop.net.java.main.interfaces.CombatHandler;
import Workshop.net.java.main.interfaces.Position;

public class Marine extends BaseUnit {


    public Marine(String name, Position position, CombatHandler combatHandler) {
        super(name, GameConstants.MARINE_RANGE, position,
                GameConstants.MARINE_HEALTH_POINTS, GameConstants.MARINE_ENERGY_POINTS,
                GameConstants.MARINE_ATTACK_POINTS,
                GameConstants.MARINE_DEFENCE_POINTS, combatHandler);
    }
}
