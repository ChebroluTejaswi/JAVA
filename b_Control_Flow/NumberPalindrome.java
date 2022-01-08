package b_Control_Flow;
//ques: Write a method to check whether the entered number is palindrome or not.

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        
        long n=number;
        long pn=0;
        while(n!=0)
        {
            int temp=(int)n % 10;
            pn=pn*10+temp;
            n=n/10;
        }
        if(pn==number)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}
