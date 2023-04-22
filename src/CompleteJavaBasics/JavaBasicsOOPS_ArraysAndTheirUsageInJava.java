package CompleteJavaBasics;

public class JavaBasicsOOPS_ArraysAndTheirUsageInJava {

    public static void main(String[] args) {
        // An array is a container that stores multiple values of same data type.
        int[] integerArray = new int[5]; // Declare an array and allocate the memory for the variable.
        integerArray[0] = 2;
        integerArray[1] = 4;
        integerArray[2] = 6;
        integerArray[3] = 8;
        integerArray[4] = 10;

        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i]); // Retrieve values present in the array.
        }

        System.out.println();


        int b[] = {1, 3, 5, 7, 9};

        for (int j = 0; j < b.length; j++) {
            System.out.println(b[j]);
        }


    }
}
