package CompleteJavaBasics;

public class CoreJavaPartTwo_ChildSuperKeywordDemo extends CoreJavaPartTwo_ParentSuperKeywordDemo{
    String myName = "Child Variable";

    public void getVariable(){
        System.out.println(myName);
        System.out.println(super.myName);
    }
    public void myMethod(){
        System.out.println("I am the child method");
        super.myMethod();
    }

    public CoreJavaPartTwo_ChildSuperKeywordDemo(){
        super(); // This should always be the first line when calling the parent constructor
        System.out.println("I am the child constructor");
    }

    public static void main(String[] args) {
        CoreJavaPartTwo_ChildSuperKeywordDemo childSuperKeywordDemo = new CoreJavaPartTwo_ChildSuperKeywordDemo();
        childSuperKeywordDemo.getVariable();
        childSuperKeywordDemo.myMethod();
    }
}
