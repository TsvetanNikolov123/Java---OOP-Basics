package p02_MultipleImplementation;

import p02_MultipleImplementation.interfaces.Birthable;
import p02_MultipleImplementation.interfaces.Identifiable;
import p02_MultipleImplementation.interfaces.Person;

public class Citizen implements Person, Birthable, Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthday;

    public Citizen(String name, int age, String id, String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String birthdate() {
        return this.birthday;
    }

    @Override
    public String id() {
        return this.id;
    }
}
