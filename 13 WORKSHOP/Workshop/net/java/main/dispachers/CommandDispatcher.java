package Workshop.net.java.main.dispachers;

import Workshop.net.java.main.constants.ExceptionMessagesConstants;
import Workshop.net.java.main.enums.CommandType;
import Workshop.net.java.main.exceptions.*;
import Workshop.net.java.main.factories.CommandFactory;
import Workshop.net.java.main.interfaces.Battleground;
import Workshop.net.java.main.interfaces.Command;
import Workshop.net.java.main.interfaces.Repository;
import Workshop.net.java.main.interfaces.Unit;

import java.util.HashMap;
import java.util.Map;


public class CommandDispatcher {
    private Map<String, Command> commands;

    public CommandDispatcher(Battleground battleground, Repository<Unit> unitRepository) {
        this.commands = new HashMap<>();
        this.seedCommands(battleground, unitRepository);
    }

    public String dispatchCommand(String[] args) throws UnknownCommandException, InvalidUnitTypeException, InvalidPositionException, UnitNotExistException, NotEnoughEnergyException {
        if (this.commands.containsKey(args[0])) {
            return this.commands.get(args[0]).execute(args);
        }

        throw new UnknownCommandException(ExceptionMessagesConstants.UNKNOWN_COMMAND_EXCEPTION_MESSAGE);
    }

    private void seedCommands(Battleground battleground, Repository<Unit> unitRepository) {
        commands.put(CommandType.SPAWN.toString(), CommandFactory.createSpawnCommand(battleground, unitRepository));
        commands.put(CommandType.MOVE.toString(), CommandFactory.createMoveCommand(battleground, unitRepository));
        commands.put(CommandType.STATUS.toString(), CommandFactory.createStatusCommand(unitRepository));
        commands.put(CommandType.FIGHT.toString(), CommandFactory.createFightCommand(battleground, unitRepository));
        commands.put(CommandType.GAME_OVER.toString(), CommandFactory.createGameOverCommand());
    }
}
