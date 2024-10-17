public class ConcatStrategy implements OperationStrategy {
    @Override
    public int execute(int a, int b) {
        // Concatenate the integers as strings and convert them back to an integer
        return Integer.parseInt("" + a + b);
    }
}
