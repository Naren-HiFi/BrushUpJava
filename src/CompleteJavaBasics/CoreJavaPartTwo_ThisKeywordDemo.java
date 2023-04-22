package CompleteJavaBasics;

public class CoreJavaPartTwo_ThisKeywordDemo {

    // this refers to the current object - object scope lies in the class level
    int a = 2;

    public void getData(){
        int a = 3;
        int b = a + this.a;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);

    }
    public static void main(String[] args) {
        CoreJavaPartTwo_ThisKeywordDemo thisKeywordDemo = new CoreJavaPartTwo_ThisKeywordDemo();
        thisKeywordDemo.getData();


    }

}
