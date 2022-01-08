package b_Control_Flow;
// ques: For a given number return sum of it's first and last digit. 

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number)
    {
        int sum=number%10;
        if(number<0)
            return -1;
        while(number!=0)
        {
            int temp=number%10;
            number=number/10;
            if(number==0)
                sum=sum+temp;
        }
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
    }
}
