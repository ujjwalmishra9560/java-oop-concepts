# Java Abstraction

## What is Abstraction?

Abstraction is one of the four fundamental pillars of Object-Oriented Programming (OOP).

Abstraction means **hiding implementation details and showing only the essential features** of an object.

In simple words:

> **Show What to Do, Hide How to Do It.**

The user only knows **what** a method does, not **how** it is implemented.

---

# Real Life Example

## ATM Machine

When you withdraw money from an ATM:

- You insert the card.
- Enter the PIN.
- Select Withdraw.
- Get the cash.

You don't know:

- How the bank server processes the request.
- How the balance is updated.
- How the cash dispenser works internally.

Only the necessary functionality is visible.

This is Abstraction.

---

# Another Example

## Car

You know:

- Start()
- Stop()
- Accelerate()

But you don't know how:

- Fuel Injection works
- Engine works
- ECU works

The internal implementation is hidden.

---

# Why Do We Need Abstraction?

Without abstraction:

- Users can access unnecessary implementation.
- Code becomes complex.
- Security decreases.

With abstraction:

- Only important functionality is visible.
- Internal logic remains hidden.
- Better security.
- Better maintainability.

---

# How is Abstraction Achieved in Java?

Java provides two ways:

1. Abstract Class
2. Interface

```
        Abstraction
        /         \
       /           \
Abstract Class   Interface
```

---

# Abstract Class

A class declared with the **abstract** keyword is called an Abstract Class.

Syntax

```java
abstract class Animal{

}
```

Properties

- Cannot create objects.
- Can contain abstract methods.
- Can contain normal methods.
- Can contain constructors.
- Can contain variables.

---

# Abstract Method

A method without a body is called an Abstract Method.

Syntax

```java
abstract void sound();
```

Example

```java
abstract class Animal{

    abstract void sound();

}
```

Notice

No method body.

Only declaration.

---

# Complete Example

```java
abstract class Animal{

    abstract void sound();

}

class Dog extends Animal{

    @Override

    void sound(){

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

# Another Example

```java
abstract class Aeroplane{

    abstract void fly();

}

class CargoPlane extends Aeroplane{

    void fly(){

        System.out.println("Cargo Plane is Flying");

    }

}

class PassengerPlane extends Aeroplane{

    void fly(){

        System.out.println("Passenger Plane is Flying");

    }

}
```

Main Method

```java
Aeroplane a;

a=new CargoPlane();

a.fly();

a=new PassengerPlane();

a.fly();
```

Output

```
Cargo Plane is Flying

Passenger Plane is Flying
```

---

# Can Abstract Class Have Normal Methods?

Yes.

Example

```java
abstract class Animal{

    void eat(){

        System.out.println("Eating");

    }

    abstract void sound();

}
```

---

# Can Abstract Class Have Constructors?

Yes.

Example

```java
abstract class Animal{

    Animal(){

        System.out.println("Animal Constructor");

    }

}
```

When child object is created,

Parent constructor executes first.

---

# Can We Create Object of Abstract Class?

No.

Wrong

```java
Animal a=new Animal();
```

Compile Time Error

Correct

```java
Animal a=new Dog();
```

---

# Rules of Abstract Class

- Must use abstract keyword.
- Cannot create objects.
- May contain abstract methods.
- May contain normal methods.
- Can have constructors.
- Can have variables.
- Child class must implement all abstract methods.

---

# If Child Doesn't Implement Abstract Method

Example

```java
abstract class Animal{

    abstract void sound();

}

class Dog extends Animal{

}
```

Compile Time Error

Solution

Either

Implement the method

OR

Declare Dog as abstract.

---

# Multiple Abstract Methods

```java
abstract class Shape{

    abstract void area();

    abstract void perimeter();

}
```

Child

```java
class Rectangle extends Shape{

    void area(){

    }

    void perimeter(){

    }

}
```

---

# Difference Between Abstract Method and Normal Method

| Abstract Method | Normal Method |
|-----------------|---------------|
| No Body | Has Body |
| Ends with ; | Uses {} |
| Must be overridden | Override optional |
| Uses abstract keyword | No abstract keyword |

---

# Abstraction using Interface

Interface provides 100% abstraction (before Java 8).

Example

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

# Abstract Class vs Interface

| Abstract Class | Interface |
|----------------|-----------|
| abstract keyword | interface keyword |
| Can have constructors | No constructors |
| Can have instance variables | Only constants |
| Can have normal methods | Java 8+ allows default/static methods |
| Uses extends | Uses implements |
| Single inheritance | Multiple inheritance supported |

---

# Abstraction vs Encapsulation

| Abstraction | Encapsulation |
|--------------|--------------|
| Hides implementation | Hides data |
| Focus on What | Focus on Security |
| Achieved using Abstract Class/Interface | Achieved using private variables |

---

# Advantages of Abstraction

- Hides unnecessary implementation.
- Improves security.
- Reduces complexity.
- Easy maintenance.
- Supports loose coupling.
- Better code organization.

---

# Disadvantages

- More classes increase complexity.
- Slight learning curve.
- Initial design takes more time.

---

# Real Life Examples

- ATM Machine
- Car
- Mobile Phone
- TV Remote
- Coffee Machine
- Payment Gateway

---

# Interview Questions

### What is Abstraction?

Hiding implementation details while exposing only essential functionality.

---

### How is Abstraction achieved?

- Abstract Class
- Interface

---

### Can we create object of abstract class?

No.

---

### Can abstract class have constructor?

Yes.

---

### Can abstract class have normal methods?

Yes.

---

### Can abstract class have variables?

Yes.

---

### Can abstract class have static methods?

Yes.

---

### Can abstract class contain only abstract methods?

Yes.

---

### Can abstract class have zero abstract methods?

Yes.

Example

```java
abstract class A{

}
```

This is valid.

---

### Can abstract method have body?

No.

---

### Can abstract class be final?

No.

Reason

Abstract class must be inherited.

Final class cannot be inherited.

---

### Can constructor be abstract?

No.

Constructors are used for object initialization.

Abstract methods have no implementation.

Hence constructor cannot be abstract.

---

# Summary

| Feature | Abstract Class |
|----------|----------------|
| Object Creation | ❌ No |
| Constructor | ✅ Yes |
| Variables | ✅ Yes |
| Normal Methods | ✅ Yes |
| Abstract Methods | ✅ Yes |
| Static Methods | ✅ Yes |

---

# Key Points to Remember

- Abstraction means **Hide Implementation, Show Functionality**.
- Achieved using **Abstract Class** and **Interface**.
- Abstract class cannot be instantiated.
- Abstract methods do not have a body.
- Child class must implement all abstract methods.
- Abstract class can have constructors, variables, and normal methods.
- Interface is mainly used to achieve abstraction and multiple inheritance.