package p05_01_BorderControl;

public class Citizen implements IdentableId {

    private String name;
    private String age;
    private String id;

    public Citizen(String name, String age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(String age) {
        this.age = age;
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
