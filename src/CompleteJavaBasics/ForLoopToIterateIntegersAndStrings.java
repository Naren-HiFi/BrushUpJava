package CompleteJavaBasics;

public class ForLoopToIterateIntegersAndStrings {
    public static void main(String[] args) {
        int[] arrayNumbers = {1,2,3,4,5,6,7,8};
        String[] namesList = {"Naren","Ahila","Srimathy","Bagavathy"};

        for(int i=0;i<arrayNumbers.length;i++){
            System.out.println("Print the array numbers in the new line: " + arrayNumbers[i]);
        }

        for(int i=0;i<namesList.length;i++){
            System.out.println("Print the string names from the array in the new line: " + namesList[i]);
        }
    }
}
