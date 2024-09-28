public class ReverseArray {
    public static Integer[] reverse(Integer[] arr) {
        Integer[] newArray = new Integer[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArray[j] = arr[i];
            j++;
        }
        return newArray;
    }
}
