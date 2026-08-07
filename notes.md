====================================================
        JAVA INHERITANCE & CONSTRUCTOR NOTES
====================================================

----------------------------------------------------
1. Inheritance Kya Hai?
----------------------------------------------------

Inheritance ek mechanism hai jisme ek class dusri class ke
properties (variables) aur methods ko inherit (reuse) karti hai.

Purpose:
✔ Code Reusability
✔ Maintainability
✔ Extensibility

Syntax:

class Parent {

}

class Child extends Parent {

}

Child class ko Subclass/Derived Class bhi kehte hain.
Parent class ko Superclass/Base Class bhi kehte hain.

----------------------------------------------------
2. Example
----------------------------------------------------

class Aeroplane {

    void fly() {
        System.out.println("Aeroplane is flying");
    }

    void takeOff() {
        System.out.println("Aeroplane is taking off");
    }
}

class PassengerPlane extends Aeroplane {

}

public class Demo {

    public static void main(String[] args) {

        PassengerPlane pp = new PassengerPlane();

        pp.fly();
        pp.takeOff();

    }
}

Output:

Aeroplane is flying
Aeroplane is taking off

Reason:
PassengerPlane ne Aeroplane ke methods inherit kar liye.

----------------------------------------------------
3. Constructor Kya Hota Hai?
----------------------------------------------------

Constructor ek special method hota hai.

Properties:

✔ Name class ke same hota hai.
✔ Return type nahi hoti.
✔ Object banate hi automatically call hota hai.
✔ Object initialize karne ke liye use hota hai.

Example:

class Aeroplane {

    Aeroplane() {
        System.out.println("Constructor Called");
    }
}

public class Demo {

    public static void main(String[] args) {

        Aeroplane a = new Aeroplane();

    }
}

Output:

Constructor Called

----------------------------------------------------
4. Constructor in Inheritance
----------------------------------------------------

Parent class ka constructor Child class me inherit nahi hota.

Lekin...

Jab Child object create hota hai,
tab Parent constructor automatically call hota hai.

Example:

class Aeroplane {

    Aeroplane() {
        System.out.println("Parent Constructor");
    }
}

class PassengerPlane extends Aeroplane {

}

public class Demo {

    public static void main(String[] args) {

        PassengerPlane pp = new PassengerPlane();

    }
}

Output:

Parent Constructor

Reason:

Java automatically child constructor ke first line me

super();

add kar deta hai.

Internally Java aise treat karta hai:

class PassengerPlane extends Aeroplane {

    PassengerPlane() {
        super();
    }

}

----------------------------------------------------
5. Child Constructor + Parent Constructor
----------------------------------------------------

class Aeroplane {

    Aeroplane() {
        System.out.println("Parent Constructor");
    }
}

class PassengerPlane extends Aeroplane {

    PassengerPlane() {
        System.out.println("Child Constructor");
    }

}

Output:

Parent Constructor
Child Constructor

Execution Order:

Object Creation
        ↓
Parent Constructor
        ↓
Child Constructor

----------------------------------------------------
6. super()
----------------------------------------------------

super() parent class constructor ko call karta hai.

Syntax:

super();

Ye constructor ki first statement honi chahiye.

Example:

class Aeroplane {

    Aeroplane() {
        System.out.println("Aeroplane");
    }

}

class PassengerPlane extends Aeroplane {

    PassengerPlane() {

        super();

        System.out.println("Passenger Plane");

    }

}

Output:

Aeroplane
Passenger Plane

----------------------------------------------------
7. Parameterized Constructor
----------------------------------------------------

class Aeroplane {

    Aeroplane(String name) {

        System.out.println(name);

    }

}

class PassengerPlane extends Aeroplane {

    PassengerPlane() {

        super("Boeing");

    }

}

Output:

Boeing

----------------------------------------------------
8. Important Rule
----------------------------------------------------

Agar Parent me sirf Parameterized Constructor hai
aur Default Constructor nahi hai,

to Child ko explicitly super(parameter)
call karna hi padega.

Example:

class Parent {

    Parent(int x) {

    }

}

class Child extends Parent {

    Child() {

        super(10);

    }

}

----------------------------------------------------
9. Constructor Calling Order
----------------------------------------------------

Parent Constructor
        ↓
Child Constructor

Always Parent executes first.

----------------------------------------------------
10. Constructor Inherit Hota Hai?
----------------------------------------------------

❌ NO

Constructor inherit nahi hota.

Sirf automatically call hota hai
jab child object create hota hai.

Methods ✔ Inherit hote hain.
Variables ✔ Inherit hote hain.
Constructor ❌ Inherit nahi hota.

----------------------------------------------------
11. Interview Questions
----------------------------------------------------

Q1. Constructor inherit hota hai?
Ans:
No.

Q2. Parent constructor kab call hota hai?
Ans:
Jab child object create hota hai.

Q3. Parent constructor ko kaun call karta hai?
Ans:
super()

Q4. super() kis line me hona chahiye?
Ans:
Constructor ki first statement.

Q5. Parent constructor pehle chalega ya child?
Ans:
Always Parent → Child

----------------------------------------------------
12. Flow Diagram
----------------------------------------------------

PassengerPlane pp = new PassengerPlane();

        │
        ▼
PassengerPlane Constructor
        │
        ▼
super()
        │
        ▼
Aeroplane Constructor
        │
        ▼
Back to PassengerPlane Constructor
        │
        ▼
Object Ready

====================================================
Shortcut Yaad Rakho
====================================================

Inheritance = extends

Methods ✔ inherit

Variables ✔ inherit

Constructor ❌ inherit

Parent Constructor ✔ automatically call

super() = Parent Constructor

Execution Order:

Parent Constructor
        ↓
Child Constructor

====================================================
END OF NOTES
====================================================