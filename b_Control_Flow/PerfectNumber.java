package b_Control_Flow;
// ques: Write a method to verify a number is perfect number or not.
// A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
// Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder 
// and exclude the perfect number itself.

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number<1)
            return false;
        else
        {
            int sum=0;
            // time complexicity: O(n)
            /*
            for(int i=1;i<number;i++)
            {
                if(number%i==0)
                    sum=sum+i;
            }
            */

            for(int i=1;i<=number/i;++i)
            {
                if(number%i==0)
                    sum=sum+i+(number/i);
            }
            
            if((sum-number)==number)
                return true;
            else
                return false;
        }
    }
    public static void main(String args[]){
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
}
