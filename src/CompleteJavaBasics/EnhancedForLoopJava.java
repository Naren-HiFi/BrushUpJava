package CompleteJavaBasics;

public class EnhancedForLoopJava {
    public static void main(String[] args) {

        int[] arrayNumbers = {1,2,3,4,5,6,7,8};

        for (int numberList: arrayNumbers)
        {
            System.out.println("Print the numbers in the int array using enhanced for loop: " + numberList);
        }

        String[] namesList = {"Naren","Ahila","Srimathy","Bagavathy"};

        for (String names: namesList)
        {
            System.out.println("Print the names in the string array using enhanced for loop: " + names);
        }


    }
}
