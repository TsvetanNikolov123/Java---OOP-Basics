package p09_CollectionHierarchy.impl;

import p09_CollectionHierarchy.interfaces.MyList;

import java.util.ArrayList;
import java.util.List;

public class MyListImpl implements MyList {

    private List<String> elements;

    MyListImpl() {
        this.elements = new ArrayList<>();
    }

    @Override
    public int add(String element) {
        this.elements.add(0, element);
        return 0;
    }

    @Override
    public String remove() {
        String firstElement = this.elements.get(0);
        this.elements.remove(firstElement);

        return firstElement;
    }

    @Override
    public int used() {
        return this.elements.size();
    }
}
