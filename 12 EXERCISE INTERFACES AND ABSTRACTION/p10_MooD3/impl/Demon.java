package p10_MooD3.impl;

public class Demon extends GameObject{

    private double energy;

    public Demon(String username, double energy, int level) {
        super(username, level);
        this.setEnergy(energy);
    }

    private void setEnergy(double energy) {
        this.energy = energy;
    }

    @Override
    public String generateHashPassword() {
        return String.valueOf(super.getName().length() * 217);
    }

}
