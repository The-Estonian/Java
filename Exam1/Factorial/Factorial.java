public class Factorial {
    public static Integer factorial(Integer n) {
        if (n == 0) {
            return 1;
        }
        int sum = 1;
        for (int i = n; i > 0; i--) {
            sum *= i;
        }
        return sum;
    }
}
