package CompleteJavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListIterateListUsingForLoop {

    public void abc(){
        System.out.println("Calling the method from another class");
    }
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(700);
        integerArrayList.add(600);
        integerArrayList.add(8001);
        integerArrayList.add(10000);
        integerArrayList.remove(1);

        for(int i = 0; i< integerArrayList.size(); i++)
        {
            System.out.println("Print the numbers in the array list: " + integerArrayList.get(i));
        }

        String[] coursesList= {"UiPath","Java","Python"};
        List<String> coursesNames = Arrays.asList(coursesList);

        System.out.println("Does the course list contain python? " + coursesNames.contains("Python"));
        for (String nameList: coursesNames) {
            System.out.println("The following skills are: "+ nameList);
        }

    }
}
