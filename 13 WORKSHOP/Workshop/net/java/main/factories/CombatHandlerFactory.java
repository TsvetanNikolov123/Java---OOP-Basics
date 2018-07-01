package Workshop.net.java.main.factories;

import Workshop.net.java.main.handlers.CarrierCombatHandler;
import Workshop.net.java.main.handlers.MarineCombatHandler;
import Workshop.net.java.main.interfaces.CombatHandler;

final class CombatHandlerFactory {

    private CombatHandlerFactory() {
    }

    static CombatHandler createCarrierCombatHandler() {
        return new CarrierCombatHandler();
    }

    static CombatHandler createMarineCombatHandler() {
        return new MarineCombatHandler();
    }
}
