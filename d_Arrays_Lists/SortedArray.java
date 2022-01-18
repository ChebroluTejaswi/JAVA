package d_Arrays_Lists;
// ques: Write a program to sort the array in descending order.

import java.util.Scanner;

public class SortedArray {
    public static int [] getIntegers(int x)
    {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[x];
        for(int i=0;i<x;i++)
        {
            int num=sc.nextInt();
            arr[i]=num;
        }
        sc.close();
        return arr;
    }

    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Element "+i+" contents "+arr[i]);
        }
    }

    public static int[] sortIntegers(int [] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String args[])
    {
        printArray(sortIntegers(getIntegers(5)));
    }
}
