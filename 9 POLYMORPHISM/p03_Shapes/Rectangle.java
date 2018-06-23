package p03_Shapes;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        super();
        this.setHeight(height);
        this.setWidth(width);
    }

    private final double getHeight() {
        return this.height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private final double getWidth() {
        return this.width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * this.getHeight() * this.getWidth();
    }

    @Override
    protected double calculateArea() {
        return this.getHeight() * this.getWidth();
    }
}
