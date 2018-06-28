package p03_Ferrari;

import p03_Ferrari.abstractImpl.AbstractCar;
import p03_Ferrari.constants.Constants;

public class Ferrari extends AbstractCar {

    public Ferrari(String driver) {
        super(Constants.FERRARI_MODEL, driver);
    }
}
