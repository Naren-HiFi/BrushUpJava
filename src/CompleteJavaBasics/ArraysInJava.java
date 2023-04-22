package CompleteJavaBasics;/*
In Java, reference data types are types that refer to objects.
These data types are also known as "class types" because they are defined by classes.
Here are some common reference data types in Java:

String: A string is a sequence of characters. It is an object of the String class in Java.
Arrays: Arrays are used to store multiple values of the same data type in a single variable.
Classes: Classes are user-defined data types that encapsulate data and behavior.
Interfaces: Interfaces are a collection of method signatures that can be implemented by classes.
Enumerations: Enumerations are a type of data that consists of a set of named constants.
Objects: Objects are instances of classes.
They are created using the "new" keyword and can be assigned to reference variables.
Collections: Collections are objects that represent a group of objects.
Some examples of collections in Java are ArrayList, HashSet, and TreeMap.
Maps: Maps are objects that store key-value pairs. Some examples of maps in Java are HashMap and TreeMap. */

public class ArraysInJava {
    public static void main(String[] args) {
        int[] integerArray = new int[8];
        integerArray[0] = 2;
        integerArray[1] = 4;
        integerArray[2] = 6;
        integerArray[3] = 8;
        integerArray[4] = 10;
        integerArray[5] = 12;
        integerArray[6] = 14;
        integerArray[7] = 16;

        int[] arrayNumbers = {1,2,3,4,5,6,7,8};
        System.out.println("The sixth index of my array contains: " + arrayNumbers[6]);
    }
}

