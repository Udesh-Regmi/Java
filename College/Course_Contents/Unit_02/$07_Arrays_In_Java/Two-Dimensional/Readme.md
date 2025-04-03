# 🔥 **Multidimensional Arrays in Java**  

A **multidimensional array** in Java is an array that contains more than one dimension, allowing elements to be stored in multiple rows and columns. The most common type is the **two-dimensional array (2D array)**, but Java also supports **higher-dimensional arrays** like 3D and beyond.  

---

## 📌 **1. Declaring and Initializing Multidimensional Arrays**  

### ✅ **Syntax for Declaring a Multidimensional Array**  
```java
datatype[][] arrayName;   // 2D array
datatype[][][] arrayName; // 3D array
```

### ✅ **Creating a Multidimensional Array**
```java
datatype[][] arrayName = new datatype[rows][columns];  // 2D array
datatype[][][] arrayName = new datatype[depth][rows][columns];  // 3D array
```

### ✅ **Direct Initialization**
```java
int[][] matrix = {
    {1, 2, 3}, 
    {4, 5, 6}, 
    {7, 8, 9}
};  // 3x3 matrix
```

---

## 🟢 **2. Two-Dimensional Arrays (2D Array - Matrix)**  

A **2D array** is similar to a table with rows and columns.

### ✅ **Example: Declaring, Initializing, and Accessing a 2D Array**
```java
public class TwoDArrayExample {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];  // 3x3 matrix

        // Initializing values
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = value++;
            }
        }

        // Printing matrix
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // New line after each row
        }
    }
}
```
### 💡 **Output:**
```
2D Array (Matrix):
1 2 3 
4 5 6 
7 8 9 
```

---

## 🟢 **3. Three-Dimensional Arrays (3D Array - Cube Structure)**  

A **3D array** adds an extra layer, forming a **cube-like structure**.

### ✅ **Example: Creating & Accessing a 3D Array**
```java
public class ThreeDArrayExample {
    public static void main(String[] args) {
        int[][][] cube = new int[2][2][2];  // 2x2x2 cube

        // Initializing values
        int value = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    cube[i][j][k] = value++;
                }
            }
        }

        // Printing 3D array
        System.out.println("3D Array (Cube):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println(); // New line for better readability
            }
            System.out.println(); // Space between layers
        }
    }
}
```
### 💡 **Output:**
```
3D Array (Cube):
1 2 
3 4 

5 6 
7 8 
```

---

## 🟢 **4. Jagged Arrays (Unequal Column Sizes in 2D Arrays)**  

A **jagged array** is a special type of **2D array** where **each row can have a different number of columns**.

### ✅ **Example: Creating a Jagged Array**
```java
public class JaggedArrayExample {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];  // Declaring 3 rows

        // Assigning different column sizes
        jaggedArray[0] = new int[2];  // Row 1 has 2 columns
        jaggedArray[1] = new int[3];  // Row 2 has 3 columns
        jaggedArray[2] = new int[1];  // Row 3 has 1 column

        // Initializing values
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;
        jaggedArray[2][0] = 6;

        // Printing Jagged Array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
### 💡 **Output:**
```
Jagged Array:
1 2 
3 4 5 
6 
```

---

## 🚀 **Key Takeaways**
✅ **Multidimensional arrays** allow storing data in rows & columns, useful for matrices, grids, and 3D structures.  
✅ **2D arrays (matrices)** are widely used in real-world applications like **image processing, game development, and databases**.  
✅ **3D arrays** help in **complex simulations, graphics, and 3D modeling**.  
✅ **Jagged arrays** save memory by allowing variable-length rows.  
✅ **Looping through multidimensional arrays** efficiently requires nested loops.  

---

## 🎯 **When to Use Multidimensional Arrays?**
✔ **Mathematical computations (matrices, graphs, etc.).**  
✔ **Game development (storing map layouts, 3D coordinates, etc.).**  
✔ **Image processing (storing pixel data in 2D/3D formats).**  
✔ **Machine learning & AI (tensor operations, multidimensional data storage).**  

📌 **Mastering multidimensional arrays is crucial for advanced Java programming, data structures, and real-world applications! 🚀**  

