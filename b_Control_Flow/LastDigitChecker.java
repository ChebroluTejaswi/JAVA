package b_Control_Flow;
// ques:

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) && isValid(b) && isValid(c))
        {
            if(a%10==b%10 || a%10==c%10 || b%10==c%10)
                return true;
            else
                return false;
        }
        else
            return false;
    }
    public static boolean isValid(int a){
        if(a<10 || a>1000)
            return false;
        else
            return true;
    }
    public static void main(String args[])
    {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
}
