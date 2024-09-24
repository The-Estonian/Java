public class DoOp {
    public static String operate(String[] args) {
        if (args.length != 3) {
            return "Error";
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        if (args[1] == "-") {
            return Integer.toString(num1 - num2);
        } else if (args[1] == "+") {
            return Integer.toString(num1 + num2);
        } else if (args[1] == "%") {
            return Integer.toString(num1 % num2);
        } else if (args[1] == "*") {
            return Integer.toString(num1 * num2);
        } else if (args[1] == "/") {
            return Integer.toString(num1 / num2);
        } else {
            return "Error";
        }
    }
}