import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "White", 300, 6);
        Car car2 = new Car("Mercedes", "Black", 280, 6);
        Car car3 = new Car("Maserati", "Blue", 300, 6);

        // --------------------------------- Array ---------------------------
        System.out.println("----------- Array -------------");
        Car[] arr = new Car[3];
        arr[0] = car1;
        arr[1] = car2;
        arr[2] = car3;
        printArray(arr);

        // --------------------------------- Arraylist -----------------------
        System.out.println("---------- ArrayList-------------");
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        printArrayList(cars);
    }

    // --------------------------------------- Helpers ------------------------------
    static void printArray(Car[] car) {
        for (Car value : car) {
            System.out.println(value);
        }
        System.out.println();
    }

    static void printArrayList(List<Car> cars){
        for(Car value : cars){
            System.out.println(value);
        }
    }

}