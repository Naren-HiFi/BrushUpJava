package CompleteJavaBasics;


import java.util.HashSet;
import java.util.Iterator;

/*

HashSet Data Structure Implementation:

Set

A set is an interface and is a collection that can't contain duplicate elements.

However, it makes no guarantee concerning the order of iteration

Below are classes that implement List interface

=> HashSet
=> LinkedHashSet
=> TreeSet

There is no guarantee that elements are stored in the sequential order (Random Order).


Iterator interface in HashSet

Iterator interface helps to traverse through each and every object in the present Set.

iterateString.next() => Initially, the iterateString object will be on the top of the set. When iterateString.next()
is called, it will come down and focus its direction to the first index. You can print the values present in the
index. If you want to print the second value in the index, you have to call the iterateString.next() method again.

hasNext() checks whether the next index is present or not

*/
public class CoreJavaPartThree_HashSetImplementation {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("USA");
        hashSet.add("UK");
        hashSet.add("INDIA");
        hashSet.add("AUSTRALIA");
        hashSet.add("Switzerland");
        System.out.println(hashSet);
        //System.out.println(hashSet.remove("UK"));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.size());
        System.out.println(hashSet);

        Iterator<String> iterateString =  hashSet.iterator();

        while (iterateString.hasNext()){
            System.out.println(iterateString.next());
        }
        /*System.out.println(iterateString.next());
        System.out.println(iterateString.next());
        System.out.println(iterateString.next());
        System.out.println(iterateString.next());*/


    }

}
