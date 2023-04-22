package CompleteJavaBasics;/*


What is a constructor?

Constructor executes a block of code whenever an object is created

The difference between the method or function and constructor is that  constructor will not return values
The name of the constructor should be the class name

Compiler will call implicit constructor if you have not defined constructor block explicitly.

*/

public class CoreJavaPartTwo_ConstructorsInJava {

     // Default Constructor
    // In general the people will use the constructor block to define variables or initiate some properties
    // in the real time
    public CoreJavaPartTwo_ConstructorsInJava(){
        System.out.println("I am the constructor");
    }

    // Parameterised constructors
    public CoreJavaPartTwo_ConstructorsInJava(int a, int b){
        int c;
        System.out.println("I am the parameterised constructor with int arguments");
        System.out.println(c=a+b);
    }

    public  CoreJavaPartTwo_ConstructorsInJava(String nameOfEmployee){
        System.out.println("I am the parameterised constructor with string argument");
        System.out.println(nameOfEmployee);
    }

    public void getMethod(){
        System.out.println("I am the method");
    }

    public static void main(String[] args) {

        // Constructor is called whenever you create an object
        CoreJavaPartTwo_ConstructorsInJava constructorsInJava = new CoreJavaPartTwo_ConstructorsInJava();
        CoreJavaPartTwo_ConstructorsInJava constructorsInJava1 = new CoreJavaPartTwo_ConstructorsInJava(7,10);
        CoreJavaPartTwo_ConstructorsInJava constructorsInJava2 = new CoreJavaPartTwo_ConstructorsInJava("Naren B");

        constructorsInJava.getMethod(); // Method is called

    }
}
