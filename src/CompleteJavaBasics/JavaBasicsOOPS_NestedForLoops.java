package CompleteJavaBasics;

public class JavaBasicsOOPS_NestedForLoops {
    public static void main(String[] args) {

       /*

        Print this below output using nested for loop

        1 2 3 4
        5 6 7
        8 9
        10

        */

        int k=1;
        for(int j=4;j>=0;j--){
            for(int i = 1;i<=j;i++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }



        System.out.println("**********************************************************");

          /*

        Print this below output using nested for loop

        1
        2 3
        4 5 6
        7 8 9 10

        */

        int l = 1;
        for(int m=4;m>=0;m--){
            for(int n = 3;n>=m;n--){
                System.out.print(l+" ");
                l++;
            }
            System.out.println();
        }




        System.out.println("**********************************************************");

          /*

        Print this below output using nested for loop

        1
        1 2
        1 2 3
        1 2 3 4

        */

        //int c =1;
        for (int a=1;a<5;a++){
            for(int b=1;b<=a;b++){
                System.out.print(b+" ");
            }
            System.out.println();
        }


        System.out.println("**********************************************************");


        

    /*

        Print this below output using nested for loop

        3
        6 9
        12 15 18


        */

        int d = 1;
        for(int e=4;e>=0;e--){
            for(int f = 2;f>=e;f--){
                System.out.print(d*3+" ");
                d++;
            }
            System.out.println();
        }
    }
}
