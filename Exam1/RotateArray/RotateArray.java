public class RotateArray {
    public static Integer[] rotate(Integer[] arr, int rotationCount) {
        if (arr.length == 0) {
            return arr;
        }
        if (arr.length < rotationCount) {
            rotationCount -= arr.length;
        }
        if (rotationCount < 0) {
            if (arr.length < rotationCount * -1) {
                rotationCount += arr.length;
            }
        }
        Integer[] newArray = new Integer[arr.length];
        int newIndex = 0;
        int i;
        if (rotationCount > 0) {
            i = arr.length - rotationCount;
        } else {
            i = 0 - rotationCount;
        }
        for (; i < arr.length;) {
            newArray[newIndex] = arr[i];
            i++;
            newIndex++;
            if (i == arr.length) {
                i = 0;
            }
            if (newIndex == arr.length) {
                break;
            }
        }
        return newArray;
    }
}
