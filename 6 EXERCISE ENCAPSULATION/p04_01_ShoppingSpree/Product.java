package p04_01_ShoppingSpree;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

    private void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }

        this.price = price;
    }
}
