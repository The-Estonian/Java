import java.io.*;
import java.util.StringTokenizer;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        // Read the input file
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        // Write to the output file
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        String line;
        while ((line = reader.readLine()) != null) {
            // Capitalize each word in the line
            String capitalizedLine = capitalizeWords(line);
            writer.write(capitalizedLine);
            writer.newLine();
        }

        // Close the reader and writer
        reader.close();
        writer.close();
    }

    private static String capitalizeWords(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line);
        StringBuilder capitalized = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase()).append(" ");
            }
        }

        return capitalized.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Please provide input and output file names as arguments.");
            return;
        }

        capitalize(args);
    }
}