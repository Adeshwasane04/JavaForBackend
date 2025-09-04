### Q. What is object oriented Programming?
-> object oriented programming is software paradigm (style of programming) that oraganize software design around object rather than function and the logic.
 
 oops helps to make code modular and reusable manintanable and closer to the real world.

### Q. what is difference between class and  object ?
 -> Classes: is a blueprint of object and its is logical entity.
  note:it does not occupy any space in the memory.

   Object: is a instance of class it has state and behaviour 

   Example: Animal is a class and the Dog, Cat, Tiger is a Objects.

### Q. What is COnstructor ?
-> Constructor is similar to the method that is invoked when the object of the class get created.
   constructor is used to intialize the object whose name is same as a class name and does not have any retun type not even void 

   Three Type of constructor:
   1. no- Argument Constructor //when we do not any argument 
   2. Parameterized Constructor // when we pass any argument 
   3. Default Constructor  // when we do not create any constructor but the object is created basically so basically in system default constructor get created 

### Q. What is Constructor Overloading? 

-> When we have more than one Constuctor within the class with the same name but differnet parameter we called as constructor overloading.

### Q. What is access Modifier?

-> Access Modifier is used to set accessibilty(visibility) of the classes,interfaces, method ,variable 

 Three type of access Modifiers are :
 Private  :It can only accessible within the class itself and if we have access the value form the private keyword then  we used  getter and setter method.


 ```package OOPSConcept.L1;
       public class PrivateAccessModifier {

        /*if we have to accesss the value from the private modifier for that we 
         have to use getter and setter method 
        */

         public static void main(String[] args) {
             isPrivate checkName =new isPrivate();
             checkName.setName("hello");
             System.out.println(checkName.getName());
         }
         }
           class isPrivate{
            private String name;

             public String getName()
           {
              return this.name;
           }
         public String setName(String name)
           { 
              return this.name=name;
            }
          }
 ```

 public : It can visible everywhere.
 Protected : It is visible within the pacakge and the subclasses.

### Q.  What is this keyword and why it is used ?
 -> this keyword is used to refer to the current object inside the method or the constructor 
          
  ```package OOPSConcept.L1;
public class ThisKeyword {
    public static void main(String[] args) {
       isThis Name=new isThis();
      Name.isSet("hey Adesh");
      System.err.println(Name.getName());
    }
}
class isThis{
    private String name;
    public String isSet(String name)
    {
        return this.name=name;
    }
     public String getName()
     {
        return this.name;
     }
}
```

Uses of this keyword avoid naming ambiguity.  also we can take this as a argument 


### Q. Why we use Super Keyword in java?
-> The super keyword in Java is used when working with inheritance (child and parent classes). It always refers to the parent class (superclass) of the current object.

  and through super keyword we can access the constructor,method,variable of parent class into the child class 

  if we have to use super keyword for constructor ->super(parameter);
  if we have to use super keyword for variable ->super.variableName;
  if we have to use super keyword for method ->super.methodName();


### Q. What is Method Overrinding?
-> When we have more than one method within the same class or its subclass with the same name and the same parameter we called it as a method overriding. 

### Q. What is inheritance ?
-> Inheritance is a concept that allow us to create a new class i.e Subclass from the existing class i.e Super class

note: inheritance can only be use when there exists an is-a relationship between two classes.

Types of inheritance
1.single level Inheritance
2.multi-level inheritance
3.herarchical inheritance
4.multiple inheritance
5.hybrid inheritance :combination of two or more inheritance

### Q. What is Abstraction?
-> Absraction is a concept of oops that allows us to hide the unneccessary details and show only neccessary information to the user.
and we achieve abstraction through abstract keyword.

### Q.What is the use of abstaract keyword ?
-> if we declere any variable or class or method we do not need to create a object for it we can directly access it 

### Q. Why abstract methods have no body?

An abstract method is just a declaration, not an implementation.

It defines what should be done but not how it should be done.

The actual implementation is left to the subclasses. 
also if we have declare any method with the abstract keyword then we always need to declare the class as a abstract class

Important Note: When we are using hiding data its means hiding with respect to the object 

### Q. Why do we use it if it has no body?

The use of abstract methods is in polymorphism and enforcing rules.

It acts like a contract:
Any class that extends the abstract class must provide an implementation for the abstract methods.

### Some important points about abstract class

-> We use abstract keyword to create abstract classs and the abstract method 
-> An abstract method does not have any implementation (method body)
-> A class containaing abstract method should be abstract
-> We cannot create a object for the abstract class
-> TO immplement the feature of the abstrct class , we inherit subclasses from it and create a object of the subclasses 
-> A subclass must be override all abstarct method of an abstrct class.
-> *important* we can access the static atttributes and the method of an abstrct claass using the reference of abstrct class

### Q. What is Interfaces?
-> An interface is a fully abstract class. It include a group of abstract method (without a body)

    ```interface className{
      public void getType(); //automatically it consider as abstract method 
      public void getVersion(); 
    }
    ```

like abstaract classes we cannot create a object for interfaces. and it do not have any constructor
Interface = contract/blueprint.

We use it for abstraction, multiple inheritance, loose coupling, and polymorphism.

Ex:Drive through

### Why We can not Perform multiple inheritance in Java ?

  Java does not support multiple inheritance with classes to avoid ambiguity (Diamond Problem) and to keep the design simple and more maintainable.
   Instead, Java provides interfaces which allow multiple inheritance in a safe way.

   ```
   interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    public void show() {
        System.out.println("C’s own show");
    }
}
```
### Q. Why We Use default Keyword in Interfaces (Java 8 onwards)
->  1. To Add New Methods Without Breaking Old Code

Before Java 8, if you added a new method in an interface, all implementing classes had to override it → this broke existing code.

With default methods, you can add a new method with a default implementation in the interface, so old classes still compile without changes.

2. Provide Reusable Common Code

Interfaces can now contain methods with body (using default) that provide a common implementation for all implementing classes.

Classes can use it as-is or override it.

```
interface Vehicle {
    void start();  // abstract method

    // default method
    default void honk() {
        System.out.println("Beep! Beep!");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }

    // Override default method
    public void honk() {
        System.out.println("Bike horn sound");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.honk();   // uses default method

        Vehicle bike = new Bike();
        bike.start();
        bike.honk();  // uses overridden method
    }
}
```

### What is an enum (Enumeration) in Java?

An enum is a special class in Java used to represent a group of constants (fixed set of values).

Instead of using plain integers or strings, enums give meaningful names to constants.

By default, all enums extend java.lang.Enum.

```
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);
    }
}
```

### Q. What is instance of keyword in java? 
--> instance of is a key operator in java it is used to check if the object is an instance of a perticular class or a subclass it return  a boolean value 

note:If the object is null, instanceof always returns false.

### Software Design Principal : 
 SOLID:
 S -> Single Responsibility Principal
 O -> Open Closed Principal: a class should open for extension but closed for modification.
 L -> Liskov Substitution Principle (LSP) :
 I -> Interface seggregation principal 
 D -> Dependency Inversion principal 
## Low-Level Design

Definition: Low-Level Design is the process of breaking down a system (from High-Level Design) into detailed class diagrams, methods, relationships, and interactions.

It focuses on how things will be implemented in code.

## Single Responsibility Principle (SRP)

It is one of the SOLID principles in software design.
Definition: A class should have only one reason to change.
In simple words, a class should do only one job.
and it helps to make code maintanable and the readable 

### Liskov Substitution Principle (LSP)
 Objects of a superclass should be replaceable with objects of its subclasses without breaking the application.
   
   In other words:

If B is a subclass of A, then we should be able to use an object of B wherever A is expected, and the program should still work correctly.

A subclass should not violate the behavior/contract of its parent class.

Example (Violating LSP)
```
class Bird {
    void fly() {
        System.out.println("I can fly");
    }
}

class Ostrich extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}
```

👉 Here, Ostrich is a Bird, but it cannot fly.
If code expects a Bird that can always fly(), substituting it with an Ostrich will break the program.
This violates LSP.

Correct Design (Following LSP)
```
abstract class Bird { }

class FlyingBird extends Bird {
    void fly() {
        System.out.println("I can fly");
    }
}

class Sparrow extends FlyingBird { }
class Ostrich extends Bird { } // no fly() method
```

👉 Now,

Sparrow can fly.

Ostrich cannot fly.

We separated behavior into proper hierarchy → follows LSP.

for more reference check: [text](https://reflectoring.io/lsp-explained/)

### Interface seggregation principal :

-> ISP state that no client should be forced to exibits behaviour .
this happen because of bulkey interfaces / abstract classes 
ISP is SRP for interfaces 

“No client should be forced to depend on methods it does not use.”

In simple words, instead of having one big interface with many unrelated methods, we should split it into smaller, more specific interfaces. That way, a class only needs to implement the methods that are actually relevant to it.

 Problem Without ISP:

If we have a large interface:

 ``` interface Worker {
    void work();
    void eat();
    void sleep();
}
```

Now, if we create a Robot class, it does not eat or sleep, but still has to implement those methods (maybe leaving them empty). This forces classes to depend on things they don’t need, violating ISP.

Correct Way (With ISP):

We split the big interface into smaller, role-specific interfaces:
```
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

```
Now, each class implements only what it needs:
```
class Human implements Workable, Eatable, Sleepable {
    public void work() { System.out.println("Human working..."); }
    public void eat() { System.out.println("Human eating..."); }
    public void sleep() { System.out.println("Human sleeping..."); }
}

class Robot implements Workable {
    public void work() { System.out.println("Robot working..."); }
}
```

✔ Human can work, eat, and sleep.
✔ Robot only works, no unnecessary methods.

### What is the Dependency Inversion Principle (DIP)?

Definition:
“High-level modules should not depend on low-level modules. Both should depend on abstractions.”

“Abstractions should not depend on details. Details should depend on abstractions.”

Without DIP (bad design):

Let’s say we directly use a low-level class inside a high-level class:
```
class PayPalPayment {
    public void pay() {
        System.out.println("Paid using PayPal");
    }
}

class PaymentProcessor {
    private PayPalPayment payPal = new PayPalPayment();

    public void process() {
        payPal.pay();
    }
}
```

🔴 Problem:

PaymentProcessor is tightly coupled to PayPalPayment.

If tomorrow we want to use StripePayment, we need to modify PaymentProcessor code.

This violates the Open/Closed Principle too.

✅ With DIP (good design):

We introduce an abstraction (interface) and make both high- and low-level modules depend on it.
```
interface PaymentService {
    void pay();
}

class PayPalPayment implements PaymentService {
    public void pay() {
        System.out.println("Paid using PayPal");
    }
}

class StripePayment implements PaymentService {
    public void pay() {
        System.out.println("Paid using Stripe");
    }
}

class PaymentProcessor {
    private PaymentService paymentService;

    // Constructor Injection
    public PaymentProcessor(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void process() {
        paymentService.pay();
    }
}


Now we can easily do:
public class Main {
    public static void main(String[] args) {
        PaymentService service = new PayPalPayment();
        PaymentProcessor processor = new PaymentProcessor(service);
        processor.process();

        // Later, easily switch to Stripe without changing PaymentProcessor
        PaymentService stripe = new StripePayment();
        processor = new PaymentProcessor(stripe);
        processor.process();
    }
}
```

Q. What is Builder design pattern ?
he Builder Design Pattern is a creational design pattern in software engineering.
It is used when you want to construct a complex object step by step while keeping the construction process independent of the parts that make up the object.

 Problem it solves:

When a class has too many parameters (especially optional ones) in the constructor, the code becomes hard to read and maintain.

Example:

Car car = new Car("Red", "V8", true, false, 4, "Automatic");


From this, it’s not clear which value represents what. Maintaining such constructors is difficult.

 Solution (Builder Pattern)

Instead of creating the object directly using a constructor, the Builder pattern allows you to build an object step by step using method chaining.

## How backend architecture works

### Q. What is Client-Server Architrcture?
-> It is a type of distributed system design where two main entities exist:

 Client → The device/software that requests services (e.g., web browser, mobile app).
 Server → The system that provides services (e.g., web server, database server).

### Q. What happen we you do www.google.com?
The browser (client) sends a request to Google’s server.
The server searches and sends the search page.
The client displays it on your screen.

### Q. What is server?
A server is a computer or software program that provides services, resources, or data to other computers (called clients) over a network.

Types of Servers : 
Web Server – serves web pages (e.g., Apache, Nginx).
Database Server – stores & provides database access (e.g., MySQL, MongoDB).
File Server – stores and shares files.
Mail Server – handles sending/receiving emails.
Application Server – runs applications and provides business logic.


### Q What is vertical Scalling and horizonatal scalling in server ?
-> Means adding more power (CPU, RAM, storage) to your existing server/machine.
You keep the same machine but make it stronger.

Example:

You have a laptop with 8 GB RAM. You upgrade it to 16 GB RAM.
Or your server has 4 CPUs, you upgrade it to 8 CPUs.

2. Horizontal Scaling (Scaling Out)

Means adding more machines/servers to handle the load.
You distribute the work among multiple servers.
 Example:
Instead of making one super powerful server, you add 10 normal servers and use a load balancer to distribute requests.


## DataBases

### Q. What is file base system? and what are the issue arises with the file Based system ?
-> A file-based system is the traditional way of storing and managing data before databases (like DBMS) became popular.

Data is stored in separate files (e.g., text files, spreadsheets, flat files).
Each application manages its own data using files.
There is no central management of data.

ISSUES: 
1. data rebundancey
2. data inconsistency
3. security
4. diffucult data occur

### Q. What is database schema?
-> It is a blueprint or a logical structure of the database. It define how the data is organized how the table is related 
   and what rules apply to the database.
   A schema contains tables, views, indexes, relationships, procedures, etc.

### Q. Functional Dependency in SQL?
->A functional dependency (FD) is a relationship between two attributes (columns) in a table.
It means:
If you know the value of one attribute (or a set of attributes), you can uniquely determine the value of another attribute.

Notation
We write it as:
X → Y
Which means:

Attribute X determines attribute Y.

For each value of X, there is only one possible value of Y.

### Q. What is axioms in SQL?
-> In SQL, the term axioms usually refers to the Armstrong’s Axioms.
These are a set of inference rules used in relational database theory to reason about functional dependencies (FDs) in a relation.

 They are the foundation for normalization and help in finding candidate keys, closures, and minimal covers of functional dependencies.
 Armstrong’s Axioms in SQL (Functional Dependency Theory):

There are three basic axioms:

1. Reflexivity Rule

If Y ⊆ X, then X → Y.

Example: If (roll_no, name) is a set of attributes, then {roll_no, name} → roll_no.

2. Augmentation Rule

If X → Y, then XZ → YZ (where Z is any set of attributes).

Example: If roll_no → name, then {roll_no, class} → {name, class}.

3. Transitivity Rule

If X → Y and Y → Z, then X → Z.

Example: If roll_no → name and name → address, then roll_no → address.

### Q.What are the different types of keys in SQL?
-> 1. Primary Key

A column (or set of columns) that uniquely identifies each row in a table.
No duplicates and cannot be NULL.
Each table can have only one primary key.

```
 CREATE TABLE Students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50)
);
```

2. Candidate Key:
A minimum set of attributes(column) that uniquey identifies as a record.
All possible columns that can qualify as a Primary Key.
From candidate keys, one is chosen as the Primary Key.
 Example: In a Students table, both student_id and email could uniquely identify a student → both are candidate keys.

 3. Super Key

Any set of attributes (columns) that can uniquely identify a row.
A Primary Key is always a Super Key, but a Super Key may have extra attributes.

 Example: {student_id}, {student_id, name} are both super keys.

 4. Composite Key (or Compound Key)

 A composite key means a key that consist of two more than two attributes but together unqiuely indentifies records 
 the attributes that form a composite key are not any key independent.

 ```
 CREATE TABLE Course_Enrollments (
    student_id INT,
    course_id INT,
    PRIMARY KEY(student_id, course_id) //here this is composite key
);

```

5.ALternate key

All the candidate key apart from the primary key are Alternate kay.
Example: If student_id is the primary key, then email becomes the alternate key.

6. Foreign Key

A column that creates a relationship between two tables.
It refers to the Primary Key of another table.

```
CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    student_id INT,
    FOREIGN KEY(student_id) REFERENCES Students(student_id)
);
```

### Q. What is Attribute Closure ?
-> The closure of an attribute set A, written as A⁺, is the set of all attributes that can be functionally determined from A, given a set of functional dependencies (FDs).

It’s used to:
Find candidate key
Check if a set of attributes is a superkey
Test if a functional dependency holds

 Steps to find closure (A⁺):

Start with A⁺ = A (the attributes themselves).

Apply functional dependencies repeatedly:

If X → Y and X ⊆ A⁺, then add Y to A⁺.

Repeat until no more attributes can be added.

 Example

Suppose relation R(A, B, C, D) with functional dependencies:

A → B  
B → C  
C → D


Find closure of {A}:

Start: A⁺ = {A}

From A → B → add B → {A, B}

From B → C → add C → {A, B, C}

From C → D → add D → {A, B, C, D}

 So A⁺ = {A, B, C, D} → A is a candidate key for R.

 ### Q. What is Normalization ?
 ->Normalization is the process of organizing data in a database to reduce redundancy (duplicate data) and improve data integrity.

In short:

It breaks large, complex tables into smaller ones.

It ensures data is stored logically and efficiently.

It avoids problems like update anomalies, insertion anomalies, and deletion anomalies.

## Normal Forms (Levels of Normalization)

1. First Normal Form (1NF):

Each column should have atomic (indivisible) values and 
No repeating groups or arrays.

Example:If there is one person having multiple phone numbers
 Instead of storing multiple phone numbers in one column, create separate rows.
 because should be easier to perrform updating on it rather than traversing each array 

 2. Second Normal Form (2NF):
 It is already in First Normal Form (1NF) (no repeating groups, atomic values).
 No partial dependency exists — i.e., every non-key attribute must depend on the whole primary key, not just part of it.

 ``` 
 Example (Before 2NF – Not in 2NF)
Table: Student_Course
StudentID	CourseID	StudentName	CourseName
1	101	John	DBMS
2	101	Alice	DBMS
1	102	John	Networks

 Primary Key = (StudentID, CourseID) (composite key).

StudentName depends only on StudentID (partial dependency).

CourseName depends only on CourseID (partial dependency).

This violates 2NF ❌

 After Applying 2NF

We split the table into two or more tables:

Students Table

StudentID	StudentName
1	John
2	Alice

Courses Table

CourseID	CourseName
101	DBMS
102	Networks

Enrollment Table

StudentID	CourseID
1	101
2	101
1	102

and link them with primary key and foreign key and we can perform operation through joins
```
3. Third Normal Form (3NF):

It is already in Second Normal Form (2NF).
There is no transitive dependency.
i.e., non-key attributes should depend only on the primary key, not on other non-key attributes.

```
| StudentID | StudentName | DepartmentID | DepartmentName |
| --------- | ----------- | ------------ | -------------- |
| 1         | John        | 101          | Computer Sci   |
| 2         | Alice       | 102          | Electronics    |
| 3         | Bob         | 101          | Computer Sci   |
```
Primary Key = StudentID

StudentName depends directly on StudentID ✔️

But DepartmentName depends on DepartmentID, not directly on StudentID ❌
→ This is a transitive dependency.

After Applying 3NF

We split into two tables:
```
| StudentID | StudentName | DepartmentID |
| --------- | ----------- | ------------ |
| 1         | John        | 101          |
| 2         | Alice       | 102          |
| 3         | Bob         | 101          |
```
```
| DepartmentID | DepartmentName |
| ------------ | -------------- |
| 101          | Computer Sci   |
| 102          | Electronics    |

```
Now:

DepartmentName depends only on DepartmentID.

No non-key attribute depends on another non-key attribute.

3NF achieved 