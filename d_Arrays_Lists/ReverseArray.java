package d_Arrays_Lists;
// ques: Write a program to print reverse of an array.

import java.util.Arrays;
public class ReverseArray {
    private static void reverse(int arr[])
    {
        System.out.print("Array = "+Arrays.toString(arr));
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int x=arr[i];
            arr[i]=arr[j];
            arr[j]=x;
            i++;
            j--;
        }
        System.out.print("Reversed array = "+Arrays.toString(arr));
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4};
        reverse(arr);        
    }
}
