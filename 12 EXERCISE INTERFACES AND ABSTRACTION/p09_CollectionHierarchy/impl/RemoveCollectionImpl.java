package p09_CollectionHierarchy.impl;

import p09_CollectionHierarchy.interfaces.RemoveCollection;

import java.util.ArrayList;
import java.util.List;

public class RemoveCollectionImpl implements RemoveCollection {

    private List<String> elements;

    RemoveCollectionImpl() {
        this.elements = new ArrayList<>();
    }

    @Override
    public String remove() {
        String lastElement = this.elements.get(this.elements.size() - 1);
        this.elements.remove(lastElement);
        return lastElement;
    }

    @Override
    public int add(String element) {
        this.elements.add(0, element);
        return 0;
    }
}
