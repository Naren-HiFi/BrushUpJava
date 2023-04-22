package CompleteJavaBasics;

public class MultidimensionalArray {
    public static void main(String[] args) {

        /*

        2 4 5
        3 6 7

        */


        //         multiDimensionalArray[row][column];
        int multiDimensionalArray[][] = new int[2][3];
        multiDimensionalArray[0][0]= 2;
        multiDimensionalArray[0][1]= 4;
        multiDimensionalArray[0][2]= 5;
        multiDimensionalArray[1][0]= 3;
        multiDimensionalArray[1][1]= 6;
        multiDimensionalArray[1][2]= 7;
        System.out.println(multiDimensionalArray[1][1]);
        System.out.println();


        for (int k=0;k<2;k++){  //row
             for (int l=0;l<3;l++){  // column
                 System.out.print(multiDimensionalArray[k][l]+ " ");
             }
             System.out.println();
         }

        System.out.println();


        int b[][] = {{2,4,5},{3,6,9},{5,2,1}};
        System.out.println(b[1][1]);

        System.out.println();


        for (int y=0;y<3;y++){
            for(int z=0;z<3;z++){
                System.out.print(b[y][z]+" ");
            }
            System.out.println();
        }

         /*

        2 4 5
        3 4 7
        1 2 9

         Print the minimum number from the above matrix

        */
        System.out.println();

        int multiArray[][] = {{22,4,5},{3,4,7},{1,2,9}};
        int min = multiArray[0][0];

        for (int p=0;p<3;p++){
            for (int q=0;q<3;q++){
                if(multiArray[p][q]<min){
                    min = multiArray[p][q];

                }
            }

        }
        System.out.println("Print the minimum number from the above matrix: " + min);
        System.out.println();

        int max = multiArray[2][2];

        for (int r=0;r<3;r++){
            for (int s=0;s<3;s++){
                if(multiArray[r][s]>max){
                    max = multiArray[r][s];

                }
            }

        }
        System.out.println("Print the maximum number from the above matrix: " + max);
        System.out.println();

           /*

        2 10 1
        3 2 7
        4 2 99

       Print the minimum number from the row. At the same time print the maximum number of that particular
       column

        Output => 99 in which the minimum number of the row is 0

        Step 1: Find the minimum number

        Step 2: Identify the column of the minimum number

        Step 3: Find the maximum number in the identified column


        System.out.println();


        */
        int abc[][]={{2,10,1},{3,2,7},{4,2,99}};
        int minimum=abc[0][0];
        int mincoloumn = 0;


        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(abc[i][j]<minimum)//2
                {
                    minimum=abc[i][j];
                    mincoloumn=j;
                }
            }
        }
//=1
        int maximum=abc[0][mincoloumn];
        int k = 0;
        while(k<3)
        {
            if(abc[k][mincoloumn]>maximum)
            {
                maximum=abc[k][mincoloumn];
            }
            k++;
        }

        System.out.println(maximum);

    }
}
