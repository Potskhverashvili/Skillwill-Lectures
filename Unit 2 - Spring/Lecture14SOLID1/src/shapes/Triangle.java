package shapes;

public class Triangle implements Shape{

    private final int base;
    private final int height;

   public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
