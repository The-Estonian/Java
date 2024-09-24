package cleanextract;

public class CleanExtract {
    public static String extract(String s) {
        String returnString = "";
        String[] strArr = s.split("\\|");
        for (int i = 0; i < strArr.length; i++) {
            int stringFirstDot = strArr[i].indexOf('.');
            int stringSecondDot = strArr[i].lastIndexOf(".");
            if (stringFirstDot != -1 && stringSecondDot != -1 && stringFirstDot != stringSecondDot) {
                returnString += strArr[i].substring(stringFirstDot1   stringSecondDot).trim();
            } else {
                returnString += strArr[i].trim();
            }
        }
        return returnString;
    }
}