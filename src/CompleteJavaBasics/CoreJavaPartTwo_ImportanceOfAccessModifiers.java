package CompleteJavaBasics;


/*

public, private, protected, and default are the access modifiers in java

default:

That is you can only use this access method anywhere in
your package. Outside the package this method isn't accessible.

public:

 You can have access across all the packages.

private:

If you mark a variable or method as private, you can't access method or variable
outside the class of the same package.

protected:

If the variable/method is defined as protected. You can access those in subclasses only (other packages)
Access all the classes in the same package + subclass inherit the properties of the parent class
*/
public class CoreJavaPartTwo_ImportanceOfAccessModifiers {
    public static void main(String[] args) {

    }

    void myAccessmodifier() // This is the default access modifier. That is you can only use this method anywhere in
    // your package. Outside the package this method isn't accessible.
    {

    }
}
