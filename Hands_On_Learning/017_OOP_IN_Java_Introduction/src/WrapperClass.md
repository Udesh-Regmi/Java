



## ✅  Code (Recap)

```java
public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer num = 10;
        System.out.println(num.compareTo(a));
    }
}
```

### 🔍 Output

```
0
```

This means `num` is equal to `a`. The `.compareTo()` method returns:

* `0` → if equal
* `< 0` → if less than
* `> 0` → if greater than

---

## ✅ What You Got Right

* **Primitives vs. Wrapper** distinction ✅
* Mentioned **memory model** (stack vs heap) ✅
* Showed **`compareTo()`** method ✅

---

## 🔧 Clarification and Improvements

### 🔹 1. **Autoboxing and Unboxing**

```java
Integer num = 10;  // Autoboxing
int a = num;       // Unboxing
```

Java automatically converts between `int` and `Integer`:

* **Autoboxing**: `int → Integer`
* **Unboxing**: `Integer → int`

In your example:

```java
System.out.println(num.compareTo(a));
```

Here, `a` is **autoboxed** to `Integer.valueOf(a)` so that the `compareTo(Integer other)` method can be called.

> ⚠️ **Behind the scenes**, this line becomes:

```java
System.out.println(num.compareTo(Integer.valueOf(a)));
```

---

### 🔹 2. **Why Use Wrapper Classes?**

| Purpose                                                 | Example                                      |
| ------------------------------------------------------- | -------------------------------------------- |
| Collections (like `ArrayList`) don’t support primitives | `List<Integer> list = new ArrayList<>();`    |
| Useful methods                                          | `Integer.parseInt("123")`, `num.compareTo()` |
| Null safety (can be null)                               | `Integer num = null;`                        |
| Boxing/unboxing                                         | Seamless primitive-object interaction        |

---

### 🔹 3. **Memory Behavior**

| Type      | Stored in                          | Mutable?      |
| --------- | ---------------------------------- | ------------- |
| `int`     | Stack                              | ✅             |
| `Integer` | Object in Heap, reference in Stack | ❌ (immutable) |

> So yes — your comment is technically correct:

```java
// Stack (primitive)
int a = 10;

// Stack (ref) + Heap (Integer object)
Integer num = 10;
```

---

## ✅ Suggested Comments & Clean Version

Here’s your improved version, professionally written:

```java
public class WrapperClass {
    public static void main(String[] args) {
        // Primitive type: stored directly in stack memory, faster access, less memory
        int a = 10;

        // Wrapper class (Integer): object stored in heap, reference in stack
        Integer num = 10;  // Autoboxing: primitive 10 is converted to Integer object

        // Using compareTo(): available only in wrapper classes (not in primitives)
        // Returns 0 if equal, >0 if greater, <0 if smaller
        System.out.println(num.compareTo(a));  // Output: 0
    }
}
```

---

## 🔥 Bonus: What if you do this?

```java
Integer x = 128;
Integer y = 128;
System.out.println(x == y); // false
```

### Why?

Because values > 127 aren’t cached by the JVM. For values between `-128` and `127`, Java caches the Integer objects (Integer Pool).

```java
Integer a = 100;
Integer b = 100;
System.out.println(a == b); // true

Integer x = 128;
Integer y = 128;
System.out.println(x == y); // false
```

> Use `.equals()` instead of `==` for comparing wrapper objects.

---

## 🧠 Summary

| Concept         | Details                                        |
| --------------- | ---------------------------------------------- |
| Primitives      | Fast, low memory, stack                        |
| Wrapper classes | Objects, heap memory, useful methods           |
| Autoboxing      | `int → Integer`                                |
| Unboxing        | `Integer → int`                                |
| `==`            | Compares references (for objects)              |
| `.equals()`     | Compares values (should be used with wrappers) |

---

