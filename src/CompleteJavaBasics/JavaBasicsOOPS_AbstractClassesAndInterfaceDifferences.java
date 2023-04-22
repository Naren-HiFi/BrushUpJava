package CompleteJavaBasics;/*                                   What is abstraction?

Abstraction is the process of hiding the implementation details from the user, only the functionality will
be provided to the user. In other words, the user will have the information on what the object does instead of
how it does it.

Abstract Classes and methods

Class that is declared with the abstract keyword is known as the abstract class in Java.
It can have abstract methods (methods without the body) and non-abstract methods (methods with the body).
Abstraction classes achieve partial abstraction.
Interfaces on the other hand are used for 100% abstraction.

Real life Example:

There is a parent class, which defines Aircraft Body Construction rules

All child classes (Different Aircraft Companies) have to inherit parent class and use those methods to build their
own aircraft.

But there is a method called Aircraft color which can be unique to every child class depending on their company logo.

So, Color method in parent class is not implemented with anybody.  Only the method is defined without body that
we call as abstract method.

If there is any method in class that is abstract, then the class wil be treated as Abstract Class.

Unlike Interfaces, the abstract class can have methods (Concrete) which have implementation as well. So, with Abstract
class only partial abstraction is achieved.

        // CompleteJavaBasics.ParentAircraft parentAircraft = new CompleteJavaBasics.ParentAircraft(); You can't instantiate abstract classes

We cannot instantiate object for Abstract class. Child classes are forced to implement Abstract methods of Parent Class.

Differences b/w Abstract Classes and Interfaces

Interface:

1) Interface contains only abstract methods.
2) Access specifiers for methods in interface must be public.
3) Variables defined must be public, static, and final.
4) To implement an interface, we use implements keyword.

Abstract Class

1) Abstract class can have abstract methods (methods without the body) and non-abstract methods (methods with the body).
2) We can have access modifiers such as public, protected in abstract class but private in abstract class.
3) We can have access specifiers in variables inside the abstract class except private in variables inside the abstract
class
4) To implement an Abstract Class, we use extends keyword.


*/


public class JavaBasicsOOPS_AbstractClassesAndInterfaceDifferences {
}
