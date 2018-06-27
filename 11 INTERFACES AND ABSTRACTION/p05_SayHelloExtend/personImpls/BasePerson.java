package p05_SayHelloExtend.personImpls;

import p05_SayHelloExtend.person.Person;

public abstract class BasePerson implements Person {

    private String name;

    protected BasePerson(String name) {
        this.setName(name);
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
