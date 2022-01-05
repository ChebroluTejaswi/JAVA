package a_Basics;
// ques: check if sum of first two numbers is equal to third number.

public class EqualSumChecker {
    public static boolean hasEqualSum(int a, int b, int c){
        if(a+b==c)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }
}
