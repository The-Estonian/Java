public class AverageCalc {
    public static int average(int start, int end, int step) {
        int counter = 0;
        int sum = 0;
        if (start == end) {
            return 1;
        } else if (step == 0) {
            return 0;
        } else if (start < end) {
            for (int i = start; i <= end; i += step) {
                counter += 1;
                sum += i;
            }
            return sum / counter;
        } else if (start > end) {
            for (int i = start; i >= end; i += step) {
                counter += 1;
                sum -= i;
            }
            return sum / counter * -1;
        }
        return 0;
    }
}
