# Java Installation and Development Environments

## Introduction
Java is a powerful, object-oriented programming language used for building cross-platform applications. It follows the principle of "Write Once, Run Anywhere" (WORA), meaning Java programs can run on different platforms without modification. Java is widely used for web applications, mobile apps, enterprise software, and system programming.

---

## 1. Understanding Java Compilation and Execution

### 1.1 How Java Works
Java programs go through multiple stages before execution:
1. **Writing Code:** You write a `.java` file containing Java source code.
2. **Compilation:** The Java compiler (`javac`) converts `.java` files into bytecode (`.class` files).
3. **Execution:** The Java Virtual Machine (JVM) interprets and runs the bytecode on any system with Java installed.

This approach ensures platform independence since JVMs are available for different operating systems.

### 1.2 Java Runtime Components
- **JDK (Java Development Kit):** Includes tools for compiling and running Java programs.
- **JVM (Java Virtual Machine):** Runs Java bytecode.
- **JRE (Java Runtime Environment):** Provides libraries and components needed for running Java applications.

---

## 2. Installing Java on Kali Linux
Kali Linux does not come with Java pre-installed. Follow these steps to install it:

### 2.1 Check if Java is Installed
```sh
java -version
```
If Java is not found, proceed with installation.

### 2.2 Install OpenJDK on Kali Linux
```sh
sudo apt update
sudo apt install openjdk-17-jdk -y
```

Verify installation:
```sh
java -version
javac -version
```

### 2.3 Set Up Java Environment Variables
```sh
echo 'export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64' >> ~/.bashrc
echo 'export PATH=$JAVA_HOME/bin:$PATH' >> ~/.bashrc
source ~/.bashrc
```

---

## 3. Compilation and Execution of Java Programs

### 3.1 Writing a Java Program
Create a file `HelloWorld.java`:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 3.2 Compile the Program
```sh
javac HelloWorld.java
```
This generates `HelloWorld.class` (bytecode).

### 3.3 Run the Compiled Program
```sh
java HelloWorld
```
Expected output:
```
Hello, World!
```

---

## 4. Setting Up Development Environments

### 4.1 NetBeans Installation and Usage
NetBeans is a Java IDE that simplifies coding and debugging.

#### Install NetBeans on Kali Linux
```sh
sudo apt install netbeans -y
```

#### Running NetBeans
```sh
netbeans &
```

#### Creating and Running a Java Project in NetBeans
1. Open NetBeans.
2. Click on "File" > "New Project".
3. Select "Java Application" and click "Next".
4. Name the project and click "Finish".
5. Write your Java code in `Main.java`.
6. Click "Run" (or press `Shift + F6`) to execute.

---

### 4.2 Visual Studio Code (VS Code) Setup
VS Code requires an extension for Java development.

#### Install VS Code on Kali Linux
```sh
sudo snap install --classic code
```

#### Install Java Extension Pack
1. Open VS Code.
2. Go to Extensions (`Ctrl+Shift+X`).
3. Search for "Java Extension Pack" and install it.

#### Compile and Run Java in VS Code
1. Open a terminal in VS Code (`Ctrl+``).
2. Run:
```sh
javac HelloWorld.java && java HelloWorld
```
3. You can also use the "Run" button if extensions are installed.

---

### 4.3 IntelliJ IDEA Installation and Usage
IntelliJ IDEA is a powerful IDE for Java development.

#### Install IntelliJ IDEA on Kali Linux
```sh
sudo snap install intellij-idea-community --classic
```

#### Running IntelliJ IDEA
```sh
intellij-idea-community &
```

#### Creating and Running a Java Project in IntelliJ
1. Open IntelliJ IDEA.
2. Click "New Project".
3. Select "Java" and configure the SDK (JDK should be installed).
4. Name the project and click "Finish".
5. Write Java code in `Main.java`.
6. Click "Run" (or press `Shift + F10`).

---

## 5. Additional Java Tools
- **Maven**: Build automation tool (`sudo apt install maven -y`).
- **Gradle**: Alternative to Maven (`sudo apt install gradle -y`).
- **Jenkins**: Continuous integration tool (`sudo apt install jenkins -y`).

---

## Conclusion
You have successfully installed Java on Kali Linux, set up development environments, and learned how Java programs are compiled and executed. Now, you can start developing Java applications efficiently!

