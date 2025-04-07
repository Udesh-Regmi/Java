


## 🧠 Object Serialization in Java

### ➤ What is Serialization?
Serialization is the process of converting an object into a **byte stream** so it can be saved to a file, transferred over a network, or stored for later use.

```java
import java.io.*;

class Person implements Serializable {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Writing the object
ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
out.writeObject(new Person("Udesh", 25));
out.close();

// Reading it back
ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
Person p = (Person) in.readObject();
System.out.println(p.name + " - " + p.age);
in.close();
```

🔧 **Use Case**: Saving app state, storing user profiles, caching in distributed systems.

---

## ⚡ Memory-Mapped Files (Java NIO)

### ➤ What is a Memory-Mapped File?
A memory-mapped file allows you to map a portion of a file directly into memory. This enables **fast, random access** and is efficient for large files.

```java
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

RandomAccessFile file = new RandomAccessFile("bigfile.txt", "rw");
FileChannel channel = file.getChannel();
MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 1024);

buffer.put(0, (byte) 65); // Write 'A' at position 0
System.out.println((char) buffer.get(0)); // Read from memory
channel.close();
file.close();
```

🔧 **Use Case**: Large file editing (video, logs), performance-critical data operations.

---

## 📦 Working with ZIP and JAR Files

### ➤ Creating a ZIP File
```java
import java.io.*;
import java.util.zip.*;

FileOutputStream fos = new FileOutputStream("archive.zip");
ZipOutputStream zos = new ZipOutputStream(fos);
ZipEntry entry = new ZipEntry("data.txt");
zos.putNextEntry(entry);

zos.write("Hello from zipped file!".getBytes());
zos.closeEntry();
zos.close();
```

### ➤ Reading from a ZIP File
```java
ZipInputStream zis = new ZipInputStream(new FileInputStream("archive.zip"));
ZipEntry entry = zis.getNextEntry();
while (entry != null) {
    System.out.println("Reading: " + entry.getName());
    entry = zis.getNextEntry();
}
zis.close();
```

🔧 **Use Case**: Data compression, packaging apps, archiving logs or exports.

---

## 🔁 Multithreaded File Processing

### ➤ Example: Counting Lines in Parallel
```java
import java.nio.file.*;
import java.util.concurrent.*;

ExecutorService executor = Executors.newFixedThreadPool(4);
Files.list(Paths.get("data_folder"))
     .filter(Files::isRegularFile)
     .forEach(path -> executor.submit(() -> {
         try {
             long count = Files.lines(path).count();
             System.out.println(path.getFileName() + ": " + count + " lines");
         } catch (IOException e) {
             e.printStackTrace();
         }
     }));
executor.shutdown();
```

🔧 **Use Case**: Log analyzers, large dataset processors, real-time pipeline apps.

---



