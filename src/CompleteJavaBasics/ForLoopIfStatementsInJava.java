package CompleteJavaBasics;

public class ForLoopIfStatementsInJava {
    public static void main(String[] args) {

        int[] numberArray = {1,2,4,5,6,7,8,9,10,122};

        for(int i=0; i < numberArray.length; i++){
            if(numberArray[i] % 2 == 0){
                System.out.println(numberArray[i] + " is a mutiple of 2");
                break;
            }
            else{
                System.out.println(numberArray[i] + " is a not mutiple of 2");
            }
        }

    }
}
