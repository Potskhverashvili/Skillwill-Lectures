public class Car {

    String brand;
    String color;

    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }



    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Brand: " + brand;
    }


    /*@Override
    public int hashCode() {
        return speed + brand.hashCode();
    }*/

}
