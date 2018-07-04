package its_in_the_blood.cells.microbes;

import its_in_the_blood.cells.Cell;

abstract class Microbe extends Cell {

    private int virulence;

    public Microbe(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol);
        this.virulence = virulence;
    }

    public int getVirulence() {
        return virulence;
    }
}
