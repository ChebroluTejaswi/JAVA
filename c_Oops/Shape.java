package c_Oops;
// ques: Create Two classes:  Circle and Cylinder(child of circle class).
//       Write down methods to get area of circle and cylinder. 

import java.lang.Math;
class Circle{
    private double radius;
    public Circle(double radius)
    {
        if(radius<0)
            this.radius=0;
        else
            this.radius=radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public double getArea()
    {
        return (this.radius*this.radius*(Math.PI));
    }
}

class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, double height){
        super(radius);
        if(height<0)
            this.height=0;
        else
            this.height=height;
    }
    public double getHeight()
    {
        return this.height;
    }
    public double getVolume()
    {
        return getArea()*this.height;
    }
}
public class Shape {
    public static void main(String args[])
    {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
