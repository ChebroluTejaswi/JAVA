package b_Control_Flow;
// ques: For each row/column stars are printed on 4 conditions
    /* 
    ********    In the first or last row
    **    **
    * *  * *    In the first or last column
    *  **  *
    *  **  *    When the row number equals the column number
    * *  * *
    **    **    When the column number equals rowCount - currentRow + 1 (when followed 1 indexing)
    ********
    */
    // number: number of rows to print

public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number<5)
            System.out.println("Invalid Value");
        else{
            for(int i=0;i<number;i++)
            {
                for(int j=0;j<number;j++)
                {
                    // first an last row/column
                    if(i==0 || j==0 || i==(number-1) || j==(number-1)) 
                        System.out.print("*");
                    // diagonals 
                    else if(i==j || i+j==(number-1))
                        System.out.print("*");
                    else 
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
    }
    public static void main(String argsp[])
    {
        printSquareStar(5);
        printSquareStar(3);
        printSquareStar(8);
    }
}
