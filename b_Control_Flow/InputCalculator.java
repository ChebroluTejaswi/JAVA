package b_Control_Flow;
// ques: Write a method to read user's input. If user enters a non integer value,
// Then stop reading and print the sum and average of previously entered values.

import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int sum=0,count=0;
        long avg=0;
        // read integers from keyboard
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            boolean isAnInt = sc.hasNextInt();
            if(isAnInt){
                int temp=sc.nextInt();
                sum=sum+temp;
                count=count+1;
            }
            else
            {
                if(count!=0)
                    avg=Math.round((double)sum/count);
                System.out.println("SUM = "+sum+" AVG = "+avg);
                sc.close();
                return;
            }
        }
    } 

    public static void main(String args[]){
        inputThenPrintSumAndAverage();
    }
}
