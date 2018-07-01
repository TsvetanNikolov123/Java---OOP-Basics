package Workshop.net.java.main.interfaces;

import Workshop.net.java.main.exceptions.InvalidPositionException;
import Workshop.net.java.main.exceptions.InvalidUnitTypeException;
import Workshop.net.java.main.exceptions.NotEnoughEnergyException;
import Workshop.net.java.main.exceptions.UnitNotExistException;

public interface Command {

    String execute(String[] args) throws InvalidUnitTypeException, InvalidPositionException, UnitNotExistException, NotEnoughEnergyException;
}
