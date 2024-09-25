public class SortArgs {
    public static void sort(String[] args) {
        StringBuilder returnString = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {
                int num1 = Integer.parseInt(args[i]);
                int num2 = Integer.parseInt(args[j]);
                if (args[j].compareTo(args[i]) > 0) {
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        for (int x = 0; x < args.length; x++) {
            returnString.append(args[x]);
            if (x != args.length - 1) {
                returnString.append(" ");
            }
        }
        returnString.append("\n");
        System.out.print(returnString.toString());
    }
}
