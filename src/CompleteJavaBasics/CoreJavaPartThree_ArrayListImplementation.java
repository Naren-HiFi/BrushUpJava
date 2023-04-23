package CompleteJavaBasics;

import java.util.ArrayList;

/*

ArrayList Data Structure In Java:

Below are classes implement List Interface

=> ArrayList
=> LinkedList
=> Vector

All the classes that implement list interface can accept duplicate values

You can add duplicate objects to the array list.

ArrayList, LinkedList, and Vector accept duplicate values.

Array have fixed size whereas arraylist can grow dynamically

You can access and insert any value into any index


*/
public class CoreJavaPartThree_ArrayListImplementation {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("rahul");
        arrayList.add("java");
        arrayList.add("java");
        System.out.println(arrayList);
        arrayList.add(0,"student");
        System.out.println(arrayList);
        //arrayList.remove(1);
        //arrayList.remove("rahul");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.contains("java"));
        System.out.println(arrayList.indexOf("rahul"));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());



    }
}
