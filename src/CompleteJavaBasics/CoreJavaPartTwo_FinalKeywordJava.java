package CompleteJavaBasics;
/*

What is Final in Java?

If you mark the class name as final, then you can't extend the class.


*/

public class CoreJavaPartTwo_FinalKeywordJava {

    final void getUserData(){
        // The final method can't be overridden
    }
    final int myIntegerVariable =5;

    //int myIntegerVariable = 6; // You can't the change the value of the variable once it is declared final
}
