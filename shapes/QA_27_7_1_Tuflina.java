package shapes;

import java.util.Random;
import java.util.Scanner;

public class QA_27_7_1_Tuflina {
    public static void main(String[] args) {
        Circle circle = new Circle(9.5);
        Rectangle rectangle = new Rectangle(5.5,5.5);
        Triangle triangle = new Triangle(8,7.3,8, 4.5);
        circle.presentSquare();
        rectangle.presentSquare();
        triangle.presentSquare();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        PerimeterProvider[] perimeterProviders = new PerimeterProvider[size];
        for (int i = 0; i < perimeterProviders.length; i++) {
            perimeterProviders[i] = getShape();
        }
        double sumOfPerimeters = 0;
        for (int i = 0; i < perimeterProviders.length; i++) {
           sumOfPerimeters += perimeterProviders[i].getPerimetr();
            System.out.println("Сумма периметров всез фигур: " + sumOfPerimeters);
        }
    scanner.close();
    }

    public  static PerimeterProvider getShape(){
        Random random = new Random();
        int nextShape = random.nextInt(3);
        if (nextShape == 0)
            return new Circle(9.5);
        else if (nextShape == 1)
            return new Rectangle(5.5,5.5);
        else
            return new Triangle(5,7.3,8,4.5);
    }
}
