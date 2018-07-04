package its_in_the_blood.cells.bloodcells;

import its_in_the_blood.cells.Cell;

public abstract class BloodCell extends Cell {

    public BloodCell(String id, int health, int positionRow, int positionCol) {
        super(id, health, positionRow, positionCol);
    }
}
