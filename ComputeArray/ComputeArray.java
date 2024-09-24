public class ComputeArray {
    public static int[] computeArray(int[] array) {
        if (array == null) {
            return null;
        }
        System.out.println(array);
        int[] returnArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                returnArray[i] = array[i] * 5;
            } else if (array[i] % 3 == 1) {
                returnArray[i] = array[i] + 7;
            } else {
                returnArray[i] = array[i];
            }
        }
        return returnArray;
    }
}