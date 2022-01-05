package a_Basics;
//ques: Write a method to calculate area of circle.
// Also write another method overriding the previous one to find out area of rectangle.

public class AreaCalculator {
    public static double area(double radius){
        if(radius<0)
            return -1.0;
        else
        {
            return (double)(Math.PI*radius*radius);
        }
    }
    public static double area(double x, double y){
        if(x<0 || y<0)
            return -1.0;
        else
        {
            return (double)(x*y);
        }
    }
    public static void main(String args[]){
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
    }
}
