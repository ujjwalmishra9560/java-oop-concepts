# Java Polymorphism

## What is Polymorphism?

Polymorphism is one of the four fundamental pillars of Object-Oriented Programming (OOP).

The word **Polymorphism** comes from two Greek words:

- **Poly** = Many
- **Morph** = Forms

Meaning:

> **One object, many forms.**

In Java, the same method can perform different tasks depending on the object that calls it.

---

# Real Life Example

Suppose you have a person.

The same person behaves differently in different situations.

- At Home → Son
- At Office → Employee
- With Friends → Friend

One person has many forms.

This is Polymorphism.

---

# Why Do We Need Polymorphism?

Without polymorphism, we would need different methods for every object.

With polymorphism:

- Less Code
- Better Flexibility
- Easy Maintenance
- Better Reusability
- Runtime Decision Making

---

# Types of Polymorphism

Java supports two types of polymorphism.

1. Compile-Time Polymorphism
2. Runtime Polymorphism

```
          Polymorphism
          /          \
         /            \
Compile Time      Runtime
(Method Overloading) (Method Overriding)
```

---

# 1. Compile-Time Polymorphism

Compile-Time Polymorphism is achieved using **Method Overloading**.

The compiler decides which method to call.

---

# Method Overloading

Method Overloading means having multiple methods with the same name but different parameter lists.

Rules

Methods must differ in:

- Number of Parameters
- Type of Parameters
- Order of Parameters

---

## Example

```java
class Calculator{

    int add(int a,int b){

        return a+b;

    }

    int add(int a,int b,int c){

        return a+b+c;

    }

    double add(double a,double b){

        return a+b;

    }

}

public class Demo{

    public static void main(String[] args){

        Calculator c=new Calculator();

        System.out.println(c.add(10,20));

        System.out.println(c.add(10,20,30));

        System.out.println(c.add(10.5,20.5));

    }

}
```

Output

```
30
60
31.0
```

---

# Method Overloading Rules

Allowed

```java
sum(int,int)

sum(int,int,int)

sum(double,double)

sum(int,double)
```

Not Allowed

Only changing return type

```java
int sum(int,int)

double sum(int,int)
```

Compile Time Error

---

# Advantages of Method Overloading

- Improves readability
- Reduces code duplication
- Easy to use
- Faster execution

---

# 2. Runtime Polymorphism

Runtime Polymorphism is achieved using **Method Overriding**.

The JVM decides which method to execute during runtime.

---

# Method Overriding

Method Overriding means a child class provides its own implementation of a parent class method.

---

## Example

```java
class Animal{

    void sound(){

        System.out.println("Animal Sound");

    }

}

class Dog extends Animal{

    @Override

    void sound(){

        System.out.println("Dog Barks");

    }

}
```

Object

```java
Dog d=new Dog();

d.sound();
```

Output

```
Dog Barks
```

---

# Runtime Example

```java
class Aeroplane{

    void fly(){

        System.out.println("Aeroplane is Flying");

    }

}

class CargoPlane extends Aeroplane{

    @Override

    void fly(){

        System.out.println("Cargo Plane is Flying");

    }

}

class PassengerPlane extends Aeroplane{

    @Override

    void fly(){

        System.out.println("Passenger Plane is Flying");

    }

}

public class Demo{

    public static void main(String[] args){

        Aeroplane a;

        a=new CargoPlane();

        a.fly();

        a=new PassengerPlane();

        a.fly();

    }

}
```

Output

```
Cargo Plane is Flying

Passenger Plane is Flying
```

---

# Upcasting

Creating Parent reference and Child object.

Syntax

```java
Parent obj=new Child();
```

Example

```java
Animal a=new Dog();
```

This is called Upcasting.

---

# Dynamic Method Dispatch

When Parent Reference points to Child Object,

the overridden method is decided at Runtime.

Example

```java
Animal a;

a=new Dog();

a.sound();

a=new Cat();

a.sound();
```

Output

```
Dog Barks

Cat Meows
```

The decision is taken by JVM during runtime.

---

# Rules of Method Overriding

- Same Method Name
- Same Parameters
- Same Return Type (or Covariant Return Type)
- Child class inherits Parent class
- Cannot reduce access level
- Cannot override final method
- Static methods are hidden, not overridden

---

# Overloading vs Overriding

| Method Overloading | Method Overriding |
|--------------------|-------------------|
| Same Class | Parent & Child |
| Compile Time | Runtime |
| Different Parameters | Same Parameters |
| Improves Readability | Supports Runtime Polymorphism |
| Multiple Methods | Redefines Existing Method |

---

# Can We Override Static Methods?

No.

Static methods belong to the class.

They are hidden, not overridden.

---

# Can We Override Final Methods?

No.

Example

```java
class A{

    final void show(){

    }

}

class B extends A{

    void show(){

    }

}
```

Compile Time Error

---

# Can Constructors be Overridden?

No.

Constructors are not inherited.

Hence they cannot be overridden.

---

# Can Private Methods be Overridden?

No.

Private methods are not accessible in child class.

---

# Advantages of Polymorphism

- Code Reusability
- Flexibility
- Loose Coupling
- Easy Maintenance
- Runtime Decision Making
- Extensible Code

---

# Disadvantages

- Slight Performance Overhead
- Runtime debugging can be difficult
- Complex inheritance may reduce readability

---

# Real Life Examples

- ATM Machine
- Payment Gateway
- Mobile Notification
- Vehicle System
- Employee Management
- Banking System

---

# Interview Questions

### What is Polymorphism?

One object behaving in multiple forms.

---

### Types of Polymorphism?

- Compile-Time
- Runtime

---

### Compile-Time Polymorphism is achieved by?

Method Overloading.

---

### Runtime Polymorphism is achieved by?

Method Overriding.

---

### What is Method Overloading?

Same method name with different parameters.

---

### What is Method Overriding?

Child class provides its own implementation of parent method.

---

### Can Constructors be overloaded?

Yes.

---

### Can Constructors be overridden?

No.

---

### Can Static Methods be overridden?

No.

---

### Can Final Methods be overridden?

No.

---

### What is Upcasting?

```java
Parent obj=new Child();
```

---

### What is Dynamic Method Dispatch?

Calling overridden methods using Parent reference and Child object.

Decision is taken at Runtime.

---

# Summary

| Feature | Overloading | Overriding |
|----------|-------------|------------|
| Parameters | Different | Same |
| Return Type | Can differ | Same/Covariant |
| Compile Time | Yes | No |
| Runtime | No | Yes |
| Inheritance Needed | No | Yes |

---

# Key Points to Remember

- Polymorphism means **One Object, Many Forms**.
- Java supports Compile-Time and Runtime Polymorphism.
- Compile-Time Polymorphism uses **Method Overloading**.
- Runtime Polymorphism uses **Method Overriding**.
- Parent Reference + Child Object = **Upcasting**.
- JVM decides overridden methods during Runtime (**Dynamic Method Dispatch**).
- Static methods are hidden, not overridden.
- Final methods cannot be overridden.
- Constructors can be overloaded but cannot be overridden.