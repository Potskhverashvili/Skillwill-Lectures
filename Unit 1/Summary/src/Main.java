import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ------------------------------- ArrayList -------------------------------
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        reverse(numbers);




    }

// ---------------------------------------------- FUNCTIONS -----------------------------------------------
    // Reverse function with ArrayList argument
    static void reverse (List<Integer> nums){
        int i = 0;
        int j = nums.size() -1;
        int temp;
        while (i <= j){
            temp = nums.get(j);
            nums.set(j, nums.get(i));
            nums.set(i, temp);
            i++;
            j--;
        }

        for (Integer element : nums){
            System.out.println(element);
        }
    }
}