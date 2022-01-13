package c_Oops;
// ques: Write down a code to help a company called Bill's Burgers manage the process of selling their hamburgers.

//BASE class
class Hamburger{
    String name;
    String meat;
    double price;
    String breadRollType;

    String addition1Name;
    double addition1Price=0;
    String addition2Name;
    double addition2Price=0;
    String addition3Name;
    double addition3Price=0;
    String addition4Name;
    double addition4Price=0;

    public Hamburger(String name, String meat, double price, String breadRollString)
    {
        this.name=name;
        this.meat=meat;
        this.price=price;
        this.breadRollType=breadRollString;
        System.out.println(name+" hamburger on a "+breadRollString+" roll with "+meat+", price is "+price);
    }
    public void addHamburgerAddition1(String addition1Name,double addition1Price)
    {
        this.addition1Name=addition1Name;
        this.addition1Price=this.addition1Price+addition1Price;
        System.out.println("Added "+addition1Name+" for an extra "+ addition1Price);
    }
    public void addHamburgerAddition2(String addition2Name,double addition2Price)
    {
        this.addition2Name=addition2Name;
        this.addition2Price=this.addition2Price+addition2Price;
        System.out.println("Added "+addition2Name+" for an extra "+ addition2Price);
    }
    public void addHamburgerAddition3(String addition3Name,double addition3Price)
    {
        this.addition3Name=addition3Name;
        this.addition3Price=this.addition3Price+addition3Price;
        System.out.println("Added "+addition3Name+" for an extra "+ addition3Price);
    }
    public void addHamburgerAddition4(String addition4Name,double addition4Price)
    {
        this.addition4Name=addition4Name;
        this.addition4Price=this.addition4Price+addition4Price;
        System.out.println("Added "+addition4Name+" for an extra "+ addition1Price);
    }
    public double itemizeHamburger()
    {
        return this.price+this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price;
    }
}

class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
    }
    public double itemizeHamburger()
    {
        return this.price+this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price;
    }
}

class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price=0;
    private String healthyExtra2Name;
    private double healthyExtra2Price=0;
    public HealthyBurger(String meat, double price)
    {
        super("Healthy", meat, price,"Brown");
    }
    
    public void addHealthyAddition1(String addition1Name,double addition1Price)
    {
        this.healthyExtra1Name=addition1Name;
        this.healthyExtra1Price=this.healthyExtra1Price+addition1Price;
        System.out.println("Added "+addition1Name+" for an extra "+ addition1Price);
    }
    public void addHealthyAddition2(String addition2Name,double addition2Price)
    {
        this.healthyExtra2Name=addition2Name;
        this.healthyExtra2Price=this.healthyExtra2Price+addition2Price;
        System.out.println("Added "+addition2Name+" for an extra "+ addition2Price);
    }
    public double itemizeHamburger()
    {
        return this.price+this.healthyExtra1Price+this.healthyExtra2Price+this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price;
    }
}

public class BillBurger {
    public static void main(String args[])
    {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

    }
}
