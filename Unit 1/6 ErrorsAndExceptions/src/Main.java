
public class Main {
    public static void main(String[] args)  {

        System.out.println(getResult(10,0));
    }




    public static  int getResult(int a, int b){
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println("Exception");
            return -1;
        }  finally {
            return 7;
        }
    }
}