package CompleteJavaBasics;

public class JavaBasicsOOPS_HowDoWhileLoopWorks {
    public static void main(String[] args) {
        int z = 20;
        do {
            System.out.println("Print the numbers from 20 to 30: " + z);
            z++;
        }while (z<=30);

        // The difference between while and do while loop is that atleast one loop of execution
        // is guaranteed in do while loop.
    }
}
