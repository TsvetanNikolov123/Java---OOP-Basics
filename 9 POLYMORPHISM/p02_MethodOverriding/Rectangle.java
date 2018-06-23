package p02_MethodOverriding;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a) {
        this.setA(a);
    }

    public Rectangle(double a, double b) {
        this.setA(a);
        this.setB(b);
    }

    protected double getA() {
        return this.a;
    }

    protected double getB() {
        return this.b;
    }

    private void setA(double a) {
        this.a = a;
    }

    private void setB(double b) {
        this.b = b;
    }

    public double area() {
        return getA() * getB();
    }
}
