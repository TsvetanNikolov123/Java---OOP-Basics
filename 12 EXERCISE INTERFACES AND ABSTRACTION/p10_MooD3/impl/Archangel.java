package p10_MooD3.impl;

public class Archangel extends GameObject{

    private double mana;

    public Archangel(String username, double mana, int level) {
        super(username, level);
        this.setMana(mana);
    }

    private void setMana(double mana) {
        this.mana = mana;
    }

    @Override
    public String generateHashPassword() {
        return new StringBuilder(super.getName()).reverse().toString() + (super.getName().length()) * 21;
    }
}
