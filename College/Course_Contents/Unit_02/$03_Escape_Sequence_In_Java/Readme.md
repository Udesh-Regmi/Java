# 🏆 Java Escape Sequences Guide

Escape sequences in Java are special character combinations used to represent **whitespace, special symbols, or control characters** within strings. These sequences start with a **backslash (`\`)** followed by a specific character.

## ✨ List of Common Escape Sequences

| Escape Sequence | Description | Example Output |
|----------------|-------------|----------------|
| `\n` | New Line | `Hello\nWorld` → Hello <br> World |
| `\t` | Tab (Indentation) | `Hello\tWorld` → Hello    World |
| `\b` | Backspace | `Hello\bWorld` → HellWorld |
| `\r` | Carriage Return | `Hello\rWorld` → Moves cursor to start of line |
| `\f` | Form Feed | Used in printers and text documents |
| `\'` | Single Quote | `'It\'s Java!'` → It's Java! |
| `\"` | Double Quote | `"Java\"` → "Java" |
| `\\` | Backslash | `C:\\Users\\Admin` → C:\Users\Admin |

## 📌 Examples of Usage

### ✅ Using `\n` for Multi-line Output
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Hello\nWorld");
    }
}
```
**Output:**
```
Hello
World
```

### ✅ Using `\t` for Formatting Output
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("Name\tAge\tLocation");
        System.out.println("John\t25\tNew York");
    }
}
```
**Output:**
```
Name    Age    Location
John    25    New York
```

### ✅ Handling Quotes in Strings
```java
public class EscapeExample {
    public static void main(String[] args) {
        System.out.println("She said, \"Java is amazing!\"");
    }
}
```
**Output:**
```
She said, "Java is amazing!"
```

## 🚀 When to Use Escape Sequences?
- Formatting text output
- Embedding special characters in strings
- Handling file paths in Windows (`C:\\Users\\Admin`)
- Writing structured data (like CSV, JSON)

## 🎯 Conclusion
Escape sequences **enhance string manipulation** in Java, ensuring flexibility and readability in text-based applications. Mastering them helps in **formatting, handling special characters, and improving user experience.** 🚀

---

