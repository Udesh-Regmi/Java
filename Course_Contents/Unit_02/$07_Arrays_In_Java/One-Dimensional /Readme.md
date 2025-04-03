# 🔥 **Arrays in Java: From Basics to Matrices**  

An **array** in Java is a **collection of elements of the same data type** stored in contiguous memory locations. It provides **fast access** to elements using an index and is widely used for storing and manipulating data efficiently.  

---

## 📌 **1. Basics of Arrays in Java**  

### ✅ **Declaring an Array**  
```java
datatype[] arrayName;   // Preferred syntax
// OR
datatype arrayName[];   // Allowed, but less common
```
### ✅ **Creating an Array (Memory Allocation)**
```java
arrayName = new datatype[size];
```
### ✅ **Declaring & Initializing in One Step**
```java
int[] numbers = new int[5];  // Creates an array of size 5
```
### ✅ **Direct Initialization**
```java
int[] numbers = {10, 20, 30, 40, 50};  // No need for `new`
```

---

## 🟢 **2. One-Dimensional Array** (1D Array)  

A **one-dimensional array** stores a linear sequence of elements.

### ✅ **Example: Declaring, Initializing & Accessing Elements**
```java
public class OneDArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[5];  // Declares an array of size 5

        // Initializing elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Accessing elements using a loop
        System.out.println("One-Dimensional Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```
**💡 Output:**
```
One-Dimensional Array Elements:
10 20 30 40 50
```

---

## 🟢 **3. Two-Dimensional Array (Matrix)**  

A **two-dimensional array** (matrix) is a collection of **rows and columns**.

### ✅ **Declaring a 2D Array**
```java
datatype[][] arrayName = new datatype[rows][columns];
```
### ✅ **Direct Initialization**
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### ✅ **Example: Creating & Accessing a 2D Array**
```java
public class TwoDArrayExample {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];  // 3x3 matrix

        // Initializing elements
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
**💡 Output:**
```
2D Array (Matrix):
1 2 3 
4 5 6 
7 8 9 
```

---

## 🟢 **4. Jagged Array (Variable Column Size)**  

A **jagged array** is a **2D array with different column sizes** for each row.

### ✅ **Example: Creating a Jagged Array**
```java
public class JaggedArrayExample {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];  // Declare rows, but no fixed columns

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
**💡 Output:**
```
Jagged Array:
1 2 
3 4 5 
6 
```

---

## 🚀 **Key Takeaways**
✅ **1D Arrays:** Used for storing a linear list of elements.  
✅ **2D Arrays (Matrices):** Used for tabular data, graphs, and grid-based applications.  
✅ **Jagged Arrays:** Used when each row has a different number of elements.  
✅ **Fast Access:** Arrays provide O(1) time complexity for element access.  

---

## 🎯 **When to Use Arrays?**
✔ Storing **multiple values of the same type** efficiently.  
✔ Handling **data in tabular or grid formats** (like matrices).  
✔ **Optimized processing** of bulk data with loops.  

📌 **Mastering arrays is crucial for problem-solving, data structures, and algorithms in Java! 🚀**  

