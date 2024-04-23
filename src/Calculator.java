import java.util.Locale;
import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        calculation();
    }

    public static void showOperation() {
        System.out.println("1. add\n" + "2. Subtract\n" + "3. Multiply\n" + "4. Divide");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }



    public static void calculation() {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        boolean check = true;
        do {
            showOperation();
            System.out.print("Enter an oparation : ");
            int operation = scanner.nextInt();

            System.out.print("Enter first number : ");
            int firstNum = scanner.nextInt();
            System.out.print("Enter second number : ");
            int secondNum = scanner.nextInt();
            int result = 0;
            switch (operation) {
                case 1:
                    result = add(firstNum, secondNum);
                    break;
                case 2:
                    result = subtract(firstNum, secondNum);
                    break;
                case 3:
                    result = multiply(firstNum, secondNum);
                    break;
                case 4:
                    if (secondNum != 0) {
                        result = divide(firstNum, secondNum);
                        break;
                    }
                    System.out.print("Ikinci reqem ola bilmez : ");
                    break;
                default:
                    System.out.println("Invalid operation");
            }

            System.out.println(result);

            do {
                System.out.print("If you continue you press y - button : ");
                answer = new Scanner(System.in).nextLine();
                check = answer.equalsIgnoreCase("y");
            } while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));

        } while (check);


    }

}
