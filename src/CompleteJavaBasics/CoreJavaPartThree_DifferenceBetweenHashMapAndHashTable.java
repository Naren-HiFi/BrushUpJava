package CompleteJavaBasics;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



/*

Difference between HashMap and Hashtable?

1. Synchronization or Thread Safe: This is the most important difference between two. HashMap is non-synchronized
and not thread safe. Hashtable is synchronized and thread safe.

When to use HashMap?

If your application do not require any multi-threading task, in other words hashmap is better for non-threading
applications. HashTable should be used in multithreading applications.


2. Null keys and null values: HashMap allows one null key and any number of null values, while Hashtable don't allow
null keys and null values in the Hashtable object.

3. Iterating the values: HashMap object values are iterated by using iterator. Hashtable is the only class other
than vector which uses enumerator to iterate the values of HashTable object.





*/
public class CoreJavaPartThree_DifferenceBetweenHashMapAndHashTable {
    public static void main(String[] args) {

        Hashtable<Integer,String> hashTable = new Hashtable<>();
        hashTable.put(0,"Howdy");
        hashTable.put(1,"Goodbye");
        hashTable.put(42,"Morning");
        //hashTable.put(2,null);
        hashTable.put(3,"Evening");
        System.out.println(hashTable.get(42));
        hashTable.remove(42);
        System.out.println(hashTable.get(42));
        Set dictionarySet = hashTable.entrySet(); //  hashTable.entrySet() => Means make all the key value pairs as a set
        Iterator iterateDictionary = dictionarySet.iterator();
        while (iterateDictionary.hasNext()){
            //System.out.println(iterateDictionary.next());

            //    Map.Entry mapEntry = (Map.Entry) iterateDictionary.next(); => To get the key and the value separate

            Map.Entry mapEntry = (Map.Entry)iterateDictionary.next();

            System.out.println("Print the key and value separate using map entry: " + mapEntry.getKey()+" "+mapEntry.getValue());
        }

    }
}
