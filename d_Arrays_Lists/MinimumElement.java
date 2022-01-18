package d_Arrays_Lists;
// ques: Write a program to print minimum element in an array

import java.util.Scanner;

public class MinimumElement {
    public static int readInteger()
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        sc.close();
        return size;
    }
    public static int[] readElements(int size)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            int num=sc.nextInt();
            arr[i]=num;
        }
        sc.close();
        return arr;
    }
    public static int findMin(int [] arr)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static void main(String args[])
    {
        int x=readInteger();
        System.out.println(findMin(readElements(x)));
    }
}
