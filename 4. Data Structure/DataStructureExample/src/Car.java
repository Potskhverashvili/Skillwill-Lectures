public class Car {

    String brand;
    String color;
    int speed;
    int gear;

    Car(String brand, String color, int speed, int gear) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.gear = gear;
    }


    public String toString() {
        return "Brand: " + brand + "\nColor: " + color + "\nSpeed:" + speed + "\nGear: " + gear + "\n------\n";
    }
}
