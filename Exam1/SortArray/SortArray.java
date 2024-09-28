public class SortArray {
    public static Integer[] sort(Integer[] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {
                if (args[i] < args[j]) {
                    int middleman = args[i];
                    args[i] = args[j];
                    args[j] = middleman;
                }
            }
        }
        return args;
    }
}
