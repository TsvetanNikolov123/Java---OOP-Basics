package its_in_the_blood.cells.microbes;

public class Bacteria extends Microbe {

    public Bacteria(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }

    @Override
    public int calculateEnergy() {
        return (super.getHealth() + super.getVirulence()) / 3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------Cell ").append(super.getId()).append(String.format(" [%d,%d]", super.getPositionX(), super.getPositionY())).append("\r\n");
        sb.append("--------Health: ").append(super.getHealth()).append(" | ").append("Virulence: ").append(super.getVirulence()).append(" | Energy: ");
        sb.append(this.calculateEnergy()).append("\r\n");
        return sb.toString();
    }
}
