package Workshop.net.java.main.factories;

import Workshop.net.java.main.comparators.UnitComparatorByHealthPoints;
import Workshop.net.java.main.comparators.UnitComparatorByName;
import Workshop.net.java.main.interfaces.Unit;

import java.util.Comparator;

public final class UnitComparatorFactory {

    private UnitComparatorFactory() {
    }

    public static Comparator<Unit> createComparatorByHealthPoints() {
        return new UnitComparatorByHealthPoints();
    }

    public static Comparator<Unit> createComparatorByName() {
        return new UnitComparatorByName();
    }
}
