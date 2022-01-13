package c_Oops;
// ques: Create a class Point with attributes: x and y.
//       Write down a methods to get and set attributes. Also define a method to calculate distance.

public class Point {
    private int x;
    private int y;
    public Point(){
        System.out.println("No-Args Constructors called!");
    }
    public Point(int x, int y)
    {
        this.x=x; this.y=y;
    }
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public double distance() // distance between obj point and (0,0)
    {
        return Math.sqrt((this.x*this.x)+(this.y*this.y));
    }
    public double distance(int x, int y) // distance between obj point and given point(x,y)
    {
        return Math.sqrt(((this.x-x)*(this.x-x))+((this.y-y)*(this.y-y)));
    }
    // passing a object as parameter
    public double distance(Point p) // distance between obj point and given point object(x,y)
    {
        return Math.sqrt(((this.x-p.x)*(this.x-p.x))+((this.y-p.y)*(this.y-p.y)));   
    }

    public static void main(String args[])
    {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
