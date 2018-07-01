package Workshop.net.java.main.factories;

import Workshop.net.java.main.enums.SpellType;
import Workshop.net.java.main.interfaces.Spell;
import Workshop.net.java.main.models.spells.BulletRain;
import Workshop.net.java.main.models.spells.RageShoot;

public final class SpellFactory {

    private SpellFactory() {
    }

    public static Spell createSpell(SpellType type, int damage) {
        switch (type) {
            case RAGE_SHOOT:
                return new RageShoot(damage);
            case BULLET_RAIN:
                return new BulletRain(damage);
            default:
                return null;
        }
    }
}
