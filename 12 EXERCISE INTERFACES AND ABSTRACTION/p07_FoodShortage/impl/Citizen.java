package p07_FoodShortage.impl;

import p07_FoodShortage.constants.Constants;
import p07_FoodShortage.contracts.Birthable;
import p07_FoodShortage.contracts.Buyer;
import p07_FoodShortage.contracts.Nameable;

public class Citizen extends AbstractIdentable implements Nameable, Birthable, Buyer {

    private final String name;
    private int age;
    private String birthday;
    private int food;

    public Citizen(String id, String name, int age, String birthday) {
        super(id);
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.food = Constants.START_FOOD;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int buyFood() {
        this.food += Constants.CITIZEN_BUY_FOOD_INCREASE;
        return Constants.CITIZEN_BUY_FOOD_INCREASE;
    }
}
