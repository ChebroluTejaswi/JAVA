package b_Control_Flow;
// ques: Write a method to print out the passed number using words for the digits.

public class NumberToWords {
    public static void numberToWords(int number)
    {
        if(number<0)
            System.out.println("Invalid Value");
        else
        {
            int c=0;
            int d=getDigitCount(number);
            // We have to reverse the number before printing.
            number= reverse(number);
            while(number!=0)
            {
                int temp=number%10;
                switch(temp){
                    case 0: 
                        System.out.print("Zero"+" ");
                        break;
                    case 1:
                        System.out.print("One"+" ");
                        break;
                    case 2: 
                        System.out.print("Two"+" ");
                        break;
                    case 3:
                        System.out.print("Three"+" ");
                        break;
                    case 4: 
                        System.out.print("Four"+" ");
                        break;
                    case 5:
                        System.out.print("Five"+" ");
                        break;
                    case 6: 
                        System.out.print("Six"+" ");
                        break;
                    case 7:
                        System.out.print("Seven"+" ");
                        break;
                    case 8: 
                        System.out.print("Eight"+" ");
                        break;
                    case 9:
                        System.out.print("Nine"+" ");
                        break;
                }
                number=number/10;
                c=c+1;
            }
            // For numbers like :100 on reversing it becomes 001(i.e 1)
            // Therefore we are using getDigitCount method to get number of digits.
            if(c==d)
                System.out.print("\n");
            else
            {
                while(c!=d)
                {
                    System.out.print("Zero ");
                    c++;
                }
                System.out.print("\n");
            }
        }
    }
     
    public static int reverse(int number)
    {
        int revnum=0;
        while(number!=0)
        {
            int temp=number%10;
            revnum=revnum*10+temp;
            number=number/10;
        }
        return revnum;
    }

    public static int getDigitCount(int number)
    {
        int count=0;
        if(number<0)
            return -1;
        else if(number>=0 && number<9)
            return 1;
        else{
            while(number!=0)
            {
                count=count+1;
                number=number/10;
            }
            return count;
        }
    }
    public static void main(String args[])
    {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
}
