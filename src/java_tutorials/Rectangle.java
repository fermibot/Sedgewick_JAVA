package java_tutorials;

public class Rectangle {

    private String id;
    private double length;
    private double breadth;
    private double angle;
    private double opacity;
    private double xCoordinate;
    private double yCoordinate;

    public Rectangle(String id1) {
        id = id1;
    }

    public void setLength(double length1) {
        length = length1;
    }

    public void setBreadth(double breadth1) {
        breadth = breadth1;
    }

    public void setAngle(double angle1) {
        angle = angle1;
    }

    public void setOpacity(double opacity1) {
        opacity = opacity1;
    }

    public void setXCoordinate(double xCoordinate1) {
        xCoordinate = xCoordinate1;
    }

    public void setYCoordinate(double yCoordinate1) {
        yCoordinate = yCoordinate1;
    }

    public String getId() {
        return id;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getAngle() {
        return angle;
    }

    public double getOpacity() {
        return opacity;
    }

    public double getXCoordinate() {
        return xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(breadth, 2));
    }


    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("Fermi_Rectangle");
        rectangle1.setLength(10.0);
        rectangle1.setBreadth(20.0);
        rectangle1.setAngle(45);
        rectangle1.setOpacity(0.75);
        rectangle1.setXCoordinate(1.2);
        rectangle1.setYCoordinate(1.5);

        System.out.println("Id::" + rectangle1.id);
        System.out.println("Length::" + rectangle1.getLength());
        System.out.println("Breadth::" + rectangle1.getBreadth());
        System.out.println("Angle::" + rectangle1.getAngle());
        System.out.println("Opacity::" + rectangle1.getOpacity());
        System.out.println("xCoordinate::" + rectangle1.getXCoordinate());
        System.out.println("yCoordinate::" + rectangle1.getYCoordinate());
        System.out.println("Area::" + rectangle1.getArea());
        System.out.println("Diaginal::" + rectangle1.getDiagonal());
    }
}
