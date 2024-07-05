package calculator;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

public class ViolationOfOcp {

    public double calculateAre(Shape shape){
        if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        } else if(shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getLength() * rectangle.getWidth();
        }

        return  0;
    }

}
