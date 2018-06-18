package p03_AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    private String calculateProductPerDay() {
        String eggs = "";

        if (this.getAge() <= 5) {
            eggs = "2";
        } else if (this.getAge() >= 6 && this.getAge() <= 11) {
            eggs = "1";
        } else {
            eggs = "0.75";
        }

        return eggs;
    }

    public String productPerDay() {
        return this.calculateProductPerDay();
    }
}
