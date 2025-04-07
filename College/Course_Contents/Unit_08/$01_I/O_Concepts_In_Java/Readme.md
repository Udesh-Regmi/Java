# Java I/O Concepts Explained

> **I/O (Input and Output)** in Java refers to how data is read from input sources (keyboard, file, network) and written to output destinations (screen, file, etc.). Java offers rich APIs to handle this through various stream-based classes under the `java.io` and `java.nio` packages.

---

## 1. 📥📤 Streams in Java

### ➤ What is a Stream?
A **stream** is a flow of data between a source and a destination.

> Imagine a stream as a **pipeline**. It carries data from one place to another, byte by byte or character by character.

```
  [Data Source]  →  [Input Stream]  →  [Java Program]  →  [Output Stream]  →  [Destination]
```

---

### ➤ Types of Streams

| Stream Type       | Description                        | Handles         |
|------------------|------------------------------------|-----------------|
| **Byte Stream**   | Processes raw binary data          | 1 byte at a time|
| **Character Stream** | Processes character/textual data | 2 bytes (Unicode) |

---

### ➤ Common Stream Classes

| Stream Category     | Input Classes                        | Output Classes                       |
|---------------------|--------------------------------------|--------------------------------------|
| Byte Streams        | `InputStream`, `FileInputStream`, `BufferedInputStream` | `OutputStream`, `FileOutputStream`, `BufferedOutputStream` |
| Character Streams   | `Reader`, `FileReader`, `BufferedReader` | `Writer`, `FileWriter`, `BufferedWriter` |

---

### ➤ Predefined Streams in Java

Java provides three standard I/O streams:

| Stream             | Description                          |
|--------------------|--------------------------------------|
| `System.in`        | Standard input (usually keyboard)    |
| `System.out`       | Standard output (console)            |
| `System.err`       | Error output (console for errors)    |

```java
System.out.println("Welcome to Java I/O");
System.err.println("Something went wrong!");
```

---

## 2. 🧑‍💻 Reading Console Input

### ➤ Using `Scanner` (Most Common)
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = sc.nextLine();
System.out.println("Hello, " + name);
```

🔧 **Application**: Taking user input in CLI tools, forms, and games.

---

### ➤ Reading Characters using `InputStreamReader`
```java
import java.io.*;

InputStreamReader isr = new InputStreamReader(System.in);
System.out.print("Enter a character: ");
char ch = (char) isr.read();
System.out.println("Character entered: " + ch);
```

🔧 **Application**: Custom interpreters, console-based apps that need key-by-key interaction.

---

### ➤ Reading Strings using `BufferedReader`
```java
import java.io.*;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a sentence: ");
String sentence = br.readLine();
System.out.println("You said: " + sentence);
```

🔧 **Application**: Faster reading for large text blocks like essays, commands.

---

## 3. 🖨️ Writing Console Output (with PrintWriter)

### ➤ Using `PrintWriter`
```java
import java.io.*;

PrintWriter pw = new PrintWriter(System.out, true); // auto-flush enabled
pw.println("Hello from PrintWriter!");
pw.printf("Formatted output: %d + %d = %d\n", 5, 3, (5+3));
```

🔧 **Application**: Producing clean, formatted output in logs, reports, or user-facing CLI tools.

---

## 4. 📁 Reading and Writing Files

### ➤ Reading a File with `BufferedReader`
```java
import java.io.*;

BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
String line;
while ((line = reader.readLine()) != null) {
    System.out.println(line);
}
reader.close();
```

🔧 **Application**: Log readers, configuration loaders, parsing structured files.

---

### ➤ Writing to a File with `BufferedWriter`
```java
import java.io.*;

BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
writer.write("This is the first line.\n");
writer.write("This is the second line.");
writer.close();
```

🔧 **Application**: Saving reports, storing logs, writing configuration or generated content.

---

## ✅ Summary Table

```plaintext
+------------------------+----------------------------------------+
| I/O Task               | Recommended Class                     |
+------------------------+----------------------------------------+
| Console Input (simple) | Scanner                               |
| Console Input (char)   | InputStreamReader                     |
| Console Input (fast)   | BufferedReader                        |
| Console Output         | System.out, PrintWriter               |
| File Reading           | BufferedReader, FileReader            |
| File Writing           | BufferedWriter, FileWriter, PrintWriter|
+------------------------+----------------------------------------+
```

---

## 🌍 Real-World Applications

| Task                             | Where Used                                   |
|----------------------------------|----------------------------------------------|
| Read user commands               | Shell apps, terminal tools                   |
| Store user preferences           | Local config files                           |
| Export reports or logs           | Enterprise dashboards, data processing       |
| Process large text files         | File analyzers, compilers, interpreters      |
| Build CLI-based tools            | Dev tools, scripting engines                 |

---

## 🎯 Tips
- Always close your streams to free system resources.
- Use try-with-resources for automatic resource management.
```java
try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
    // read file
} catch (IOException e) {
    e.printStackTrace();
}
```

---

### 📌 Coming Up Next:
- File Handling (advanced features)
- Object Serialization
- Java NIO and Buffers
- Network I/O

---

> **Master Java I/O and you master how your applications talk to the real world.**


