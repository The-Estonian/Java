public class Context {
    private OperationStrategy operationStrategy;

    // Constructor initializes the operationStrategy with AddStrategy
    public Context() {
        this.operationStrategy = new AddStrategy();
    }

    // Change the strategy at runtime
    public void changeStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    // Execute the strategy's logic
    public int execute(int a, int b) {
        return operationStrategy.execute(a, b);
    }
}
