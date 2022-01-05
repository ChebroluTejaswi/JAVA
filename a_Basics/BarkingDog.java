package a_Basics;
// ques:We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
// We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23)
            return false;
        else if(barking==true && (hourOfDay<8 || hourOfDay>22))
            return true;
        else 
            return false;
    }
    public static void main(String args[]){
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
    }
}
