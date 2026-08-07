# Java Inheritance

## What is Inheritance?

Inheritance is one of the four fundamental pillars of Object-Oriented Programming (OOP).

Inheritance is a mechanism in Java that allows one class to acquire the properties (data members) and behaviors (methods) of another class.

In simple words:

> One class can reuse the code of another class instead of writing it again.

This helps in:

- Code Reusability
- Easy Maintenance
- Extensibility
- Reduces Code Duplication

---

# Real Life Example

Suppose there is an **Aeroplane**.

Every aeroplane can:

- Fly
- Take Off
- Land

Now there are different types of aeroplanes:

- Passenger Plane
- Cargo Plane
- Fighter Plane

Instead of writing the same methods in every class, we write them once inside the parent class.

```
               Aeroplane
              /     |     \
             /      |      \
PassengerPlane CargoPlane FighterPlane
```

All child classes automatically get the methods of Aeroplane.

---

# Syntax

```java
class Parent {

}

class Child extends Parent {

}
```

Example

```java
class Aeroplane{

    void fly(){
        System.out.println("Flying");
    }

}

class PassengerPlane extends Aeroplane{

}
```

---

# Terminology

| Parent Class | Child Class |
|--------------|------------|
| Super Class | Sub Class |
| Base Class | Derived Class |

Example

```java
class Animal{

}

class Dog extends Animal{

}
```

Animal → Parent Class

Dog → Child Class

---

# Example

```java
class Aeroplane{

    void fly(){
        System.out.println("Aeroplane is Flying");
    }

    void takeOff(){
        System.out.println("Taking Off");
    }

}

class PassengerPlane extends Aeroplane{

}

public class Demo{

    public static void main(String[] args){

        PassengerPlane pp=new PassengerPlane();

        pp.fly();
        pp.takeOff();

    }

}
```

Output

```
Aeroplane is Flying
Taking Off
```

Reason

PassengerPlane inherited both methods from Aeroplane.

---

# extends Keyword

Inheritance is achieved using the **extends** keyword.

Syntax

```java
class Child extends Parent{

}
```

Example

```java
class Animal{

}

class Dog extends Animal{

}
```

Dog inherits all accessible members of Animal.

---

# What gets inherited?

Child class inherits

✔ Variables

✔ Methods

✔ Nested Classes

Child class does NOT inherit

❌ Constructors

❌ Private Members (directly)

---

# Constructor and Inheritance

Most Important Interview Question

### Does Constructor get inherited?

Answer:

No.

Constructor is **NOT inherited**.

But...

When a child object is created, Java automatically calls the parent constructor first.

Example

```java
class Aeroplane{

    Aeroplane(){
        System.out.println("Parent Constructor");
    }

}

class PassengerPlane extends Aeroplane{

}

public class Demo{

    public static void main(String[] args){

        PassengerPlane pp=new PassengerPlane();

    }

}
```

Output

```
Parent Constructor
```

---

# Why does Parent Constructor execute?

Because Java automatically inserts

```java
super();
```

inside every child constructor.

Internally Java writes

```java
PassengerPlane(){

    super();

}
```

---

# Child Constructor Example

```java
class Aeroplane{

    Aeroplane(){
        System.out.println("Parent Constructor");
    }

}

class PassengerPlane extends Aeroplane{

    PassengerPlane(){
        System.out.println("Child Constructor");
    }

}
```

Output

```
Parent Constructor
Child Constructor
```

Execution Flow

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

# super() Keyword

super() is used to call the constructor of the parent class.

Syntax

```java
super();
```

Rules

- Must be the first statement.
- Used inside constructor.
- Calls parent constructor.

Example

```java
class Animal{

    Animal(){
        System.out.println("Animal");
    }

}

class Dog extends Animal{

    Dog(){

        super();

        System.out.println("Dog");

    }

}
```

Output

```
Animal
Dog
```

---

# Parameterized Constructor

Example

```java
class Animal{

    Animal(String name){

        System.out.println(name);

    }

}

class Dog extends Animal{

    Dog(){

        super("German Shepherd");

    }

}
```

Output

```
German Shepherd
```

---

# Important Rule

If parent has ONLY parameterized constructor

```java
class Parent{

    Parent(int x){

    }

}
```

Then child must call

```java
super(10);
```

Otherwise

Compile Time Error

---

# Constructor Calling Order

Always

```
Parent Constructor

↓

Child Constructor
```

Never

```
Child

↓

Parent
```

---

# Method Overriding

Child class can provide its own implementation of parent's method.

Example

```java
class Animal{

    void sound(){
        System.out.println("Animal Sound");
    }

}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Bark");
    }

}
```

Output

```
Bark
```

---

# Types of Inheritance

## 1. Single Inheritance

One Parent

One Child

```
A

↓

B
```

Example

```java
class A{

}

class B extends A{

}
```

---

## 2. Multilevel Inheritance

```
A

↓

B

↓

C
```

Example

```java
class A{

}

class B extends A{

}

class C extends B{

}
```

---

## 3. Hierarchical Inheritance

```
        A
      / | \
     B  C  D
```

Example

```java
class A{

}

class B extends A{

}

class C extends A{

}

class D extends A{

}
```

---

## 4. Multiple Inheritance

```
A     B

 \   /

   C
```

Java Classes do NOT support Multiple Inheritance.

Reason

Diamond Problem

Instead Java uses Interfaces.

---

## 5. Hybrid Inheritance

Combination of multiple inheritance types.

Not supported through classes.

Can be achieved using Interfaces.

---

# Advantages

- Code Reusability
- Less Code
- Better Maintainability
- Easy Extension
- Supports Runtime Polymorphism
- Faster Development

---

# Disadvantages

- Tight Coupling
- Deep inheritance is difficult to understand
- Changes in parent may affect child
- Multiple inheritance not supported through classes

---

# Interview Questions

### What is Inheritance?

Mechanism by which one class acquires properties and methods of another class.

---

### Which keyword is used?

extends

---

### Does Java support multiple inheritance?

No.

Using classes → No

Using interfaces → Yes

---

### Does constructor inherit?

No.

---

### Why does parent constructor execute?

Because Java automatically inserts

```
super();
```

---

### Which constructor executes first?

Parent Constructor

Then

Child Constructor

---

### Can private members be inherited?

Yes, they are part of the object, but they cannot be accessed directly from the child class. Access is possible through public/protected methods provided by the parent.

---

### Can final class be inherited?

No.

Example

```java
final class A{

}

class B extends A{

}
```

Compile Time Error

---

### Can we inherit static methods?

Static methods belong to the class, not the object. They can be accessed by the child class but are not overridden in the normal sense (they are hidden).

---

# Summary

| Feature | Inherited? |
|----------|------------|
| Variables | ✅ Yes |
| Methods | ✅ Yes |
| Constructors | ❌ No |
| Private Members (direct access) | ❌ No |
| Static Methods | ✅ Accessible (Hidden, not overridden) |
| Final Class | ❌ Cannot be inherited |

---

# Key Points to Remember

- Inheritance uses **extends** keyword.
- Constructor is **not inherited**.
- Parent constructor executes before child constructor.
- Java automatically inserts **super()**.
- Java supports Single, Multilevel and Hierarchical inheritance through classes.
- Multiple inheritance through classes is **not supported**.
- Interfaces are used to achieve multiple inheritance behavior.