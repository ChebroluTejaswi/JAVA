package c_Oops;
// ques: Simple implementation of Composition concept in JAVA.

class Lamp{
    private String style;
    private boolean battery;
    private int globRating;
    public Lamp(String style, boolean battery, int globrating)
    {
        this.style=style;
        this.battery=battery;
        this.globRating=globrating;
    }
    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }
    public String getStyle(){
        return this.style;
    }
    public boolean isBattery(){
        return this.battery;
    }
    public int getGlobRating(){
        return this.globRating;
    }
}

class Bed{
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
    public Bed(String style, int pillows, int height, int sheets, int quilt)
    {
        this.style=style;
        this.pillows=pillows;
        this.height=height;
        this.quilt=quilt;
        this.sheets=sheets;
    }
    public void make(){
        System.out.println("Bed -> Making | ");
    }
    public String getStyle(){
        return this.style;
    }
    public int getPillows(){
        return this.pillows;
    }
    public int getHeight(){
        return this.height;
    }
    public int getSheets(){
        return this.sheets;
    }
    public int getQuilt(){
        return this.quilt;
    }
}

class Ceiling{
    private int height;
    private int paintedColor;
    public Ceiling(int height, int paintedColor)
    {
        this.height= height;
        this.paintedColor=paintedColor;
    }
    public int getHeight(){
        return this.height;
    }
    public int getPaintedColor(){
        return this.paintedColor;
    }
}

class Wall{
    private String direction;
    public Wall(String direction)
    {
        this.direction=direction;
    }
    public String getDirection(){
        return this.direction;
    }
}

class Bedroom{
    private String name;
    private Wall wall1,wall2,wall3,wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    public Bedroom(String name,Wall wall1, Wall wall2, Wall wall3, Wall wall4,
    Ceiling ceiling, Bed bed, Lamp lamp)
    {
        this.name=name;
        this.wall1=wall1; this.wall2=wall2; this.wall3=wall3; this.wall4=wall4;
        this.ceiling=ceiling; this.bed=bed; this.lamp=lamp;
    }
    public Lamp getLamp(){
        return this.lamp;
    }
    public void makeBed(){
        System.out.println("Bedroom -> Making bed | ");
        bed.make();
    }
    public String getName()
    {
        return this.name;
    }
    public Ceiling getCeiling()
    {
        return this.ceiling;
    }
    public Wall getWall1()
    {
        return this.wall1;
    }
    public Wall getWall2()
    {
        return this.wall2;
    }
    public Wall getWall3()
    {
        return this.wall3;
    }
    public Wall getWall4()
    {
        return this.wall4;
    }
}


public class Room {
    public static void main(String args[])
    {
        Wall wall1= new Wall("West");
        Wall wall2= new Wall("East");
        Wall wall3= new Wall("South");
        Wall wall4= new Wall("North");
        Ceiling ceiling= new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp= new Lamp("Classic", false, 75);
        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }    
}

