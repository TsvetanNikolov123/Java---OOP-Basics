package p09_CollectionHierarchy.impl;

import p09_CollectionHierarchy.interfaces.AddCollection;

import java.util.ArrayList;
import java.util.List;

public class AddCollectionImpl implements AddCollection {

    private List<String> elements;

    AddCollectionImpl() {
        this.elements = new ArrayList<>();
    }

    @Override
    public int add(String element) {
        this.elements.add(element);
        return this.elements.size() - 1;
    }
}

