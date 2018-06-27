package p05_SayHelloExtend.personImpls;

import p05_SayHelloExtend.person.Person;

public class Bulgarian extends BasePerson implements Person {

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello(){
        return "Здравей";
    }
}
