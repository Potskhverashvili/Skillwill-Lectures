import java.util.*;

public class SetAndMap {
    public static void main(String[] args) {

        Car car1 = new Car("Honda", "Black");
        Car car2 = new Car("Toyota", "White");
        Car car3 = new Car("BMW", "blue");
        Car car4 = new Car("Mercedes", "Red");
        Car car5 = new Car("Mazda", "Yellow");
        Car car6 = new Car("Ford", "White");

        // -------------------------------------- Set --------------------------------
        System.out.println("--------------------- Set ---------------------");

        // Create two sets of numbers to find common elements in
        Set<Integer> numbersSet1 = new HashSet<>(Arrays.asList(5, 6, 3, 4));
        Set<Integer> numbersSet2 = new HashSet<>(Arrays.asList(5, 6, 7, 4));

        // Print the original sets
        System.out.println("First set: " + numbersSet1);
        System.out.println("Second set: " + numbersSet2);

        // -------------------------------------- MAP --------------------------------------------
        System.out.println("--------------------- MAP ----------------------");
        // Create lists of cars
        List<Car> carList1 = new ArrayList<>(List.of(car1, car2, car3, car4));
        List<Car> carList2 = new ArrayList<>(List.of(car1, car3, car6));
        List<Car> carList3 = new ArrayList<>(List.of(car1, car2, car3, car4, car5));

        // Create a map to associate years with their car production lists
        Map<Integer, List<Car>> carsByYear = new HashMap<>();
        carsByYear.put(2019, carList1);
        carsByYear.put(2020, carList2);
        carsByYear.put(2021, carList3);
    }

    static int findYearWithMaxCars(Map<Integer, List<Car>> carsByYear){
        int maxCarYear = 0;
        int maxCarCount = 0;

        for (Map.Entry<Integer, List<Car>> entry : carsByYear.entrySet()){
            int currentYear = entry.getKey();
            int carCount = entry.getValue().size();

            if(maxCarCount < carCount){
                maxCarCount = carCount;
                maxCarYear = currentYear;
            }
        }
        return maxCarYear;
    }
}

