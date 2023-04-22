package CompleteJavaBasics;

public class CoreJavaPartTwo_StaticVariables {

    // Creating instance variables
    String name;
    String address;
    static String city = "Bangalore";
    static int i = 0; // Static variable is a class variable

    // Static Block
    static{
        i = 0;
        city = "Bangalore";
    }

    CoreJavaPartTwo_StaticVariables(String name, String address){

        // Assigning the local variables to the instance variables
        this.name = name;
        this.address = address;
        this.city = city;
        i++;
        System.out.println("Total Number Of Employees: "+ i);
    }

    public void getName(){
        System.out.println(name);
    }

    public void getAddress(){
        System.out.println(address+" "+city);
    }

    public static void printAddress(){
        System.out.println(city);
    }


    public static void main(String[] args) {

CoreJavaPartTwo_StaticVariables staticVariables =  new CoreJavaPartTwo_StaticVariables("Bob","Marthalli");
CoreJavaPartTwo_StaticVariables staticVariables1 =  new CoreJavaPartTwo_StaticVariables("Ram","Jayanagar");

staticVariables.getName();
staticVariables.getAddress();

staticVariables1.getName();
staticVariables1.getAddress();


    }
}
