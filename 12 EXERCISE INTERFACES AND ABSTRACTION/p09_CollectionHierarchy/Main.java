package p09_CollectionHierarchy;

import p09_CollectionHierarchy.impl.AddCollectionImpl;
import p09_CollectionHierarchy.impl.MyListImpl;
import p09_CollectionHierarchy.impl.RemoveCollectionImpl;
import p09_CollectionHierarchy.interfaces.AddCollection;
import p09_CollectionHierarchy.interfaces.MyList;
import p09_CollectionHierarchy.interfaces.RemoveCollection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        AddCollection addCollection = new AddCollectionImpl();
        RemoveCollection removeCollection = new RemoveCollectionImpl();
        MyList myList = new MyListImpl();

        String[] elements = in.nextLine().split("\\s+");
        for (String element : elements) {
            System.out.print(addCollection.add(element) + " ");
        }

        System.out.println();

        for (String element : elements) {
            System.out.print(removeCollection.add(element) + " ");
        }

        System.out.println();

        for (String element : elements) {
            System.out.print(myList.add(element) + " ");
        }

        System.out.println();

        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print(removeCollection.remove() + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(myList.remove() + " ");
        }

        System.out.println();
    }
}
