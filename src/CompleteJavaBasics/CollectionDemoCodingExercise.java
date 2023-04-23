package CompleteJavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemoCodingExercise {
    public static void main(String[] args) {

        int[] a = {4,5,5,5,4,6,6,9,4};

        // Print unique number from the list - Amazon

        ArrayList<Integer> numberList = new ArrayList<>();

        for (int i=0;i<a.length;i++){
            int countRepetitionNumbers=0;

            if(!numberList.contains(a[i])){
                numberList.add(a[i]);
                countRepetitionNumbers++;

                for (int j=i+1;j<a.length;j++){
                    if (a[i]==a[j]){
                        countRepetitionNumbers++;
                    }
                }
                System.out.println(a[i]+ " is a current number");
                System.out.println(a[i]+ " gets repeated "+ countRepetitionNumbers + " times");
                if(countRepetitionNumbers==1){
                    System.out.println(a[i]+" is a unique number");
                }
            }


        }


        // Print Unique Number From The Array
        List<Integer> integersList = Arrays.asList(4,5,5,5,4,6,6,9,4);
        integersList.stream().distinct().forEach( integer -> System.out.println("Print the unique numbers: " + integer));

        //Print Unique Number From The Array in the ascending order
        integersList.stream().distinct().sorted().forEach(integer -> System.out.println("Print unique number of the Array in the ascending order: " + integer));




    }
}
