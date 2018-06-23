package p06_02_Animals;

public class Dog extends Animal {

    protected Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void produceSound() {
        System.out.println("BauBau");
    }
}
