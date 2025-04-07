Here are two clean, professional-grade Java programs for:

---

## ✅ 1. **Reading a Text File Line by Line**

This version uses `BufferedReader` for efficient file reading and includes exception handling and file closure with try-with-resources.

```java
import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "input.txt"; // path to the file

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
```

> 🔧 **Use Case**: Configuration file reading, report parsing, log analysis.

---

## ✅ 2. **Copying a Text File to Another File**

This version copies the content of `source.txt` into `destination.txt` line by line. It's optimized for clarity and safety.

```java
import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // preserve line breaks
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("File operation failed: " + e.getMessage());
        }
    }
}
```

> 🔧 **Use Case**: Backup systems, data migration tools, file transformation pipelines.

