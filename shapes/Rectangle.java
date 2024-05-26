package shapes;

public class Rectangle implements PerimeterProvider,SquareProvider, PresentSquare {
    private double sideA;
    private double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }


    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimetr() {
        return 2*(sideA+sideB);
    }

    @Override
    public double getSquare() {
        return sideA*sideB;
    }

    @Override
    public void presentSquare() {
        System.out.println("Периметр прямоугольника: " + getSquare());
    }
}
