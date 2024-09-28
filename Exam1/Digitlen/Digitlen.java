public class Digitlen {
    public static int digitlen(long number) {
        int counter = 1;
        if (number < 0) {
            number = number * -1;
        }
        while (number > 10) {
            counter++;
            number = number / 10;
        }
        return counter;
    }
}
