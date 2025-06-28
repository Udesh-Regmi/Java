package Lab_Assignments.Vechile.CarDemo;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) {
        // You can hardcode the paths or accept them via command-line arguments
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        boolean result = copyTextFile(sourceFilePath, destinationFilePath);

        if (result) {
            System.out.println("File copied successfully.");
        } else {
            System.out.println("File copy failed.");
        }
    }

    /**
     * Copies content from a source text file to a destination file.
     *
     * @param source      path to the source text file
     * @param destination path to the destination text file
     * @return true if copy succeeds, false otherwise
     */
    public static boolean copyTextFile(String source, String destination) {
        File sourceFile = new File(source);
        File destFile = new File(destination);

        // Check if source file exists and is a file
        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.err.println("Error: Source file does not exist or is not a valid file.");
            return false;
        }


        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // preserve line breaks
            }
            return true;
        } catch (IOException e) {
            System.err.println("IOException occurred while copying file: " + e.getMessage());
            return false;
        }
    }
}
