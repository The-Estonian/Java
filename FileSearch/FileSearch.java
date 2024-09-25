import java.io.File;

public class FileSearch {
    public static String searchFile(String fileName) {
        File rootFolder = new File("./documents");
        return searchInDirectory(rootFolder, fileName);
    }

    private static String searchInDirectory(File directory, String fileName) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    String result = searchInDirectory(file, fileName);
                    if (result != null) {
                        return result;
                    }
                } else if (file.getName().equals(fileName)) {
                    return file.getPath().replace("./", "");
                }
            }
        }
        return null;
    }
}
