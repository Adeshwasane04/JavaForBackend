Q. What is object oriented Programming?
-> object oriented programming is software paradigm (style of programming) that oraganize software design around object rather than function and the logic.
 
 oops helps to make code modular and reusable manintanable and closer to the real world.

Q. what is difference between class and  object ?
 -> Classes: is a blueprint of object and its is logical entity.
  note:it does not occupy any space in the memory.

   Object: is a instance of class it has state and behaviour 

   Example: Animal is a class and the Dog, Cat, Tiger is a Objects.

Q. What is COnstructor ?
-> Constructor is similar to the method that is invoked when the object of the class get created.
   constructor is used to intialize the object whose name is same as a class name and does not have any retun type not even void 

   Three Type of constructor:
   1. no- Argument Constructor //when we do not any argument 
   2. Parameterized Constructor // when we pass any argument 
   3. Default Constructor  // when we do not create any constructor but the object is created basically so basically in system default constructor get created 

Q. What is Constructor Overloading? 

-> When we have more than one Constuctor within the class with the same name but differnet parameter we called as constructor overloading.

Q. What is access Modifier?

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

 public : It can visible everywhere.

 Protected : It is visible within the pacakge and the subclasses.