# Java Encapsulation

## What is Encapsulation?

Encapsulation is one of the four fundamental pillars of Object-Oriented Programming (OOP).

Encapsulation is the process of wrapping data (variables) and methods (functions) into a single unit (class) while restricting direct access to the data.

In simple words:

> **Data + Methods = Encapsulation**

The main purpose of encapsulation is to protect data from unauthorized access.

---

# Real Life Example

Think about an ATM Machine.

You can:

- Withdraw Money
- Deposit Money
- Check Balance

But you **cannot directly access or modify** the bank database.

Instead, you use the provided methods.

This is Encapsulation.

---

# Definition

Encapsulation is achieved by:

- Declaring variables as **private**
- Providing **public Getter and Setter methods**

---

# Why Do We Need Encapsulation?

Without encapsulation:

- Anyone can modify data.
- Data security is lost.
- Invalid values can be assigned.
- Code becomes difficult to maintain.

With encapsulation:

- Data becomes secure.
- Validation can be applied.
- Easy maintenance.
- Better flexibility.

---

# Without Encapsulation

```java
class Student{

    String name;
    int age;

}

public class Demo{

    public static void main(String[] args){

        Student s = new Student();

        s.name = "Ujjwal";
        s.age = -20;

        System.out.println(s.name);
        System.out.println(s.age);

    }

}
```

Output

```
Ujjwal
-20
```

Problem

Age cannot be negative.

---

# With Encapsulation

```java
class Student{

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){

        if(age > 0){
            this.age = age;
        }

    }

    public int getAge(){
        return age;
    }

}
```

Main Method

```java
public class Demo{

    public static void main(String[] args){

        Student s = new Student();

        s.setName("Ujjwal");

        s.setAge(21);

        System.out.println(s.getName());

        System.out.println(s.getAge());

    }

}
```

Output

```
Ujjwal
21
```

---

# Access Modifiers

| Modifier | Same Class | Same Package | Subclass | Other Package |
|------------|------------|--------------|-----------|---------------|
| private | ✅ | ❌ | ❌ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| protected | ✅ | ✅ | ✅ | ❌* |
| public | ✅ | ✅ | ✅ | ✅ |

(*protected is accessible in subclasses even across packages.)

---

# Private Variables

Private variables cannot be accessed directly outside the class.

Example

```java
class Student{

    private int age;

}
```

Wrong

```java
Student s = new Student();

s.age = 20;
```

Compile Time Error

---

# Getter Method

Getter is used to read the value.

Syntax

```java
public DataType getVariableName(){

    return variable;

}
```

Example

```java
public String getName(){

    return name;

}
```

---

# Setter Method

Setter is used to modify the value.

Syntax

```java
public void setVariableName(DataType value){

    variable = value;

}
```

Example

```java
public void setName(String name){

    this.name = name;

}
```

---

# Complete Example

```java
class Employee{

    private String name;

    private double salary;

    public void setName(String name){

        this.name = name;

    }

    public String getName(){

        return name;

    }

    public void setSalary(double salary){

        if(salary >= 0){

            this.salary = salary;

        }

    }

    public double getSalary(){

        return salary;

    }

}

public class Demo{

    public static void main(String[] args){

        Employee emp = new Employee();

        emp.setName("Rahul");

        emp.setSalary(50000);

        System.out.println(emp.getName());

        System.out.println(emp.getSalary());

    }

}
```

Output

```
Rahul
50000.0
```

---

# Data Hiding

Data Hiding means hiding internal data from outside classes.

Encapsulation achieves Data Hiding using **private variables**.

Example

```java
private int balance;
```

Outside class cannot access it directly.

---

# Validation Using Encapsulation

Example

```java
public void setAge(int age){

    if(age >= 18){

        this.age = age;

    }

    else{

        System.out.println("Invalid Age");

    }

}
```

Output

```
Invalid Age
```

Invalid values are prevented.

---

# Advantages of Encapsulation

- Data Security
- Data Hiding
- Better Control
- Easy Maintenance
- Code Reusability
- Validation Support
- Flexible Code
- Loose Coupling

---

# Disadvantages of Encapsulation

- Slightly more code.
- Getter and Setter methods increase class size.
- Small performance overhead (usually negligible).

---

# Encapsulation vs Data Hiding

| Encapsulation | Data Hiding |
|---------------|------------|
| Wrapping data and methods together | Restricting direct access to data |
| Achieved using class | Achieved using private access modifier |
| Focuses on design | Focuses on security |

---

# Encapsulation vs Abstraction

| Encapsulation | Abstraction |
|---------------|------------|
| Hides data | Hides implementation details |
| Uses private variables | Uses abstract class/interfaces |
| Focus on security | Focus on simplicity |

---

# Real Life Examples

- ATM Machine
- Mobile Phone
- Bank Account
- Employee Management System
- Student Management System

---

# Interview Questions

### What is Encapsulation?

Wrapping data and methods into a single unit while restricting direct access to data.

---

### How is Encapsulation achieved?

Using:

- private variables
- public getter methods
- public setter methods

---

### Why use private variables?

To prevent direct access from outside the class.

---

### What is Getter?

Used to read data.

---

### What is Setter?

Used to update data.

---

### Can we apply validation in Setter?

Yes.

Example

```java
if(age > 0){

    this.age = age;

}
```

---

### Is Encapsulation the same as Data Hiding?

No.

Encapsulation uses Data Hiding, but both are different concepts.

---

# Summary

| Feature | Encapsulation |
|----------|---------------|
| Data Hiding | ✅ Yes |
| Getter | ✅ Yes |
| Setter | ✅ Yes |
| Validation | ✅ Yes |
| Uses private variables | ✅ Yes |
| Improves Security | ✅ Yes |

---

# Key Points to Remember

- Encapsulation = Data + Methods.
- Private variables cannot be accessed directly.
- Use Getter to read values.
- Use Setter to modify values.
- Validation is usually written inside Setter methods.
- Encapsulation improves security and maintainability.
- Encapsulation is achieved using private variables and public getter/setter methods.