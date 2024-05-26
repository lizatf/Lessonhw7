package shapes;

public class Circle implements PerimeterProvider, SquareProvider, PresentSquare {
    private  double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimetr() {
        return 2*radius*Math.PI ;
    }

    @Override
    public double getSquare() {
        return radius*Math.PI;
    }

    @Override
    public void presentSquare() {
        System.out.println("Периметр круга: " + getSquare());
    }
}
