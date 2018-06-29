package p07_FoodShortage.impl;

import p07_FoodShortage.contracts.Birthable;
import p07_FoodShortage.contracts.Nameable;

public class Pet implements Nameable, Birthable {

    private final String name;
    private String birthday;

    public Pet(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String getBirthday() {
        return this.birthday;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
