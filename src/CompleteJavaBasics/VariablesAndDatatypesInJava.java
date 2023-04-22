package CompleteJavaBasics;

//        Primitive data types:
//
//        byte: 8-bit signed integer
//        short: 16-bit signed integer
//        int: 32-bit signed integer
//        long: 64-bit signed integer
//        float: 32-bit floating point
//        double: 64-bit floating point
//        boolean: true or false
//        char: 16-bit Unicode character
public class VariablesAndDatatypesInJava {
    public static void main(String[] args) {


        int myNumber = 7;
        byte myByte = 8;
        short myShort = 34;
        float floatDecimal = 6.6666F;
        long longDecimal = 8888888888L;
        double doubleDecimal = 3.14;
        boolean isFalse = false;
        String linkedInProfile = "https://www.linkedin.com/in/naren-bagavathy-a2014a265/";
        char myChar = 'u';

        System.out.println("byte: 8-bit signed integer => " + myByte);
        System.out.println("short: 16-bit signed integer => " + myShort);
        System.out.println("int: 32-bit signed integer => " + myNumber);
        System.out.println("long: 64-bit signed integer => " + longDecimal);
        System.out.println("float: 32-bit floating point => " + floatDecimal);
        System.out.println("double: 64-bit floating point => " + doubleDecimal);
        System.out.println("boolean: returns true or false => " + isFalse);
        System.out.println("char: 16-bit unicode character => " + myChar);
        System.out.println("Reference data types => String: CompleteJavaBasics.A sequence of characters => " + linkedInProfile);


    }
}
