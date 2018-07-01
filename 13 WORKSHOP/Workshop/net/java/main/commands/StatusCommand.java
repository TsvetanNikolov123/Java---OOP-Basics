package Workshop.net.java.main.commands;

import Workshop.net.java.main.exceptions.UnitNotExistException;
import Workshop.net.java.main.interfaces.Command;
import Workshop.net.java.main.interfaces.Repository;
import Workshop.net.java.main.interfaces.Unit;

import static Workshop.net.java.main.constants.ExceptionMessagesConstants.NOT_EXISTING_UNIT_EXCEPTION_MESSAGE;

public class StatusCommand implements Command {
    private Repository<Unit> unitRepository;

    public StatusCommand(Repository<Unit> unitRepository) {
        this.unitRepository = unitRepository;
    }

    @Override
    public String execute(String[] args) throws UnitNotExistException {
        String unitName = args[1];

        Unit unit = this.unitRepository.findByName(unitName);

        if (unit == null) {
            throw new UnitNotExistException(String.format(NOT_EXISTING_UNIT_EXCEPTION_MESSAGE, unitName));
        }

        if (unit.getHealthPoints() <= 0) {
            return String.format("Unit with name %s is already dead :((((.", unit.getName());
        }

        return unit.toString();
    }
}
