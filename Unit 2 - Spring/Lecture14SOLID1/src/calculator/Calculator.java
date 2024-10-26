package calculator;

import shapes.Shape;

public class Calculator {

    public Double calculateArea() {
       Shape shape = new Shape() {
           @Override
           public double calculateArea() {
               return 0;
           }
       };
        return shape.calculateArea();
    }
}
