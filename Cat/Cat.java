
import java.io.*;
import java.util.List;
import java.nio.file.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        try {
            String file = args[0];
            if (isBinaryFile(file)) {
                byte[] bytes = Files.readAllBytes(Paths.get(file));
                for (byte b : bytes) {
                    System.out.write(b);
                }

            } else {
                List<String> lines = Files.readAllLines(Paths.get(file));
                if (lines.size() == 1) {
                    for (String line : lines) {
                        System.out.print(line);
                    }
                } else {
                    for (String line : lines) {
                        System.out.println(line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isBinaryFile(String filePath) throws IOException {
        byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));
        for (int i = 0; i < Math.min(fileBytes.length, 1024); i++) { // Check the first 1024 bytes
            byte b = fileBytes[i];
            if (b < 0x20 && b != 0x09 && b != 0x0A && b != 0x0D) {
                return true;
            }
        }
        return false;
    }
}
