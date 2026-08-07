# Java Interface

## What is an Interface?

An Interface is a blueprint of a class.

It is used to achieve **Abstraction** and **Multiple Inheritance** in Java.
An interface contains method declarations (without implementation), and the implementing class provides the method implementation.
In simple words:
> **Interface tells WHAT to do, but not HOW to do it.**
---
# Real Life Example
## TV Remote
A TV Remote has buttons like:

- Power ON
- Power OFF
- Volume Up
- Volume Down

The remote only provides the buttons (functionality).

The internal implementation of how the TV works is hidden.

This is Interface.

---

# Another Example

## Payment Gateway

Payment Interface

- Pay()

Implementations

- Google Pay
- PhonePe
- Paytm

All payment apps implement the same interface differently.

---

# Why Do We Need Interface?

Without Interface

Every class has different methods.

No common structure.

With Interface

✔ Standardization

✔ Multiple Inheritance

✔ Loose Coupling

✔ Flexibility

✔ Better Design

---

# Syntax

```java
interface Animal{

    void sound();

}
```

Implementation

```java
class Dog implements Animal{

    public void sound(){

        System.out.println("Dog Barks");

    }

}
```

---

# Complete Example

```java
interface Animal{

    void sound();

}

class Dog implements Animal{

    public void sound(){

        System.out.println("Dog Barks");

    }

}

public class Demo{

    public static void main(String[] args){

        Dog d=new Dog();

        d.sound();

    }

}
```

Output

```
Dog Barks
```

---

# Important Points

- Interface uses interface keyword.
- Class uses implements keyword.
- Interface cannot be instantiated.
- All methods are public and abstract by default (unless declared default/static/private in newer Java versions).
- All variables are public static final by default.

---

# Interface Variables

Example

```java
interface Demo{

    int x=10;

}
```

Internally Java treats it as

```java
public static final int x=10;
```

Example

```java
System.out.println(Demo.x);
```

Output

```
10
```

Trying to modify

```java
Demo.x=20;
```

Compile Time Error

Reason

Variable is final.

---

# Interface Methods

```java
interface Animal{

    void sound();

}
```

Internally

```java
public abstract void sound();
```

---

# Implementing Multiple Interfaces

One class can implement multiple interfaces.

Example

```java
interface A{

    void show();

}

interface B{

    void display();

}

class Demo implements A,B{

    public void show(){

        System.out.println("Show");

    }

    public void display(){

        System.out.println("Display");

    }

}
```

Output

```
Show

Display
```

---

# Multiple Inheritance using Interface

```
      A        B
       \      /
        \    /
         Demo
```

Java classes cannot extend multiple classes.

But they can implement multiple interfaces.

---

# Interface Reference

Example

```java
interface Animal{

    void sound();

}

class Dog implements Animal{

    public void sound(){

        System.out.println("Dog");

    }

}
```

Object

```java
Animal a=new Dog();

a.sound();
```

Output

```
Dog
```

---

# Default Methods (Java 8)

Interface can contain default methods.

Example

```java
interface Animal{

    default void eat(){

        System.out.println("Eating");

    }

}
```

Implementation

```java
class Dog implements Animal{

}
```

Object

```java
Dog d=new Dog();

d.eat();
```

Output

```
Eating
```

---

# Static Methods (Java 8)

Example

```java
interface Demo{

    static void show(){

        System.out.println("Static");

    }

}
```

Calling

```java
Demo.show();
```

Output

```
Static
```

---

# Private Methods (Java 9)

Interfaces can contain private methods.

Example

```java
interface Demo{

    private void show(){

        System.out.println("Private");

    }

}
```

Private methods are used internally within the interface.

---

# Functional Interface

An interface containing only one abstract method is called a Functional Interface.

Example

```java
@FunctionalInterface

interface Calculator{

    int add(int a,int b);

}
```

Used with

- Lambda Expressions
- Streams
- Method References

---

# Marker Interface

An interface with no methods.

Example

```java
interface Serializable{

}
```

Purpose

Provides metadata to JVM or frameworks.

Examples

- Serializable
- Cloneable
- Remote

---

# Interface vs Abstract Class

| Interface | Abstract Class |
|------------|----------------|
| interface keyword | abstract class keyword |
| Uses implements | Uses extends |
| No constructors | Constructors allowed |
| Multiple inheritance | Single inheritance |
| Variables are public static final | Normal instance variables allowed |
| Methods are public abstract by default | Can contain abstract and normal methods |

---

# Interface vs Class

| Interface | Class |
|------------|------|
| Blueprint | Actual implementation |
| Cannot create object | Object can be created |
| Uses implements | Uses extends for inheritance |
| Supports multiple inheritance | Does not support multiple inheritance |

---

# Advantages of Interface

- Achieves Abstraction
- Supports Multiple Inheritance
- Loose Coupling
- Better Code Reusability
- Easy Testing
- Better Design
- Standardization

---

# Disadvantages

- More classes increase complexity.
- Requires implementation in child class.
- Slight learning curve.

---

# Real Life Examples

- ATM Machine
- TV Remote
- Payment Gateway
- Printer Driver
- USB Device
- Keyboard
- Mouse

---

# Interview Questions

### What is Interface?

A blueprint of a class used to achieve abstraction and multiple inheritance.

---

### Which keyword is used?

```
interface
```

---

### Which keyword is used to inherit Interface?

```
implements
```

---

### Can we create object of Interface?

No.

---

### Can Interface have Constructor?

No.

---

### Can Interface have Variables?

Yes.

They are

```
public static final
```

---

### Can Interface have Methods?

Yes.

- Abstract Methods
- Default Methods
- Static Methods
- Private Methods (Java 9)

---

### Can Interface contain concrete methods?

Yes.

Using

```
default
```

and

```
static
```

methods.

---

### Can Interface support Multiple Inheritance?

Yes.

Example

```java
class Demo implements A,B{

}
```

---

### Can Interface extend another Interface?

Yes.

Example

```java
interface A{

}

interface B extends A{

}
```

---

### Difference between extends and implements

```
extends

Class → Class

Interface → Interface
```

```
implements

Class → Interface
```

---

### What is Functional Interface?

Interface having only one abstract method.

---

### What is Marker Interface?

Interface having no methods.

Examples

- Serializable
- Cloneable

---

# Summary

| Feature | Interface |
|----------|-----------|
| Object Creation | ❌ No |
| Constructors | ❌ No |
| Variables | ✅ public static final |
| Abstract Methods | ✅ Yes |
| Default Methods | ✅ Yes |
| Static Methods | ✅ Yes |
| Private Methods | ✅ Java 9+ |
| Multiple Inheritance | ✅ Yes |

---

# Key Points to Remember

- Interface is a blueprint of a class.
- Interface is used to achieve abstraction.
- Interface supports multiple inheritance.
- Class uses **implements** keyword.
- Interface variables are **public static final**.
- Interface methods are **public abstract** by default.
- Interface cannot have constructors.
- Interface can have **default**, **static**, and **private** methods (Java 8/9+).
- Functional Interface contains only one abstract method.
- Marker Interface contains no methods.