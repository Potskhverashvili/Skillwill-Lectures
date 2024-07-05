package shapes;

public class Square implements Shape {

    private final int a;
    public Square(int b, int a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }
}
