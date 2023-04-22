package CompleteJavaBasics;
// Why methods ? If you want to reuse that you want to use everytime then you can call methods
//               You can wrap all those lines in one block, and for that block, you can give a name to the block

public class MethodsAccessMethodsUsingJavaClassObjects {

    public int getEmployeeId(){
        System.out.println("Get the employee id");
        return 1;
    }

    public String getCustomerName(){
        System.out.println("Get the customer name");
        return "Naren";
    }

    public static boolean isCustomer(){
        System.out.println("Is customer exists?");
        return true;
    }


    public static void main(String[] args) {
        MethodsAccessMethodsUsingJavaClassObjects m1 = new MethodsAccessMethodsUsingJavaClassObjects();

        int employeeId = m1.getEmployeeId();
        System.out.println("The employee id: " + employeeId);

        String customerData = m1.getCustomerName();
        System.out.println("The customer name: " + customerData);


        MethodsAccessMethodsUsingJavaClassObjects2 m2 = new MethodsAccessMethodsUsingJavaClassObjects2();
        String cusMobileNumber = m2.customerMobileNumber();
        System.out.println("The customer mobile number: " + cusMobileNumber);


        boolean isCustomerExists = MethodsAccessMethodsUsingJavaClassObjects.isCustomer();
        isCustomer();
        System.out.println("Is customer exists: " + isCustomerExists);


    }
}
