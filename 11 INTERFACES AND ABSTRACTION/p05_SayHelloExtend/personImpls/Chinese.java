package p05_SayHelloExtend.personImpls;

import p05_SayHelloExtend.person.Person;

public class Chinese extends BasePerson implements Person {

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello(){
        return "Djydjybydjy";
    }
}
