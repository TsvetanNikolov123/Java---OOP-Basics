package its_in_the_blood.cells.bloodcells;

public class RedBloodCell extends BloodCell {

    private int velocity;

    public RedBloodCell(String id, int health, int positionRow, int positionCol, int velocity) {
        super(id, health, positionRow, positionCol);
        this.velocity = velocity;
    }

    @Override
    public int calculateEnergy() {
        return super.getHealth() + this.velocity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------Cell ").append(super.getId()).append(String.format(" [%d,%d]", super.getPositionX(), super.getPositionY())).append("\r\n");
        sb.append("--------Health: ").append(super.getHealth()).append(" | ");
        sb.append("Velocity: ").append(this.velocity).append(" | Energy: ").append(this.calculateEnergy()).append("\r\n");
        return sb.toString();
    }
}
