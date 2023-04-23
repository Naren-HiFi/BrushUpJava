package CompleteJavaBasics;

public class CoreJavaPartTwo_ExceptionsInJava {
    int a =4;
   /*
   3 lines of code I'm not sure whether the 3 lines of code will throw an error or not.

    If there is an error, I need to catch them and print the message without failing

    This can be done so using try catch mechanism

    One try block can be followed by multiple catch blocks

    catch block should be an immediate block after try

    finally block will not be executed when you stop JVM forcibly

    */

    int c = 7;
    int b = 0;

  public  void handleIndexException(){
      int[] intArray = new int[5];
      intArray[0]=1;
      intArray[1]=2;
      intArray[2]=3;
      intArray[3]=4;
      intArray[4]=5;
      try {
          System.out.println(intArray[5]);
      }

        catch (IndexOutOfBoundsException outOfBoundsException)
      {
          System.out.println("IndexOutOfBoundsException caught: " +outOfBoundsException.getMessage());
      }

      finally{
          System.out.println("I will execute immaterial of the exception thrown or not");
      }
  }


    public void handleException(){
        try
        {
            int k = c/b;


            System.out.println(k);

        }

        catch (ArithmeticException arithmeticException)
        {
            System.out.println("ArithmeticException caught: " +arithmeticException.getMessage());
        }



        finally{
            System.out.println("Delete cookies");
            System.out.println("Close the browser");

        }

    }


    public static void main(String[] args) {
        CoreJavaPartTwo_ExceptionsInJava exceptionsInJava= new CoreJavaPartTwo_ExceptionsInJava();
        exceptionsInJava.handleException();
        exceptionsInJava.handleIndexException();



    }

}
