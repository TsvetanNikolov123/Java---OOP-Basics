package p03_Shapes;

public abstract class Shape {

    private double perimeter;
    private double area;

    public double getPerimeter() {
        return this.perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    protected abstract double calculatePerimeter();

    protected abstract double calculateArea();
}
