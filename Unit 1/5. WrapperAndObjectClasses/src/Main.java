import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);

        System.out.println(nums);
        nums.set(5,1);
        nums.set(0, 6);
        System.out.println(nums);


    }


    static void reverse(int [] nums) {
        int arrLen = nums.length -1;
        List<Integer> reverseList = new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            reverseList.add(nums[arrLen - i]);
        }

        for (Integer elem : reverseList){
            System.out.println(elem);
        }
    }

}
