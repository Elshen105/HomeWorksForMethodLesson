public class Main {


    public static void main(String[] args) {

        System.out.println(power(10 , 4));


    }



    public static int power(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }



}
