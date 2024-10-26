import calculator.Calculator;
import shapes.Rectangle;
import shapes.Triangle;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle(3, 4);

        Triangle triangle = new Triangle(2, 5);

        System.out.println(triangle.calculateArea());


    }

}