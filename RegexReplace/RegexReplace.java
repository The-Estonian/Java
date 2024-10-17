import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RegexReplace {
    public static String removeUnits(String s) {
        return s == null ? null : s.replaceAll("(\\d+)(?<!²)(cm|€)(?!²)", "$1");
    }

    public static String obfuscateEmail(String s) {
        if (s == null) {
            return null;
        }
        // create a new stream of data
        List<String> list = new ArrayList<>(Arrays.stream(s.split("@")).toList());

        // get the first item from the list
        String beforeAt = list.get(0);
        StringBuilder obfuscatedName = new StringBuilder();
        String hidden = "";

        // if first part contains _ . or -
        if (beforeAt.contains("_") || beforeAt.contains(".") || beforeAt.contains("-")) {

            // if first part contains _
            if (beforeAt.contains("_")) {
                obfuscatedName.append(beforeAt.substring(0, beforeAt.indexOf("_") + 1));
            }

            // if first part contains -
            if (beforeAt.contains("-")) {
                obfuscatedName.append(beforeAt.substring(0, beforeAt.indexOf("-") + 1));
            }

            // if first part contains .
            if (beforeAt.contains(".")) {
                obfuscatedName.append(beforeAt.substring(0, beforeAt.indexOf(".") + 1));
            }
            obfuscatedName.append("*".repeat(beforeAt.length() - obfuscatedName.toString().length()));
        } else if (beforeAt.length() > 3) {
            if (beforeAt.length() == 4) {
                obfuscatedName.append(beforeAt.substring(0, beforeAt.length() - 1)).append("*");
            } else {
                obfuscatedName.append(beforeAt.substring(0, beforeAt.length() - 3)).append("*".repeat(3));
            }

        }

        // append middlepart
        obfuscatedName.append("@");

        // obfuscate või midagi last part
        List<String> otherSideOfAt = new ArrayList<>(Arrays.asList(list.get(1).split("\\.")));
        if (otherSideOfAt.size() == 3) {
            otherSideOfAt.set(0, "*".repeat(otherSideOfAt.get(0).length()));
            otherSideOfAt.set(2, "*".repeat(otherSideOfAt.get(2).length()));
        } else if (otherSideOfAt.size() == 2) {
            otherSideOfAt.set(0, "*".repeat(otherSideOfAt.get(0).length()));
            if (!otherSideOfAt.get(1).matches("^(com|org|net)$")) {
                otherSideOfAt.set(1, "*".repeat(otherSideOfAt.get(1).length()));
            }
        }

        // add first and last part together
        obfuscatedName.append(otherSideOfAt.stream().collect(Collectors.joining(".")));
        return obfuscatedName.toString();
    }
}