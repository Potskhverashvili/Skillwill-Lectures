import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {

        // --------- Error ---------


        // --------- Run Time Exceptions ----------
        int[] arr = new int[20];
        arr[1] = 20;

        // -------- Checked Exceptions --------

        System.out.println(getResult(10, 5));
        System.out.println(getResult(10,0));



    }


    static int getResult(int a, int b) {
        try {
            return (a / b);
        } catch (ArithmeticException e) {
            System.out.println("shecdomaa jigaroo");
            return -1;

        } finally {
            return 9;
        }
    }
}