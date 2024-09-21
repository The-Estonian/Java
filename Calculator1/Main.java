import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int num1 = scan.nextInt();
        scan.nextLine(); // aparently consumes the leftover space

        System.out.println("Please enter the operator: ");
        String operator = scan.nextLine();

        System.out.println("Please enter the second number: ");
        int num2 = scan.nextInt();
        scan.close();

        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        }

    }
}