package p06_01_Animals;

public class Frog extends Animal {

    private static final String SOUND = "Frogggg";

    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }


    @Override
    public String produceSound() {
        return SOUND;
    }
}
