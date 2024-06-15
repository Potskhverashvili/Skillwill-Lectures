import java.util.Objects;

public class Car {

    String brand;

    Car(String brand){
        this.brand = brand;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return Objects.equals(brand, car.brand);
    }

   /* @Override
    public int hashCode() {
        return Objects.hashCode(brand);
    }*/
}
