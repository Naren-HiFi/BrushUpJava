package CompleteJavaBasics;

/*
Map

        A map is an interface that takes values in the form of key-value pair
         and an object that maps keys to values. A map can't contain duplicate keys.

        Below are classes that implement Map interfaces


        => HashMap
        => LinkedHashMap
        => TreeMap
        => HashTable

   hashMap.entrySet() => Means make all the key value pairs as a set

    Map.Entry mapEntry = (Map.Entry) iterateDictionary.next(); => To get the key and the value separate

 Create a HashTable and pass the table to the Set Collection and Print the Key and Value Separately using the iterator

*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CoreJavaPartThree_MapInterfaceImplementation {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(0,"Howdy");
        hashMap.put(1,"Goodbye");
        hashMap.put(42,"Morning");
        hashMap.put(3,"Evening");
        System.out.println(hashMap.get(42));
        hashMap.remove(42);
        System.out.println(hashMap.get(42));
        Set dictionarySet = hashMap.entrySet(); //  hashMap.entrySet() => Means make all the key value pairs as a set
        Iterator iterateDictionary = dictionarySet.iterator();
        while (iterateDictionary.hasNext()){
            //System.out.println(iterateDictionary.next());

            //    Map.Entry mapEntry = (Map.Entry) iterateDictionary.next(); => To get the key and the value separate

            Map.Entry mapEntry = (Map.Entry)iterateDictionary.next();

            System.out.println("Print the key and value separate using map entry: " + mapEntry.getKey()+" "+mapEntry.getValue());
        }

    }
}
