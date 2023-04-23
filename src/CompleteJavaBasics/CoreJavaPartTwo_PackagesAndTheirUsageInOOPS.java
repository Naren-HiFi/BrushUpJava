package CompleteJavaBasics;
/*

 Packages - A set of classes interfaces

 java.lang => Default package

 java.lang is a package in the Java programming language that contains fundamental classes and
 interfaces that are necessary for the development of Java programs.

 The classes and interfaces in this package are automatically imported into every Java program,
  which means
 that you don't have to explicitly import them in your code.

Some of the classes and interfaces in the java.lang package include:

Object: The root class of the Java class hierarchy.

String: A class that represents a sequence of characters.

Integer, Long, Float, Double, Short, and Byte: Classes that wrap the primitive data types int, long,
 float,
 double, short, and byte, respectively.

Math: A class that provides basic mathematical operations and functions.

Exception: A class that represents an exception that can occur during the execution of a Java program.

Runnable: An interface that defines a single method, run(), which is used to specify the code that
should be executed in a separate thread.

Overall, the java.lang package contains classes and interfaces that are essential for the
development of Java programs, and it is automatically included in every Java program.


 java.util => All collection interfaces come under util package.

 java.util is a package in the Java programming language that provides a collection of utility
 classes
 and interfaces to support the development of Java programs.

  The classes and interfaces in this package are not automatically imported into Java programs
   and must be
  explicitly imported when needed.

Some of the classes and interfaces in the java.util package include:

List, Set, Map, Queue, and Deque: Interfaces that define various collection types.

ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, PriorityQueue, and ArrayDeque: Classes
 that
 implement the collection interfaces and provide different implementations of collections.

Iterator: An interface that provides a way to traverse the elements of a collection.

Scanner: A class that provides methods for reading input from various sources.
Date, Calendar, and Timezone: Classes that provide support for working with dates and times.

Random: A class that provides methods for generating random numbers.

Arrays: A class that provides methods for working with arrays.
Overall, the java.util package provides a wide range of utility classes and interfaces that are
useful in developing Java programs. It is an important part of the Java standard library and is
commonly used in many Java applications.


User defined java packages => import package.classname

1. Class A can use the class B directly by creating the object
if both Class A and Class B belongs to same package

2. You can access the class and methods that lies outside the current package by importing that
specific
package and class inside another user defined package

You can have multiple user defined packages. Moreover, you can have a kind of consistency here

For example: In the real time project, you are working on the e-commerce website

In the payment page, you have to just click on buyclass after entering the credit card details.
buyclass -> Payment package

buyclass to handle the coupons
buyclass -> Coupon package

To avoid redundancy, define the class (buyclass) in two different packages.

*/


import CompleteJavaBasics.ArrayListIterateListUsingForLoop;

public class CoreJavaPartTwo_PackagesAndTheirUsageInOOPS {

    public static void main(String[] args) {
        ArrayListIterateListUsingForLoop arrayList = new ArrayListIterateListUsingForLoop();
        arrayList.abc();


    }

}
