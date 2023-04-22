package CompleteJavaBasics;/*
Java Streams

Java Streams are introduced from version 8that come with many helper methods to write simplified and optimized code.

What are Streams?

Streams API is a new feature available from Java 8.

By using Streams,we can perform various aggregate operations on data returned from collections classes by
drastically reduce the complexity of code.

What is Lambda Expression?

Lambda expressions introduce the new arrow operator->into java.It divides the lambda expressions in two parts:

The left side specifies the parameters required by the expression,which could also be empty
if no parameters are required.

The right side is the lambda body which specifies the actions of the lambda expression.

The working of stream can be explained in three stages:

1. Create a stream.

2. Perform intermediate operations on the initial stream to transform it into another

3. Perform terminal operation on the final stream to get the result

An important characteristic of intermediate operation is laziness.
When executing this code snippet, nothing is printed on the console.
This is because intermediate operations will only be executed when a terminal operation is present.

Important note:

The aggregate operations that we perform on the collection, array or any other data source do not change the data
of the source, they simply return a new stream.



*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;


public class JavaStreamsAssociationWithSelenium {

    // Collect method is basically used to collect your results and convert it back into any list.
    public void streamCollect(){

      List<String> newCollectionList =  Stream.of("Kannan","Rama","Sita","Anbu","Ahila").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Get the first item from the collection list: " + newCollectionList.get(0));

    }

    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Anil");
        namesList.add("Aravind");
        namesList.add("Prasanth");

        int count = 0;

        for(int i=0;i<namesList.size();i++){
            String namesStartWithA = namesList.get(i);
        if(namesStartWithA.contains("CompleteJavaBasics.A")){
            count++;
            System.out.println(namesStartWithA);
            }
        }

        System.out.println("The number of names that starts with CompleteJavaBasics.A: " + count);

        // Applying Java Streams
        long countName = namesList.stream().filter(search -> search.startsWith("CompleteJavaBasics.A")).count();
        System.out.println("The number of names that starts with CompleteJavaBasics.A: " + countName);

        // Iterating and printing the list of names that starts with "CompleteJavaBasics.A" using Stream and forEach
        namesList.stream().filter(search -> search.startsWith("CompleteJavaBasics.A")).forEach(s -> System.out.println("Iterating and printing the list of names that starts with CompleteJavaBasics.A using Stream and forEach: "+s));

        // Create a light-weight stream compatible collection
        long countNumber = Stream.of("7","10","11","9","13").filter(num ->{num.startsWith("1");return true;}
        ).count();
        System.out.println("The number that starts with 1 are: " + countNumber);


        //Create a stream that returns the length of the array list, which is greater than 4
        namesList.stream().filter(s -> s.length()>4).forEach(s -> System.out.println("Returns the string list that has name with length greater than 4: " + s));

        // Limit the result set
        namesList.stream().filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println("Limits the string list that has name with length greater than 4: " + s));

        // Create a stream that print names that end last letter "a" with Uppercase.
        // Map() modifies the stream results

        Stream.of("Kannan","Rama","Sita","Anbu","Ahila").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(""+s));

        // Print names that have first letter as "CompleteJavaBasics.A" with uppercase and sorted
        String[] nameList= {"Azbhijeet","Don","Alekhya","Adam","Michael"};
        List<String> sortedNames = Arrays.asList(nameList);
        sortedNames.stream().filter(s -> s.startsWith("CompleteJavaBasics.A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println("Sorted names: " + s));

        // Merge two different lists using stream
        ArrayList<String> namesList1 = new ArrayList<>();
        namesList1.add("Kaka");
        namesList1.add("Neymar");
        namesList1.add("Haaland");
        Stream<String> newStreamList = Stream.concat(sortedNames.stream(), namesList1.stream());

       /* boolean isNamePresent = newStreamList.anyMatch(s -> s.equalsIgnoreCase("Adam"));
        System.out.println("Is adam present in the merged stream list: " + isNamePresent);*/

        newStreamList.sorted().forEach(s -> System.out.println("Sorted merged stream string list: " + s ));

        JavaStreamsAssociationWithSelenium javaStreams = new JavaStreamsAssociationWithSelenium();
        javaStreams.streamCollect();

        // Print Unique Number From The Array
        List<Integer> integersList = Arrays.asList(3,2,2,7,5,1,9,7);
        integersList.stream().distinct().forEach( integer -> System.out.println("Print the unique numbers: " + integer));

        //Print Unique Number From The Array in the ascending order
        integersList.stream().distinct().sorted().forEach(integer -> System.out.println("Print unique number of the Array in the ascending order: " + integer));

    }
}
