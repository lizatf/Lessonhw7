package shapes;

public class Triangle implements PerimeterProvider,SquareProvider, PresentSquare {
    private double sideA;
    private double sideB;
    private double sideC;
    private double h;

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public Triangle(double sideA, double sideB, double sideC, double h) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.h = h;
    }

    @Override
    public double getPerimetr() {
        return sideA+sideB+sideC;
    }

    @Override
    public double getSquare() {
        return sideA*h/2;
    }

    @Override
    public void presentSquare() {
        System.out.println("Периметр треугольника: " + getSquare());
    }
}
