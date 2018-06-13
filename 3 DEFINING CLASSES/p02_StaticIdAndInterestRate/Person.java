package p02_StaticIdAndInterestRate;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<BankAccount> accounts;

    public Person (String name, int age){
//        this.name = name;
//        this.age = age;
//        this.accounts = new ArrayList<>();
//
//        in this way, we call the constructor below us
//        and we reduce the repeatability of code
        this(name, age, new ArrayList<>());
    }

    public Person(String name, int age, List<BankAccount> acc) {
        this.name = name;
        this.age = age;
        this.accounts = acc;
    }

    public double getBalance(){
        return this.accounts.stream().mapToDouble(BankAccount::getBalance).sum();
    }
}
