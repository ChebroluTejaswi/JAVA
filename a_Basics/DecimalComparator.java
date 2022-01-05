package a_Basics;
// ques: compare two double values upto 3 decimal places

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        int f,s;
        f=(int)(first*1000);
        s=(int)(second*1000);
        if(f==s)
            return true;
        else
            return false;
    }
    public static void main(String args[]){
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));
    }
}
