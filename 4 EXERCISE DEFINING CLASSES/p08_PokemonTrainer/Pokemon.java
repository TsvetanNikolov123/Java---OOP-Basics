package p08_PokemonTrainer;

public class Pokemon {
    private static final int HEALTH_HIT_ON_LOST_BATTLE = 10;

    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.setName(name);
        this.setElement(element);
        this.setHealth(health);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    private void setElement(String element) {
        this.element = element;
    }

    public int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public void attackPokemon() {
        this.setHealth(this.getHealth() - HEALTH_HIT_ON_LOST_BATTLE);
    }
}