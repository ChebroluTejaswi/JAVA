package b_Control_Flow;
// ques: write a method to calculate largest prime factor of a given number and retrun it.

public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number<=0 || number==1)
            return -1;
        else
        {
            int max=0;
            while (number % 2 == 0) {
                if(max<2)
                    max=2;
                number /= 2;
            }
    
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                while (number % i == 0) {
                    if(max<i)
                        max=i;
                    number /= i;
                }
            }
            if (number > 2 && max<number)
                max=number;
            return max;
        }
    }
    public static void main (String args[]){
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
}
