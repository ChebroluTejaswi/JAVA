package b_Control_Flow;
// ques: Compute the sum of even digits in a number

public class EvenDigitSum {
    public static int getEvenDigitSum(int number)
    {
        int sum=0;
        if(number<0)
            return -1;
        else
        {
            while(number!=0)
            {
                int temp=number%10;
                number=number/10;
                if(temp%2==0)
                    sum=sum+temp;
            }
            return sum;
        }
    }
    public static void main(String args[]){
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}
