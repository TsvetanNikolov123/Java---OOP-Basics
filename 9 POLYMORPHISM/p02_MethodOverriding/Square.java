package p02_MethodOverriding;

public class Square extends Rectangle {

    private double a;

    public Square(double a) {
        super(a);
    }
    @Override
    public double area() {
        return getA() * getA();
    }
}
