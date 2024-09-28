public class NextPrime {
    public static int nextPrime(int n) {
        int candidate = n + 1;

        while (true) {
            if (isPrime(candidate)) {
                return candidate;
            }
            candidate++;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
