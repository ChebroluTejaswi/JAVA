package c_Oops;
// ques: Simple implementation of Polymorphism concept in JAVA.

// BASE class
class Car{ 
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    public Car(int cylinders, String name)
    {
        this.cylinders=cylinders;
        this.name=name;
        this.engine=false;
        this.wheels=4;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
    public int getCylinders(){
        return this.cylinders;
    }
    public String getName(){
        return this.name;
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name)
    {
        super(cylinders, name);
    }
    public String startEngine(){
        return "Mitsubishi -> startEngine()";
    }
    public String accelerate(){
        return "Mitsubishi -> accelerate()";
    }
    public String brake(){
        return "Mitsubishi -> brake()";
    }
}

class Holden extends Car{
    public Holden(int cylinders, String name)
    {
        super(cylinders, name);
    }
    public String startEngine(){
        return "Holden -> startEngine()";
    }
    public String accelerate(){
        return "Holden -> accelerate()";
    }
    public String brake(){
        return "Holden -> brake()";
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name)
    {
        super(cylinders, name);
    }
    public String startEngine(){
        return "Ford -> startEngine()";
    }
    public String accelerate(){
        return "Ford -> accelerate()";
    }
    public String brake(){
        return "Ford -> brake()";
    }
}

public class car_company {
    public static void main(String args[])
    {

    }
}
