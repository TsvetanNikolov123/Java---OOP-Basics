package p07_FoodShortage.impl;

import p07_FoodShortage.constants.Constants;
import p07_FoodShortage.contracts.Buyer;
import p07_FoodShortage.contracts.Nameable;

public class Rebel implements Nameable , Buyer {

    private final String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = Constants.START_FOOD;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int buyFood() {
        this.food += Constants.REBEL_BUY_FOOD_INCREASE;
        return Constants.REBEL_BUY_FOOD_INCREASE;
    }
}
