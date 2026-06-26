package MakerPlan.ShapeHirerchy;

public class Circle extends Shape {
    private double radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    @Override
    public void perimeter() {
        System.out.println("Circumference of Circle: " + (2 * Math.PI * radius));
    }
}