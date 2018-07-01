package Workshop.net.java.main.commands;

import Workshop.net.java.main.interfaces.Command;

import static Workshop.net.java.main.constants.GameConstants.TERMINATE_OUTPUT;

public class GameOverCommand implements Command {

    @Override
    public String execute(String[] args) {
        return TERMINATE_OUTPUT;
    }
}
