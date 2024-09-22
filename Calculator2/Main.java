package Calculator2;

import java.util.Scanner;

import Calculator2.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Please enter the first number: ");
        calc.setNum1(scan.nextInt());
        scan.nextLine(); // aparently consumes the leftover space

        System.out.println("Please enter the operator: ");
        String operator = scan.nextLine();

        System.out.println("Please enter the second number: ");
        calc.setNum2(scan.nextInt());
        scan.nextLine();

        calc.calculate(operator);

        boolean running = true;

        while (running) {
            System.out.println("Please enter the next operator or exit with 'x': ");
            operator = scan.nextLine();

            if ("x".equals(operator)) {
                running = false;
            } else {
                System.out.println("Please enter another number: ");
                calc.setNum2(scan.nextInt());
                scan.nextLine();

                calc.calculate(operator);
            }
        }

        scan.close();
    }
}
