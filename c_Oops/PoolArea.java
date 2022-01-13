package c_Oops;
// ques: Create two classes: Rectangle and Cuboid(child class of Rectangle).
//       Write down methods to get area of the pool.

class Rectangle{
    private double width;
    private double length;
    public Rectangle(double width, double length)
    {
        if(width<0)
            this.width=0;
        else
            this.width=width;
        if(length<0)
            this.length=0;
        else
            this.length=length;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getLength()
    {
        return this.length;
    }
    public double getArea()
    {
        return this.width*this.length;
    }
}

class Cuboid extends Rectangle{
    private double height;
    public Cuboid(double width, double length, double height)
    {
        super(width, length);
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

public class PoolArea {
    public static void main(String args[])
    {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
