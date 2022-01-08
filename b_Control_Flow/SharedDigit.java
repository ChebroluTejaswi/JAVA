package b_Control_Flow;
// ques: Write a method which returns true if a digit appears in both numbers.

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b)
    {
        if(a<10 || a>99 || b<10 || b>99)
            return false;
        else
        {
            // Instead of using nested while loop, we can use a single loop to store digits of a number in an array.
            // Then, compare both the arrays.
            while(a!=0)
            {
                int temp1=a%10;
                int n=b;
                while(n!=0)
                {
                    if(temp1==(n%10))
                        return true;
                    n=n/10;
                }
                a=a/10;
            }
            return false;
        }
    }
    public static void main(String args[])
    {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }
}
