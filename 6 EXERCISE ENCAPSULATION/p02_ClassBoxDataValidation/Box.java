package p02_ClassBoxDataValidation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getLength() {
        return this.length;
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double volume() {
        return this.getLength() * this.getWidth() * this.getHeight();
    }

    public double lateralSurfaceAre() {
        return (2 * this.getLength() * this.getHeight()) + (2 * this.getWidth() * this.getHeight());
    }

    public double surfaceArea() {
        return (2 * this.getLength() * this.getWidth()) +
                (2 * this.getLength() * this.getHeight()) +
                (2 * this.getWidth() * this.getHeight());
    }
}