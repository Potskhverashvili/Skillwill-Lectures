public class Main {
    public static void main(String[] args) {

        // --------- Error ---------
        /*throw new AssertionError("Eroria jigaro");*/

        // --------- Run Time Exceptions ----------
        /*int[] arr = new int[20];
        arr[20] = 20;*/

        // -------- Checked Exceptions --------

        /*try (FileInputStream fis = new FileInputStream(new File("test.txt"))) {
            fis.read();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


       Car car1 = new Car("BMW");

       Car car2 = new Car("BMW");

        System.out.println(car1.equals(car2));
        System.out.println(car2.hashCode());



    }
}