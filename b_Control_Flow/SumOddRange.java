package b_Control_Flow;
// ques: Compute the sum of all the odd numbers in the given range.

public class SumOddRange {
    public static boolean isOdd(int number)
    {
        if(number>0 && number%2!=0)
            return true;
        else
            return false;
    }
    public static int sumOdd(int start, int end)
    {
        int sum=0;
        if(end<start || end<0 ||start<0)
            return -1;
        for(int i= start;i<=end;i++)
        {
            if(isOdd(i))
                sum=sum+i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
    }
}
