package Calculator2.calculator;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void calculate(String op) {
        if ("+".equals(op)) {
            System.out.println(add());
        } else if ("-".equals(op)) {
            System.out.println(subtract());
        } else if ("*".equals(op)) {
            System.out.println(multiply());
        } else if ("/".equals(op)) {
            System.out.println(divide());
        }
    }

    public int add() {
        this.num1 = this.num1 + this.num2;
        return this.num1;
    }

    public int subtract() {
        this.num1 = this.num1 - this.num2;
        return this.num1;
    }

    public int multiply() {
        this.num1 = this.num1 * this.num2;
        return this.num1;
    }

    public int divide() {
        this.num1 = this.num1 / this.num2;
        return this.num1;
    }

}
