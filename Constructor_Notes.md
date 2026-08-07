# Java Constructor

## What is a Constructor?

A Constructor is a special member of a class that is automatically called when an object of that class is created.

Its main purpose is to initialize the object.

Unlike normal methods, a constructor is executed automatically and is generally used to assign initial values to instance variables.

---

# Definition

A constructor is a special method that has the same name as the class and does not have any return type.

Example

```java
class Student{

    Student(){

        System.out.println("Constructor Called");

    }

}
```

Creating Object

```java
Student s = new Student();
```

Output

```
Constructor Called
```

---

# Characteristics of Constructor

- Constructor name must be the same as the class name.
- Constructor has no return type (not even void).
- Constructor executes automatically when an object is created.
- Constructor is used to initialize objects.
- Constructors can be overloaded.
- Constructors are NOT inherited.
- Every class can have one or more constructors.

---

# Syntax

```java
class ClassName{

    ClassName(){

        // Initialization Code

    }

}
```

---

# Example

```java
class Student{

    Student(){

        System.out.println("Object Created");

    }

}

public class Demo{

    public static void main(String[] args){

        Student s1 = new Student();
        Student s2 = new Student();

    }

}
```

Output

```
Object Created
Object Created
```

Reason

Constructor executes every time an object is created.

---

# Why do we use Constructors?

Without constructor

```java
class Student{

    String name;

}
```

Object

```java
Student s = new Student();
```

name = null

With constructor

```java
class Student{

    String name;

    Student(){

        name = "Ujjwal";

    }

}
```

Object

```java
Student s = new Student();

System.out.println(s.name);
```

Output

```
Ujjwal
```

Constructor initializes the object.

---

# Types of Constructors

Java mainly has two types of constructors.

1. Default Constructor
2. Parameterized Constructor

---

# 1. Default Constructor

A constructor with no parameters is called the Default Constructor.

Example

```java
class Student{

    Student(){

        System.out.println("Default Constructor");

    }

}
```

Output

```
Default Constructor
```

---

# Compiler Provided Default Constructor

If you do not write any constructor, Java automatically provides one.

Example

```java
class Student{

}
```

Internally Java creates

```java
Student(){

}
```

This is called the Compiler Generated Default Constructor.

---

# 2. User Defined Default Constructor

Example

```java
class Student{

    Student(){

        System.out.println("Created");

    }

}
```

Now compiler does NOT create another constructor.

---

# 3. Parameterized Constructor

A constructor that accepts parameters.

Example

```java
class Student{

    String name;
    int age;

    Student(String name, int age){

        this.name = name;
        this.age = age;

    }

}
```

Object

```java
Student s = new Student("Ujjwal",21);
```

Output

```
Name = Ujjwal
Age = 21
```

---

# this Keyword

this refers to the current object.

Example

```java
class Student{

    String name;

    Student(String name){

        this.name = name;

    }

}
```

Without this

```java
name = name;
```

This assigns parameter to itself.

With this

```java
this.name = name;
```

Current object's variable gets initialized.

---

# Constructor Overloading

A class can have multiple constructors with different parameter lists.

Example

```java
class Student{

    Student(){

        System.out.println("Default");

    }

    Student(String name){

        System.out.println(name);

    }

    Student(String name,int age){

        System.out.println(name+" "+age);

    }

}
```

Objects

```java
new Student();

new Student("Ujjwal");

new Student("Ujjwal",21);
```

Output

```
Default

Ujjwal

Ujjwal 21
```

---

# Constructor Chaining

One constructor can call another constructor of the same class using this().

Example

```java
class Student{

    Student(){

        this("Ujjwal");

        System.out.println("Default");

    }

    Student(String name){

        System.out.println(name);

    }

}
```

Output

```
Ujjwal

Default
```

Rules

- this() must be the first statement.
- Used to call another constructor in the same class.

---

# Constructor in Inheritance

Constructors are NOT inherited.

When a child object is created,

Parent Constructor executes first.

Example

```java
class Animal{

    Animal(){

        System.out.println("Animal");

    }

}

class Dog extends Animal{

    Dog(){

        System.out.println("Dog");

    }

}
```

Output

```
Animal

Dog
```

Reason

Java automatically inserts

```java
super();
```

inside every child constructor.

---

# super() Constructor

super() calls the constructor of the parent class.

Example

```java
class Parent{

    Parent(){

        System.out.println("Parent");

    }

}

class Child extends Parent{

    Child(){

        super();

        System.out.println("Child");

    }

}
```

Output

```
Parent

Child
```

---

# Parameterized Parent Constructor

Example

```java
class Parent{

    Parent(String name){

        System.out.println(name);

    }

}

class Child extends Parent{

    Child(){

        super("Java");

    }

}
```

Output

```
Java
```

---

# Constructor Execution Order

```
Object Creation

↓

Parent Constructor

↓

Child Constructor

↓

Object Ready
```

---

# Difference Between Constructor and Method

| Constructor | Method |
|-------------|--------|
| Same name as class | Any valid name |
| No return type | Must have return type (or void) |
| Called automatically | Called explicitly |
| Initializes object | Performs operations |
| Executes once per object creation | Can execute multiple times |

---

# Rules of Constructor

- Constructor name must match the class name.
- Constructor cannot have a return type.
- Constructor can have access modifiers.
- Constructor can be overloaded.
- Constructor cannot be overridden.
- Constructor cannot be inherited.
- Constructor can call another constructor using this().
- Constructor can call parent constructor using super().

---

# Advantages of Constructor

- Initializes object automatically.
- Reduces repeated initialization code.
- Makes code clean.
- Supports constructor overloading.
- Helps in object creation.

---

# Interview Questions

### What is Constructor?

A special method that initializes an object.

---

### Can constructor return a value?

No.

---

### Can constructor be inherited?

No.

---

### Can constructor be overridden?

No.

---

### Can constructor be overloaded?

Yes.

---

### Difference between this() and super()

this()

- Calls constructor of same class.

super()

- Calls constructor of parent class.

---

### Can constructor be static?

No.

---

### Can constructor be private?

Yes.

Private constructors are commonly used in the Singleton Design Pattern.

---

### When is constructor executed?

Automatically when an object is created.

---

# Summary

| Feature | Constructor |
|----------|------------|
| Same name as class | ✅ Yes |
| Return type | ❌ No |
| Automatic call | ✅ Yes |
| Overloading | ✅ Yes |
| Overriding | ❌ No |
| Inherited | ❌ No |
| Used for initialization | ✅ Yes |
| Can use this() | ✅ Yes |
| Can use super() | ✅ Yes |

---

# Key Points to Remember

- Constructor initializes an object.
- Constructor has the same name as the class.
- Constructor has no return type.
- Constructor executes automatically.
- Constructors can be overloaded but not overridden.
- Constructors are not inherited.
- `this()` calls another constructor in the same class.
- `super()` calls the parent class constructor.
- Parent constructor always executes before the child constructor.