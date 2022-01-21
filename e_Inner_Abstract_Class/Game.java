package e_Inner_Abstract_Class;
// ques: Using interface concept, write a program to read and write contents.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface ISaveable{
// Allows an object to be saved to some sort of storage medium

// Method 1: Return ArrayList of values to be saved
    public List<String> write();
// Method 2: To populate the object's fields from an ArrayList (parameter)
    public void read(List<String> savedValues);
}

class Player implements ISaveable{
    String name;
    String weapon;
    int hitPoints;
    int strength;
    public Player(String name, int hitPoints, int strength)
    {
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
        this.weapon="Sword";
    }

    @Override
    public List<String> write()
    {
        List<String> res=new ArrayList<>();
        res.add(0,this.name);
        res.add(1,""+this.hitPoints);
        res.add(2,""+this.strength);
        res.add(2,this.weapon);
        return res;
    }
    @Override
    public void read(List<String> savedValues){
        if(savedValues==null || savedValues.size()<=0)
            return;
        else
        {
            // store the values in the list
            this.name=savedValues.get(0);
            this.hitPoints=Integer.parseInt(savedValues.get(1));
            this.strength=Integer.parseInt(savedValues.get(2));
            this.weapon=savedValues.get(3);
        }
    }
    
    @Override
    public String toString()
    {
        return "Player{name='"+this.name+"', hitPoints="+
        this.hitPoints+", strength="+this.strength+", weapon='"+
        this.weapon+"'}";
    }
    // getter methods
    public String getName()
    {
        return this.name;
    }
    public String getWeapon()
    {
        return this.weapon;
    }
    public int getHitPoints()
    {
        return this.hitPoints;
    }
    public int getStrength()
    {
        return this.strength;
    }
    // setter methods
    public void setName(String name)
    {
        this.name=name;
    }
    public void setWeapon(String weapon)
    {
        this.weapon=weapon;
    }
    public void setHitPoints(int hitPoints)
    {
        this.hitPoints=hitPoints;
    }
    public void setStrength(int strength)
    {
        this.strength=strength;
    }
}

class Monster implements ISaveable{
    String name;
    int hitPoints;
    int strength;
    public Monster(String name, int hitPoints, int strength)
    {
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
    }

    @Override
    public ArrayList<String> write()
    {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        return values;
    }
    @Override
    public void read(List<String> savedValues)
    {
        if(savedValues==null || savedValues.size()<0)
            return;
        else
        {
            // store the values in the list
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }
    @Override
    public String toString()
    {
        return "Monster{name='"+this.name+"', hitPoints="+
        this.hitPoints+", strength="+this.strength+"}";
    }
    // getter methods
    public String getName()
    {
        return this.name;
    }
    public int getHitPoints()
    {
        return this.hitPoints;
    }
    public int getStrength()
    {
        return this.strength;
    }
}

public class Game{
    public static void main(String args[])
    {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);

        System.out.println(tim);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        saveObject(werewolf);
        readValues();
    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        scanner.close();
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}

