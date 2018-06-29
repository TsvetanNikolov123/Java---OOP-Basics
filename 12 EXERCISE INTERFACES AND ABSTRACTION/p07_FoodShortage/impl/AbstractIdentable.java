package p07_FoodShortage.impl;

import p07_FoodShortage.contracts.Identable;

public abstract class AbstractIdentable implements Identable {

    private final String id;

    public AbstractIdentable(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

}
