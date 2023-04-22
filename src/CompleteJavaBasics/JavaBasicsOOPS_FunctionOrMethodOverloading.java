package CompleteJavaBasics;
/*

    What is Method or function overloading?

   The same class that contains multiple methods with the same name is called function or method overloading.
   The argument count should be different or argument return type should be different

Real life scenario:

E-commerce website => You'd selected the item and added to cart. You're in a confirmation page and there
when confirming
the payment, it calls the paymentMethod. But one payment method takes debit card as an argument, other
payment method takes credit card as an argument, and one payment method takes gift card as an argument

Same payment method but we are passing different types of arguments
*/

public class JavaBasicsOOPS_FunctionOrMethodOverloading {

    public void getData (int a){
        System.out.println(a);
    }

    public void getData (int a, int b){
        int c;
        System.out.println(c = a+b);
    }

    public void getData (String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        JavaBasicsOOPS_FunctionOrMethodOverloading functionOrMethodOverloading = new JavaBasicsOOPS_FunctionOrMethodOverloading();
        functionOrMethodOverloading.getData(7);
        functionOrMethodOverloading.getData(10,11);
        functionOrMethodOverloading.getData("Naren Bagavathy");
    }

}
