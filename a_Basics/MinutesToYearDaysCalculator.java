package a_Basics;
// ques: Convert the given number of minutes into year and days

public class MinutesToYearDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0)
            System.out.println("Invalid Value");
        else
        {
            long days;
            days=minutes/(long)(60*24);
            int year;
            year=(int)days/365;
            int day=(int)days%365;
            System.out.println(minutes+" min = "+year+" y and "+day+" d");
        }
    }
    public static void main(String args[]){
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}
