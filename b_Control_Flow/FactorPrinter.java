package b_Control_Flow;
// ques: Write a Method to print all factors of aumber.
// A factor of a number is an integer which divides the number wholly(i.e without leaving a remainder)

import java.util.*;
public class FactorPrinter {
    public static void printFactors(int number)
    {
        if(number<1)
            System.out.println("Invalid Value");
        else
        {
            // Time complexicity:O(n)
            /*
            for(int i=1;i<=number;i++)
            {
                if(number%i==0)
                    System.out.print(i+" ");
            }
            System.out.println("\n");
            */

            List<Integer> factors = new ArrayList<Integer>();
            for(int i = 1; i <= number/i; ++i) {
                if(number % i == 0) {
                    //if i is a factor, num/i is also a factor
                    factors.add(i);
                    factors.add(number/i);
                }
            }
            Collections.sort(factors); //sort the factors
            factors.forEach(factor -> System.out.print(factor+" "));
            System.out.println("\n");
        }
    }
    public static void main(String args[])
    {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}
