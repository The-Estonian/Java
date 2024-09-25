
import java.io.*;
import java.util.Random;

public class Cat_test {

    static void generateBinaryFile(String filePath, int fileSizeInBytes) throws IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        Random random = new Random();
        byte[] buffer = new byte[1024]; // Adjust buffer size as needed
        while (fileSizeInBytes > 0) {
            random.nextBytes(buffer);
            int bytesToWrite = Math.min(fileSizeInBytes, buffer.length);
            fos.write(buffer, 0, bytesToWrite);
            fileSizeInBytes -= bytesToWrite;
        }
        fos.close();
    }

    public static void main(String[] args) throws IOException {
        generateBinaryFile("binFile.txt", 1 * 1024 * 1024);
        Cat.cat(new String[] { "binFile.txt" });
    }
}