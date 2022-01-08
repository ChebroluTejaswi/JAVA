package b_Control_Flow;
// ques: Find the largest positive integer that can fully divide each of the integers(i.e without leaving a remainder)

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10)
            return -1;
        else
        {
            int n;
            int gcd=0;
            n=(first<second)?first:second;
            // not an efficient method
            for(int i=1;i<=n;i++)
            {
                if(first%i==0 && second%i==0)
                    gcd=i;
            }
            return gcd;
        }
    }
    public static void main(String args[]){
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
}