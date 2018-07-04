package Workshop.net.java.main.commands;

import Workshop.net.java.main.exceptions.InvalidPositionException;
import Workshop.net.java.main.exceptions.UnitNotExistException;
import Workshop.net.java.main.interfaces.Battleground;
import Workshop.net.java.main.interfaces.Command;
import Workshop.net.java.main.interfaces.Repository;
import Workshop.net.java.main.interfaces.Unit;

import static Workshop.net.java.main.constants.ExceptionMessagesConstants.NOT_EXISTING_UNIT_EXCEPTION_MESSAGE;

public class MoveCommand implements Command {
    private Battleground battleground;
    private Repository<Unit> unitRepository;

    public MoveCommand(Battleground battleground, Repository<Unit> unitRepository) {
        this.battleground = battleground;
        this.unitRepository = unitRepository;
    }

    @Override
    public String execute(String[] args) throws UnitNotExistException, InvalidPositionException {
        String unitName = args[1];
        int xPosition = Integer.parseInt(args[2]);
        int yPosition = Integer.parseInt(args[3]);

        Unit unit = this.unitRepository.findByName(unitName);

        if (unit == null) {
            throw new UnitNotExistException(String.format(NOT_EXISTING_UNIT_EXCEPTION_MESSAGE, unitName));
        }

        this.battleground.move(unit, xPosition, yPosition);

        return String.format("%s moved to %s", unit.getName(), unit.getPosition().toString());
    }
}