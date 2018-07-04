package its_in_the_blood.cells;

public abstract class Cell {

    private String id;
    private int health;
    private int positionX;
    private int positionY;

    public Cell(String id, int health, int positionX, int positionY) {
        this.id = id;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    protected String getId() {
        return id;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract int calculateEnergy();

    @Override
    public String toString() {
        return super.toString();
    }
}
