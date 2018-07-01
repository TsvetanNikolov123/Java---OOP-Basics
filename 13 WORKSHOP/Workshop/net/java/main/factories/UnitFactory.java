package Workshop.net.java.main.factories;

import Workshop.net.java.main.enums.UnitType;
import Workshop.net.java.main.interfaces.Position;
import Workshop.net.java.main.interfaces.Unit;
import Workshop.net.java.main.models.PositionImpl;
import Workshop.net.java.main.models.units.Carrier;
import Workshop.net.java.main.models.units.Marine;

public final class UnitFactory {

    private UnitFactory() {
    }

    public static Unit createUnit(UnitType unitType, String name, int xPosition, int yPosition) {
        Position position;
        switch (unitType) {
            case MARINE:
                position = new PositionImpl(xPosition, yPosition);
                return new Marine(name,
                        position,
                        CombatHandlerFactory.createMarineCombatHandler());
            case CARRIER:
                position = new PositionImpl(xPosition, yPosition);
                return new Carrier(name,
                        position,
                        CombatHandlerFactory.createCarrierCombatHandler());
            default:
                return null;
        }
    }
}
