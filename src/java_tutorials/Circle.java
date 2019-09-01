package java_tutorials;

import static java.lang.Math.PI;

public class Circle {
    private String id;
    private float radius;

    public Circle(String id1) {
        id = id1;
    }

    public void setRadius(float radius1) {
        radius = radius1;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return PI * radius * radius;
    }

    double getCircumference() {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle("A12353");
        circle.setRadius(100);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }

}
