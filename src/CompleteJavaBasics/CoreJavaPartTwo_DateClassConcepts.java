package CompleteJavaBasics;

/*

Date class comes from the util package.



java.lang is a package in the Java programming language that contains fundamental classes and
interfaces that are necessary for the development of Java programs.

The classes and interfaces in this package are automatically imported
into every Java program, which means that you don't have to explicitly import them in your code.

Some of the classes and interfaces in the java.lang package include:

Object: The root class of the Java class hierarchy.

String: A class that represents a sequence of characters.
Integer, Long, Float, Double, Short, and Byte: Classes that wrap the primitive
 data types int, long, float, double, short, and byte, respectively.

Math: A class that provides basic mathematical operations and functions.

Exception: A class that represents an exception that can occur during the execution of a Java program.

Runnable: An interface that defines a single method, run(), which is used to specify the
code that should be executed in a separate thread.
Overall, the java.lang package contains classes and interfaces that are essential for
the development of Java programs, and it is automatically included in every Java program.


java.util is a package in the Java programming language that provides a collection of utility classes
 and interfaces to support the development of Java programs.
 The classes and interfaces in this package are not automatically imported
 into Java programs and must be explicitly imported when needed.

Some of the classes and interfaces in the java.util package include:

List, Set, Map, Queue, and Deque: Interfaces that define various collection types.

ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, PriorityQueue, and ArrayDeque:
Classes that implement the collection interfaces and provide different implementations of collections.

Iterator: An interface that provides a way to traverse the elements of a collection.

Scanner: A class that provides methods for reading input from various sources.
Date, Calendar, and Timezone: Classes that provide support for working with dates and times.

Random: A class that provides methods for generating random numbers.

Arrays: A class that provides methods for working with arrays.

Overall, the java.util package provides a wide range of utility classes and interfaces
that are useful in developing Java programs. It is an important part of the Java standard library
and is commonly used in many Java applications.






*/


import java.text.SimpleDateFormat;
import java.util.Date;

public class CoreJavaPartTwo_DateClassConcepts {
    public static void main(String[] args) {

        // Current Date and Current Time

        Date currentDateAndTime = new Date();
        System.out.println("The current date and time are: " + currentDateAndTime);

        //  => mm/dd/yyyy HH:MM:SS

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Print the date in the specified format: " + simpleDateFormat.format(currentDateAndTime));

        // => m/dd/yyyy hh:mm:ss
        SimpleDateFormat simpleDatFormat = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
        System.out.println("Print the date and time in the specified format: " + simpleDatFormat.format(currentDateAndTime));


        // Print the current year
        SimpleDateFormat simpleDaFormat = new SimpleDateFormat("yyyy");
        System.out.println("Print the year: " + simpleDaFormat.format(currentDateAndTime));


    }
}
