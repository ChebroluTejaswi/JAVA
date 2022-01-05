package a_Basics;
//ques: Conversion of kilometer per hour to miles per hour

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0)
            return -1;
        else{
            double milesPerHour = Math.round(kilometersPerHour / 1.609);
            return (long) milesPerHour;
        }
    }
    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
    }
    public static void main(String args[] ){
        printConversion(23.4);
    }
}
