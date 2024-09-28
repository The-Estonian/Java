public class MultiplicationTable {
    public static void generate(int num) {
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }
}
