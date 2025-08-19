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

like abstaract classes we cannot create a object for interfaces.
Interface = contract/blueprint.

We use it for abstraction, multiple inheritance, loose coupling, and polymorphism.

### Software Design Principal : 
## Low-Level Design

Definition: Low-Level Design is the process of breaking down a system (from High-Level Design) into detailed class diagrams, methods, relationships, and interactions.

It focuses on how things will be implemented in code.

## Single Responsibility Principle (SRP)

It is one of the SOLID principles in software design.
Definition: A class should have only one reason to change.
In simple words, a class should do only one job.

and it helps to make code maintanable and the readable 